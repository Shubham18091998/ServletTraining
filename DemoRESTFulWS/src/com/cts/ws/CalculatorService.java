package com.cts.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/calculator")
public class CalculatorService {
	
	@Path("/add")
	@POST
	public String add(@FormParam("num1") int num1,@FormParam("num2") int num2) {
		return "Result="+(num1+num2);
	}
	
	@Path("/subtract")
	@POST
	public String subtract(@FormParam("num1") int num1,@FormParam("num2") int num2) {
		return "Result="+(num1-num2);
	}
	
	@Path("/multiply")
	@POST
	public String multiply(@FormParam("num1") int num1,@FormParam("num2") int num2) {
		return "Result="+(num1*num2);
	}
	
	@Path("/divide")
	@POST
	public String divide(@FormParam("num1") int num1,@FormParam("num2") int num2) {
		return "Result="+(num1/num2);
	}
}
