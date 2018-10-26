
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
import com.hoalan.api.model.Thanhtoan;
import com.hoalan.api.model.Thanhtoans;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "thanhtoan")
@Path("/thanhtoan")
public class ThanhtoanRestService {
	private static Map<Integer, Thanhtoan> INMEMORYDB = new HashMap<>();
	static {
		Thanhtoan thanhtoan1 = new Thanhtoan();
		thanhtoan1.setId(1);
		thanhtoan1.setHinhthuc("Pamela");
		thanhtoan1.setGhichu("Smith");

	
		
		INMEMORYDB.put(thanhtoan1.getId(), thanhtoan1);
		
	}


	@GET
	@Produces("application/json")
	public Thanhtoans getAllThanhtoans() {
		Thanhtoans thanhtoan = new Thanhtoans();
		thanhtoan.setThanhtoans(new ArrayList<>(INMEMORYDB.values()));
		return thanhtoan;
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getThanhtoanById(@PathParam("Id") int Id) throws URISyntaxException {
		Thanhtoan thanhtoan = INMEMORYDB.get(Id);
		if (thanhtoan == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(thanhtoan).build();
	}

@POST
@Consumes("application/json")
@Path("/create")
public Response createUser(Thanhtoan thanhtoan) throws URISyntaxException {
	if (thanhtoan.getHinhthuc() == null || thanhtoan.getGhichu() == null ) {
		return Response.status(400).entity("Please provide all mandatory inputs").build();
	}
	thanhtoan.setId(INMEMORYDB.values().size() + 1);
	INMEMORYDB.put(thanhtoan.getId(), thanhtoan);
	return Response.status(201).build();
}
@PUT
@Path("/update/{Id}")
@Consumes("application/json")
@Produces("application/json")
public Response updateThanhtoan(@PathParam("Id") int Id, Thanhtoan thanhtoan) throws URISyntaxException {
	Thanhtoan temp = INMEMORYDB.get(Id);
	if (thanhtoan == null) {
		return Response.status(404).build();
	}
	temp.setHinhthuc(thanhtoan.getHinhthuc());
	temp.setGhichu(thanhtoan.getGhichu());
	
	INMEMORYDB.put(temp.getId(), temp);
	return Response.status(200).entity(temp).build();
}
@DELETE
@Path("/delete/{Id}")
public Response deleteThanhtoan(@PathParam("Id") int Id) throws URISyntaxException {
	Thanhtoan thanhtoan = INMEMORYDB.get(Id);
	if (thanhtoan != null) {
		INMEMORYDB.remove(thanhtoan.getId());
		return Response.status(200).build();
	}
	return Response.status(404).build();
}

}