/**
 * BundlePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.bundle;

public interface BundlePortType extends java.rmi.Remote {
    public com.xius.xbus.messages.billing.bundle.ManageBundleResponse manageBundle(com.xius.xbus.messages.billing.bundle.ManageBundleRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName;
    public com.xius.xbus.messages.billing.bundle.GetBucketsResponse getBuckets(com.xius.xbus.messages.billing.bundle.GetBucketsRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName;
    public com.xius.xbus.messages.billing.bundle.GetBundlesResponse getBundles(com.xius.xbus.messages.billing.bundle.GetBundlesRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName;
    public com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse getBundleDtl(com.xius.xbus.messages.billing.bundle.GetBundleDtlRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName;
    public com.xius.xbus.messages.billing.bundle.GiftBundlesResponse giftBundles(com.xius.xbus.messages.billing.bundle.GiftBundlesRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName;
}
