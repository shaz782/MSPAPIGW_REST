package com.xius.rmsp.utilities;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

@Configuration
@Component
public class Utility {
	private static final Logger LOGGER = LogManager.getLogger(Utility.class);
	
    @Autowired
    private  Environment env;

    public String getProperty(String pPropertyKey) {
        return env.getProperty(pPropertyKey);
    }
    
    
    public Date stringToDate(String inDate,String format) {
    	 String dateInString = inDate;
    	 Date date=null; 
		try {
			date = new SimpleDateFormat(format).parse(dateInString);
		} catch (ParseException e) {
			if(LOGGER.isErrorEnabled()) {
				LOGGER.error("stringToDate convertion Exception "+e);
			}
		}
    return date;
    }
    
    
    public String DateToString(Date inDate,String format) {
    	Format  formatter = new SimpleDateFormat(format);
   	 	return formatter.format(inDate);
   }
    
    public String stringFromateChng(String inDate,String sourceformat,String destformat) {
    	Date date=null;
		try {
			date = new SimpleDateFormat(sourceformat).parse(inDate);
			
		} catch (ParseException e) {
			if(LOGGER.isErrorEnabled()) {
				LOGGER.error("stringFromateChng convertion Exception "+e);
				return null;
			}
		}
		return new SimpleDateFormat(destformat).format(date);
   }
   
	public List<String> getCredintials(String netId) {
		
		String[] value_array = null;
		Map<String, String> map_string = new HashMap<>();
		List<String> credentialsList = null;
		String value = null;
		String regex = netId + "#";
		
		value=env.getProperty("notify.loginDetails");
		if(value==null && netId!=null) {
			LOGGER.error("notify.loginDetails Not found in properties. ");
		}
		else if (value!=null && value.contains(regex)) {
			value_array = value.split(regex);
			String[] value_of_at = value_array[1].split("@");

			map_string.put("value_of_at_split", value_of_at[0]);

			String[] final_value = map_string.get("value_of_at_split").split(":");

			credentialsList = new ArrayList<>();
			credentialsList.add(0, netId);
			credentialsList.add(1, final_value[0]); //userName
			credentialsList.add(2, final_value[1]); //password

		} else {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("carrierId " + netId + "is Not found");
			}
		}
		return credentialsList;
	}
	
	public SOAPHeaderElement getIBAHeader(CommonHeaders headers) {
		SOAPHeaderElement header = null;
		try {

			header = new SOAPHeaderElement("http://billing.xius.com/common/header/HeaderDetails.xsd", "messageHeader");
			header.setActor(null);
			header.setPrefix("head");
			SOAPElement cNode;
			SOAPElement node1;
			SOAPElement node2;
			SOAPElement node3;
			SOAPElement node4;
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode("1");
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(headers.getCarrierID());
			node3 = cNode.addChildElement("userId");
			node3.addTextNode(headers.getUserName());
			node4 = cNode.addChildElement("password");
			node4.addTextNode(headers.getUserPassword());
		} catch (SOAPException se) {
			LOGGER.error("IBA-getHeader-SOAPException" + se.fillInStackTrace().toString());
		}
		return header;
	}
	
	public String getIBATimeOut() {
		String timeOut = env.getProperty("iba.timeOut");
		if (timeOut == null || timeOut.equals("")) {
			LOGGER.error("iba-timeOut is Null");
		}
		return timeOut;
	}
	
	
	public SOAPHeaderElement getSelfcareHeader(CommonHeaders headers) {
		SOAPHeaderElement header = null;
		try {

			header = new SOAPHeaderElement("http://scare.xbus.xiusbcgi.com/common/header/HeaderDetails.xsd", "messageHeader");
			header.setActor(null);
			header.setPrefix("head");
			SOAPElement cNode;
			SOAPElement node1;
			SOAPElement node2;
			SOAPElement node3;
			SOAPElement node4;
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode("1");
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(headers.getCarrierID());
			node3 = cNode.addChildElement("userId");
			node3.addTextNode(headers.getUserName());
			node4 = cNode.addChildElement("password");
			node4.addTextNode(headers.getUserPassword());
		} catch (SOAPException se) {
			LOGGER.error("Selfcare-getHeader-SOAPException" + se.fillInStackTrace().toString());
		}
		return header;
	}
	
	public String getSelfcareTimeOut() {
		String timeOut = env.getProperty("selfcare.timeOut");
		if (timeOut == null || timeOut.equals("")) {
			LOGGER.error("selfcare.timeOut is Null");
		}
		return timeOut;
	}
	
	public String getxBusTimeOut() {
		String timeOut = env.getProperty("xBus.timeOut");
		if (timeOut == null || timeOut.equals("")) {
			LOGGER.error("xBus.timeOut is Null");
		}
		return timeOut;
	}
	
	public void dateComparision(String d1,String d2,String format) throws  MSPAPIGWExceptions{
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date1 = null;
        Date date2 = null;
        
		try {
			date1 = sdf.parse(d1);
			date2 = sdf.parse(d2);
		} catch (ParseException e) {
			LOGGER.error("ParseException "+e);
			throw new MSPAPIGWExceptions("64442", "Invalid inputs");
		}
        
        if(date1.after(date2)){
        	throw new MSPAPIGWExceptions("96410", "Invalid dates");
        }
        
	}
	
	public long getDifferenceDays(Date d1, Date d2) {
	    long diff = (d2.getTime() - d1.getTime())+0l;
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	
	public SOAPHeaderElement getSMFHeader(CommonHeaders headers) {
		SOAPHeaderElement header = null;
		try {

			header = new SOAPHeaderElement("http://smf.agent.xius.com/common/header/HeaderDetails.xsd", "messageHeader");
			header.setActor(null);
			header.setPrefix("head");
			SOAPElement cNode;
			SOAPElement node1;
			SOAPElement node2;
			SOAPElement node3;
			SOAPElement node4;
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode("1");
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(headers.getCarrierID());
			node3 = cNode.addChildElement("userId");
			node3.addTextNode(headers.getUserName());
			node4 = cNode.addChildElement("password");
			node4.addTextNode(headers.getUserPassword());
		} catch (SOAPException se) {
			LOGGER.error("Utility-getSMFHeader-SOAPException" + se.fillInStackTrace().toString());
		}
		return header;
	}
	
	public String getSMFTimeOut() {
		String timeOut = env.getProperty("smf.timeOut");
		if (timeOut == null || timeOut.equals("")) {
			LOGGER.error("smf-timeOut is Null");
		}
		return timeOut;
	}

}
