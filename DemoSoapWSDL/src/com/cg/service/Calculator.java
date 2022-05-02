package com.cg.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface Calculator {
	int add(int x,int y);
	int subtract(int x,int y);
}
