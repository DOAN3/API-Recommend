package com.hoalan.api.service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


import com.hoalan.api.model.Nhacnho;
import com.hoalan.api.model.Nhacnhos;







@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "nhacnho")
@Path("/nhacnho")

public class NhacnhoRestService {
	private static Map<Integer, Nhacnho> INMEMORYDB = new HashMap<>();
	static {
		Nhacnho nhacnho1 = new 	Nhacnho();
		nhacnho1.setId(1);
		nhacnho1.setThongtinkhachhang("vhvv");

		INMEMORYDB.put(nhacnho1.getId(), nhacnho1);
		}
	
	@GET
	@Produces("application/json")
	public Nhacnhos getAllNhacnhos() {
		Nhacnhos nhacnho = new Nhacnhos();
		nhacnho.setNhacnhos(new ArrayList<>(INMEMORYDB.values()));
		return nhacnho;
		
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getLoaisanphamById(@PathParam("Id") int Id) throws URISyntaxException {
		Nhacnho nhacnho = INMEMORYDB.get(Id);
		if (nhacnho == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(nhacnho).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createChitietdonhang(Nhacnho nhacnho) throws URISyntaxException {
		if (nhacnho.getThongtinkhachhang() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		nhacnho.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(nhacnho.getId(), nhacnho);
		return Response.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateNhacnho(@PathParam("Id") int Id, Nhacnho nhacnho) throws URISyntaxException {
		Nhacnho temp = INMEMORYDB.get(Id);
		if (nhacnho == null) {
			return Response.status(404).build();
		}
		temp.setThongtinkhachhang(nhacnho.getThongtinkhachhang());
		
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteNhacnho(@PathParam("Id") int Id) throws URISyntaxException {
		Nhacnho nhacnho = INMEMORYDB.get(Id);
		if (nhacnho != null) {
			INMEMORYDB.remove(nhacnho.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}

		