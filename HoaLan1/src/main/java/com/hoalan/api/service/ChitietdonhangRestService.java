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
import com.hoalan.api.model.Chitietdonhangs;
import com.hoalan.api.model.Khachhang;







@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "chitietdonhang")
@Path("/chitietdonhang")

public class ChitietdonhangRestService {
	private static Map<Integer, Chitietdonhang> INMEMORYDB = new HashMap<>();
	static {
		Chitietdonhang chitietdonhang1 = new 	Chitietdonhang();
		chitietdonhang1.setId(1);
		chitietdonhang1.setSoluong(1);
		chitietdonhang1.setDonvitinh("vnd");
		INMEMORYDB.put(chitietdonhang1.getId(), chitietdonhang1);
		}
	@GET
	@Produces("application/json")
	public Chitietdonhangs getAllChitietdonhangs() {
		Chitietdonhangs chitietdonhang = new Chitietdonhangs();
		chitietdonhang.setChitietdonhangs(new ArrayList<>(INMEMORYDB.values()));
		return chitietdonhang;
		
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getChitietdonhangById(@PathParam("Id") int Id) throws URISyntaxException {
		Chitietdonhang chitietdonhang = INMEMORYDB.get(Id);
		if (chitietdonhang == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(chitietdonhang).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createChitietdonhang(Chitietdonhang chitietdonhang) throws URISyntaxException {
		if (chitietdonhang.getSoluong() == 0 || chitietdonhang.getDonvitinh() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		chitietdonhang.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(chitietdonhang.getId(), chitietdonhang);
		return Response.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateChitietdonhang(@PathParam("Id") int Id, Chitietdonhang chitietdonhang) throws URISyntaxException {
		Chitietdonhang temp = INMEMORYDB.get(Id);
		if (chitietdonhang == null) {
			return Response.status(404).build();
		}
		temp.setSoluong(chitietdonhang.getSoluong());
		temp.setDonvitinh(chitietdonhang.getDonvitinh());
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteChitietdonhang(@PathParam("Id") int Id) throws URISyntaxException {
		Chitietdonhang chitietdonhang = INMEMORYDB.get(Id);
		if (chitietdonhang != null) {
			INMEMORYDB.remove(chitietdonhang.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}

		