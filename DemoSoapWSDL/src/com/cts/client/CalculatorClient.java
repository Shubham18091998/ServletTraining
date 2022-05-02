package com.cts.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cg.service.Calculator;

public class CalculatorClient {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://localhost:9002/calservice");
			QName serviceName=new QName("http://impl.cg.com/","CalculatorImplService");
			Service service=Service.create(url,serviceName);
			Calculator calculate=service.getPort(Calculator.class);
			System.out.println(calculate.add(243, 56));
			System.out.println(calculate.subtract(500,25));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
