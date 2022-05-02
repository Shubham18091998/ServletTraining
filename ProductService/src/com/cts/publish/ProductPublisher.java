package com.cts.publish;

import javax.xml.ws.Endpoint;

import com.cts.impl.ProductServiceImpl;

public class ProductPublisher {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:9003/prodservice", new ProductServiceImpl());
		System.out.println("Service started");
	}
}
