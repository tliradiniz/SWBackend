package com.genuitec.webclipse.example.rest;
 
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
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

import com.genuitec.webclipse.example.EntityManagerHelper;
import com.genuitec.webclipse.example.Person;
import com.genuitec.webclipse.example.Textbox;

 

@javax.inject.Singleton
@Path("Person")
public class RESTapi {
	Textbox t1 = new Textbox();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response find(Textbox tb) {
		
		 t1.setField(tb.getField());
		return Response.ok().entity("Com sucesso").build();
	}
	
	@GET
	@Produces({ "application/json" })
	public Textbox findAll() {
		return new Textbox(t1.getField());
	}
}