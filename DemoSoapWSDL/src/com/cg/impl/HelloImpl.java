package com.cg.impl;

import javax.jws.WebService;

import com.cg.service.Hello;
@WebService(endpointInterface="com.cg.service.Hello")
public class HelloImpl implements Hello{

	@Override
	public String sayHello() {
		return "Hello World";
	}

}
