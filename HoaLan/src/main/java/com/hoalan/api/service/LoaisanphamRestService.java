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
import com.hoalan.api.model.Loaisanpham;
import com.hoalan.api.model.Loaisanphams;







@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "loaisanpham")
@Path("/loaisanpham")

public class LoaisanphamRestService {
	private static Map<Integer, Loaisanpham> INMEMORYDB = new HashMap<>();
	static {
		Loaisanpham loaisanpham1 = new 	Loaisanpham();
		loaisanpham1.setId(1);
		loaisanpham1.setTen("vhvv");
		loaisanpham1.setMota("vnd");
		INMEMORYDB.put(loaisanpham1.getId(), loaisanpham1);
		}
	@GET
	@Produces("application/json")
	public Loaisanphams getAllLoaisanphams() {
		Loaisanphams loaisanpham = new Loaisanphams();
		loaisanpham.setLoaisanphams(new ArrayList<>(INMEMORYDB.values()));
		return loaisanpham;
		
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getLoaisanphamById(@PathParam("Id") int Id) throws URISyntaxException {
		Loaisanpham loaisanpham = INMEMORYDB.get(Id);
		if (loaisanpham == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(loaisanpham).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createChitietdonhang(Loaisanpham loaisanpham) throws URISyntaxException {
		if (loaisanpham.getTen() == null || loaisanpham.getMota() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		loaisanpham.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(loaisanpham.getId(), loaisanpham);
		return Response.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateLoaisanpham(@PathParam("Id") int Id, Loaisanpham loaisanpham) throws URISyntaxException {
		Loaisanpham temp = INMEMORYDB.get(Id);
		if (loaisanpham == null) {
			return Response.status(404).build();
		}
		temp.setTen(loaisanpham.getTen());
		temp.setMota(loaisanpham.getMota());
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteChitietdonhang(@PathParam("Id") int Id) throws URISyntaxException {
		Loaisanpham loaisanpham = INMEMORYDB.get(Id);
		if (loaisanpham != null) {
			INMEMORYDB.remove(loaisanpham.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}

		