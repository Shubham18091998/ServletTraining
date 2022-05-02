package com.cts.client;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.cts.dto.User;
import com.cts.ws.UserService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class UserClient {
	static final String MAIN_Url="http://localhost:8090/DemoRESTFulWS";
	/*public static void main(String[] args) {
		Client client=Client.create();
		WebResource wr=client.resource(MAIN_Url);
		String data=wr.path("rest").path("userservice").path("users").accept(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(data);
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			Map<String,List<User>>userMap=objectMapper.readValue(data, new TypeReference<Map<String,List<User>>>(){});
			List<User> aList=userMap.get("user");
			for(User user:aList) {
				System.out.println(user.getUsername()+" "+user.getPassword());
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	
	public static void delete(String username) {
		Client client=Client.create();
		WebResource wr=null;
		ClientResponse respo=null;
		try{
			wr= client.resource(MAIN_Url);
			//System.out.println("test msg");
			respo=wr.path("rest").path("userservice").path("delete").path(username).delete(ClientResponse.class);
			System.out.println(respo.getStatus()+" "+respo.getEntity(String.class));
			//String msg= wr.path("rest").path("userservice").path("delete").path(username).delete(String.class);
			//System.out.println(msg);
		}catch(com.sun.jersey.api.client.UniformInterfaceException e) {
			e.printStackTrace();

		}
	}
	public static void main(String[] args) {
		delete("Sunita");
	}



}
