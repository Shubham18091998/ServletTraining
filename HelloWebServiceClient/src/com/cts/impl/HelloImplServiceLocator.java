/**
 * HelloImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cts.impl;

public class HelloImplServiceLocator extends org.apache.axis.client.Service implements com.cts.impl.HelloImplService {

    public HelloImplServiceLocator() {
    }


    public HelloImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloImpl
    private java.lang.String HelloImpl_address = "http://localhost:8090/HelloWebService/services/HelloImpl";

    public java.lang.String getHelloImplAddress() {
        return HelloImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloImplWSDDServiceName = "HelloImpl";

    public java.lang.String getHelloImplWSDDServiceName() {
        return HelloImplWSDDServiceName;
    }

    public void setHelloImplWSDDServiceName(java.lang.String name) {
        HelloImplWSDDServiceName = name;
    }

    public com.cts.impl.HelloImpl getHelloImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloImpl(endpoint);
    }

    public com.cts.impl.HelloImpl getHelloImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cts.impl.HelloImplSoapBindingStub _stub = new com.cts.impl.HelloImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloImplEndpointAddress(java.lang.String address) {
        HelloImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cts.impl.HelloImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cts.impl.HelloImplSoapBindingStub _stub = new com.cts.impl.HelloImplSoapBindingStub(new java.net.URL(HelloImpl_address), this);
                _stub.setPortName(getHelloImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloImpl".equals(inputPortName)) {
            return getHelloImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.cts.com", "HelloImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.cts.com", "HelloImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloImpl".equals(portName)) {
            setHelloImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
