package com.cts.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cts.impl.ProductService;

public class ProductApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		int id=sc.nextInt();
		URL url;
		try {
			url = new URL("http://localhost:9003/prodservice?wsdl");
			QName qName=new QName("http://impl.cts.com/","ProductServiceImplService");
			Service service=Service.create(url,qName);
			ProductService prod=service.getPort(ProductService.class);
			System.out.println("Name:"+(prod.getProductById(id)).getName());
			System.out.println("Price:"+(prod.getProductById(id)).getPrice());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		

	}

}
