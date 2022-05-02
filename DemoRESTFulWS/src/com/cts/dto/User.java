package com.cts.dto;

import java.io.Serializable;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

@Produces("application/xml")
@XmlRootElement
public class User implements Serializable{
	private String username;
	private String password;
	public User() {
		super();
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
