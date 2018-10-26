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

import com.hoalan.api.model.Donhang;
import com.hoalan.api.model.Donhangs;





@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "donhang")
@Path("/donhang")
public class DonhangRestService {
	private static Map<Integer, Donhang> INMEMORYDB = new HashMap<>();
	static {
		Donhang donhang1 = new 	Donhang();
		donhang1.setId(1);
		donhang1.setMaso(2);
		donhang1.setThoigian(null);
		donhang1.setDiachi("0967002097");
		donhang1.setTenhang("Trang@gmail.com");
		donhang1.setTongtien(1000);
		donhang1.setSoluong(2);
		

		
		
		
		INMEMORYDB.put(donhang1.getId(), donhang1);
		
	}


	@GET
	@Produces("application/json")
	public Donhangs getAllDonhangs() {
		Donhangs donhang = new Donhangs();
		donhang.setDonhangs(new ArrayList<>(INMEMORYDB.values()));
		return donhang;
	}

	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getDonhangById(@PathParam("Id") int Id) throws URISyntaxException {
		Donhang donhang = INMEMORYDB.get(Id);
		if (donhang == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(donhang).build();
	}

@POST
@Consumes("application/json")
@Path("/create")
public Response createUser(Donhang donhang) throws URISyntaxException {
	if (donhang.getMaso() == 0 || donhang.getThoigian() == null || donhang.getDiachi() == null || donhang.getTenhang() == null || donhang.getTongtien() == 0 || donhang.getSoluong() == 0) {
		return Response.status(400).entity("Please provide all mandatory inputs").build();
	}
	donhang.setId(INMEMORYDB.values().size() + 1);
	INMEMORYDB.put(donhang.getId(), donhang);
	return Response.status(201).build();
}
@PUT
@Path("/update/{Id}")
@Consumes("application/json")
@Produces("application/json")
public Response updateDonhang(@PathParam("Id") int Id, Donhang donhang) throws URISyntaxException {
	Donhang temp = INMEMORYDB.get(Id);
	if (donhang == null) {
		return Response.status(404).build();
	}
	temp.setMaso(donhang.getMaso());
	temp.setThoigian(donhang.getThoigian());
	temp.setDiachi(donhang.getDiachi());
	temp.setTenhang(donhang.getTenhang());
	temp.setTongtien(donhang.getTongtien());
	temp.setSoluong(donhang.getSoluong());
	INMEMORYDB.put(temp.getId(), temp);
	return Response.status(200).entity(temp).build();
}
@DELETE
@Path("/delete/{Id}")
public Response deleteDonhang(@PathParam("Id") int Id) throws URISyntaxException {
	Donhang donhang = INMEMORYDB.get(Id);
	if (donhang != null) {
		INMEMORYDB.remove(donhang.getId());
		return Response.status(200).build();
	}
	return Response.status(404).build();
}
}