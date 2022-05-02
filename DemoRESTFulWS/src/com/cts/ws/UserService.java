package com.cts.ws;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cts.dao.UserDao;
import com.cts.dao.UserDaoImpl;
import com.cts.dto.User;

@Path("/userservice")
public class UserService {

	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_XML)
	public User create(@FormParam("username") String username,@FormParam("password") String password) {
		UserDao userDao=new UserDaoImpl();
		User user=new User(username,password);
		userDao.addRecord(user);
		return user;	
	}
	
	@POST
	@Path("/user")
	@Produces(MediaType.TEXT_XML)
	public User read(@FormParam("username") String username) {
		UserDao userDao=new UserDaoImpl();
		User user=userDao.getUser(username);
		return user;	
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.TEXT_XML)
	public User update(@FormParam("username") String username,@FormParam("password") String password) {
		UserDao userDao=new UserDaoImpl();
		User user=new User(username,password);
		userDao.updateRecord(user);
		return user;	
	}
	
	/*@POST
	@Path("/delete")
	public String delete(@FormParam("username") String username,@FormParam("password") String password) {
		UserDao userDao=new UserDaoImpl();
		User user=new User(username,password);
		boolean res=userDao.deleteRecord(user);
		if (res==true){
			return "Record deleted";	
		}
		else {
			return "Record not deleted";
		}
	}*/
	
	@Path("/delete/{username}")
	@DELETE
	public static Response delete(@PathParam("username") String uname) {
		System.out.println("service called ");
		UserDao userDao=new UserDaoImpl();
		String result=null;
		int statusCode=0;
		if(userDao.deleteRecord(uname)) {
			result="User deleted: "+uname;
			statusCode=200;
		}else {
			result="User not deleted";
			statusCode=500;
		}
		return Response.status(statusCode).entity(result).build();
	}
	
	
	@GET
	@Path("/users")
	//@Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User>getAllUserRecords(){
		UserDao userDao=new UserDaoImpl();
		return userDao.getAllUser();
	}
}
