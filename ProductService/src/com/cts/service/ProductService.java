package com.cts.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.cts.pro.Product;

@WebService
@SOAPBinding
public interface ProductService {
	Product getProductById(int pId);
}
