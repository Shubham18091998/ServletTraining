/**
 * HelloImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.impl;

public interface HelloImplService extends javax.xml.rpc.Service {
    public java.lang.String getHelloImplAddress();

    public com.cts.impl.HelloImpl getHelloImpl() throws javax.xml.rpc.ServiceException;

    public com.cts.impl.HelloImpl getHelloImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
