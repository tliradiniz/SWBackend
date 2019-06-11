package com.xseed.rest;
 

import java.awt.List;
import java.lang.reflect.Field;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.xseed.model.Funcionario;
import com.xseed.model.Textbox;

import jdk.nashorn.internal.parser.JSONParser;
import net.projectmonkey.object.mapper.ObjectMapper;

 
@javax.inject.Singleton
@Path("Person")
public class RESTapi{
	
	Funcionario t1 = new Funcionario(); 
	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response doGet(Class<?> tb) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
//		Object tb1 = tb.newInstance();
//		Funcionario t1 = new Funcionario(); 
//		System.out.println("A CLASSE QUE CHEGOU FOI :"+tb);
//		System.out.println("CHEGOU AQUI");
//		 for(Field f : t1.getClass().getFields()) {
//			 for(Field t : tb.getFields()) {
//				 System.out.println(tb1);
//				 System.out.println(t1);
//				 System.out.println(t.get(tb1));
//				 System.out.println("VALOR TB : "+t.get(tb1));
//				 
//			 }
//			 System.out.println("VALOR T1 : "+f.get(t1));
//			 System.out.println(tb.getClass());
//			 System.out.println("NOME REAL DA CLASSE!"+tb);
//			 System.out.println(t1.getClass());
//		 }
//		return Response.ok().entity("Com sucesso").build();
//	}
//	
	
//	public void parseJson(String tb) {
//		
//		Gson gson = new Gson();
//		Funcionario f1 = gson.fromJson(tb, Funcionario.class);
//		System.out.println(f1+"-------------------------");
//	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response find(String tb) throws IllegalArgumentException, IllegalAccessException{
		System.out.println("STRING QUE VEIO!!! ------"+tb);
//		parseJson(tb);
		Gson g = new Gson();
		Funcionario p = g.fromJson(tb, Funcionario.class);
		for(Field f : t1.getClass().getFields()) {
			f.set(t1, f.get(p));
				 
			 }
		return Response.ok().entity("Com sucesso").build();
	}
	
	
	@GET
	@Produces({ "application/json" })
	public Funcionario doPost() {
		return new Funcionario(t1.getMatricula(), t1.getNome(), t1.getSalario());
	}
	
	
	
	
	
			
			
			
			
			
//	public static <T> Response doGet(Class<T> obj) throws Exception, IllegalAccessException {
//		Object ob1 = new Object();
//		ob1.getClass().forName(obj.getClass().getName());
//		for(Field f : obj.getClass().getFields()) {
//			for (Field g : ob1.getClass().getFields()) {
//				g.equals(f.get(obj));
//			}
//			
//			System.out.println(f.getGenericType() + ":" + f.getName() + "\n");
//			try {
//				System.out.println(f.get(obj));
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		return Response.ok().entity("Com sucesso").build();
//	}
	


//	public void getFields() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setFields() {
//		// TODO Auto-generated method stub
//		
//	}

	public void execute() {
		// TODO Auto-generated method stub
		
	}
}