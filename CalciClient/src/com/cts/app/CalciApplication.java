package com.cts.app;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cg.impl.Calculator;

public class CalciApplication {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://localhost:9002/calservice");
			QName qName=new QName("http://impl.cg.com/","CalculatorImplService");
			Service service=Service.create(url,qName);
			Calculator cal=service.getPort(Calculator.class);
			System.out.println(cal.add(123, 23));
			System.out.println(cal.subtract(23, 2));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
