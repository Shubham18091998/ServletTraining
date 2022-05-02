package com.cg.impl;

import javax.jws.WebService;

import com.cg.service.Calculator;
@WebService(endpointInterface="com.cg.service.Calculator")
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int subtract(int x, int y) {
		return x-y;
	}

}
