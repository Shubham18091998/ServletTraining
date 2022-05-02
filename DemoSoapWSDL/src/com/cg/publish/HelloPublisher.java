package com.cg.publish;

import javax.xml.ws.Endpoint;

import com.cg.impl.HelloImpl;

public class HelloPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/hservice", new HelloImpl());
		System.out.println("Done");
		//run this class as Java Application.
		//go to browser and http://localhost:9001/hservice?wsdl
	}

}
