package com.cg.publish;

import javax.xml.ws.Endpoint;

import com.cg.impl.CalculatorImpl;

public class CalculatorPublisher {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:9002/calservice", new CalculatorImpl());
		System.out.println("Started Service");
	}
}
