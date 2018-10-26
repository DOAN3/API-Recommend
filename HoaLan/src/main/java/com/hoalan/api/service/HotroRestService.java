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
import com.hoalan.api.model.Hotro;
import com.hoalan.api.model.Hotros;






@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "hotro")
@Path("/hotro")

public class HotroRestService {
	private static Map<Integer, Hotro> INMEMORYDB = new HashMap<>();
	static {
		Hotro hotro1 = new 	Hotro();
		hotro1.setId(1);
		hotro1.setNoidung("Trang");
		INMEMORYDB.put(hotro1.getId(), hotro1);
		}
	@GET
	@Produces("application/json")
	public Hotros getAllHotros() {
		Hotros hotro = new Hotros();
		hotro.setHotros(new ArrayList<>(INMEMORYDB.values()));
		return hotro;
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getHotroById(@PathParam("Id") int Id) throws URISyntaxException {
		Hotro hotro = INMEMORYDB.get(Id);
		if (hotro == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(hotro).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createUser(Hotro hotro) throws URISyntaxException {
		if (hotro.getNoidung() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		hotro.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(hotro.getId(), hotro);
		return Response.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateHotro(@PathParam("Id") int Id, Hotro hotro) throws URISyntaxException {
		Hotro temp = INMEMORYDB.get(Id);
		if (hotro == null) {
			return Response.status(404).build();
		}
		temp.setNoidung(hotro.getNoidung());
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteHotro(@PathParam("Id") int Id) throws URISyntaxException {
		Hotro hotro = INMEMORYDB.get(Id);
		if (hotro != null) {
			INMEMORYDB.remove(hotro.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}
