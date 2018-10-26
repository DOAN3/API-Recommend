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

import com.hoalan.api.model.Chitietdonhang;
import com.hoalan.api.model.Danhgia;
import com.hoalan.api.model.Danhgias;







@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "danhgia")
@Path("/danhgia")

public class DanhgiaRestService {
	private static Map<Integer, Danhgia> INMEMORYDB = new HashMap<>();
	static {
		Danhgia danhgia1 = new 	Danhgia();
		danhgia1.setId(1);
		danhgia1.setNoidung("h");
		
		INMEMORYDB.put(danhgia1.getId(), danhgia1);
		}
	@GET
	@Produces("application/json")
	public Danhgias getAllDanhgias() {
		Danhgias danhgia = new Danhgias();
		danhgia.setDanhgias(new ArrayList<>(INMEMORYDB.values()));
		return danhgia;
		
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getDanhgiaById(@PathParam("Id") int Id) throws URISyntaxException {
		Danhgia danhgia = INMEMORYDB.get(Id);
		if (danhgia == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(danhgia).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createChitietdonhang(Danhgia danhgia) throws URISyntaxException {
		if (danhgia.getNoidung() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		danhgia.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(danhgia.getId(), danhgia);
		return Response.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateDanhgia(@PathParam("Id") int Id, Danhgia danhgia) throws URISyntaxException {
		Danhgia temp = INMEMORYDB.get(Id);
		if (danhgia == null) {
			return Response.status(404).build();
		}
		temp.setNoidung(danhgia.getNoidung());
		
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteDanhgia(@PathParam("Id") int Id) throws URISyntaxException {
	Danhgia danhgia = INMEMORYDB.get(Id);
		if (danhgia != null) {
			INMEMORYDB.remove(danhgia.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}

		