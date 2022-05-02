package com.cts.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cg.service.Hello;

public class HelloClient {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://localhost:9001/hservice");
			//1st argument is the service URI
			//2nd argument is the service name published in the WSDL
			QName serviceName=new QName("http://impl.cg.com/","HelloImplService");
			Service service=Service.create(url,serviceName);
			//Extract the end point interface, the service "port".
			Hello hello=service.getPort(Hello.class);
			System.out.println(hello.sayHello());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
