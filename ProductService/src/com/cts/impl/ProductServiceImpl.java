package com.cts.impl;

import java.util.ArrayList;

import javax.jws.WebService;

import com.cts.pro.Product;
import com.cts.service.ProductService;

@WebService(endpointInterface="com.cts.service.ProductService")
public class ProductServiceImpl implements ProductService{
	 ArrayList<Product>pList=new ArrayList<Product>();
	 
	public ProductServiceImpl() {
		pList.add(new Product(1,"HD",3000));
		pList.add(new Product(2,"Mouse",300));
		pList.add(new Product(3,"Keyboard",2000));
	}

	@Override
	public Product getProductById(int pId) {
		//System.out.println(pList);
		for(Product p:pList) {
			if(p.getpId()==pId) {
				return p;
			}
		}
		return null;
	}
 
}
