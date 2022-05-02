package com.cts.impl;

public class HelloImplProxy implements com.cts.impl.HelloImpl {
  private String _endpoint = null;
  private com.cts.impl.HelloImpl helloImpl = null;
  
  public HelloImplProxy() {
    _initHelloImplProxy();
  }
  
  public HelloImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloImplProxy();
  }
  
  private void _initHelloImplProxy() {
    try {
      helloImpl = (new com.cts.impl.HelloImplServiceLocator()).getHelloImpl();
      if (helloImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloImpl != null)
      ((javax.xml.rpc.Stub)helloImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cts.impl.HelloImpl getHelloImpl() {
    if (helloImpl == null)
      _initHelloImplProxy();
    return helloImpl;
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (helloImpl == null)
      _initHelloImplProxy();
    return helloImpl.sayHello();
  }
  
  
}