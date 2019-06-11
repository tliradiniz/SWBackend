package com.xseed.rest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.ws.rs.core.Response;

import com.xseed.model.*;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			Teste ts = new Teste();
			ts.buscar("Funcionario");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	private void buscar(String stg) throws Exception {
		Object objClass = Class.forName("com.xseed.model."+stg).newInstance();
		RESTapi rp = new RESTapi();
//		rp.doGet(objClass.getClass());
		System.out.println("A CLASSE QUE FOI É: "+objClass.getClass());
		
		
		for (Method f: objClass.getClass().getDeclaredMethods()) {
			if(f.getName().contains("get")) {
				System.out.println("É UM GET");
			}
			if(f.getName().contains("set")) {
				System.out.println("É UM SET");
			}
			System.out.println(f.getName() + "\n");
			System.out.println(f.getGenericReturnType());
		}
	}

}
