package com.cts.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	@GET
	@Path("/plain")
	public String sayHello() {
		return "Hello World";
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXml() {
	return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><msg>Hello World</msg>";
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml() {
	return "<html><body><h1>Hello World</h1></body></html>";
	}
	
}
