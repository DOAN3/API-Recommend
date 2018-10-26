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

import com.hoalan.api.model.Loaisanpham;
import com.hoalan.api.model.Nhanvien;
import com.hoalan.api.model.Nhanviens;






@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "nhanvien")
@Path("/nhanvien")

public class NhanvienRestService {
	private static Map<Integer, Nhanvien> INMEMORYDB = new HashMap<>();
	static {
		Nhanvien nhanvien1 = new 	Nhanvien();
		nhanvien1.setId(1);
		nhanvien1.setTen("Trang");
		nhanvien1.setChucvu("b");
		nhanvien1.setGioitinh("b");
		nhanvien1.setSodienthoai(1967002097);
		nhanvien1.setEmail("b");
		nhanvien1.setDiachi("b");
		INMEMORYDB.put(nhanvien1.getId(), nhanvien1);
		}
	@GET
	@Produces("application/json")
	public Nhanviens getAllHotros() {
		Nhanviens nhanvien = new Nhanviens();
		nhanvien.setNhanviens(new ArrayList<>(INMEMORYDB.values()));
		return nhanvien;
	}
	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getNhanvienById(@PathParam("Id") int Id) throws URISyntaxException {
		Nhanvien nhanvien = INMEMORYDB.get(Id);
		if (nhanvien == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(nhanvien).build();
	}
	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createNhanvien(Nhanvien nhanvien) throws URISyntaxException {
		if (nhanvien.getTen() == null || nhanvien.getChucvu() == null || nhanvien.getGioitinh() == null || nhanvien.getSodienthoai() == 0 || nhanvien.getEmail() == null || nhanvien.getDiachi() == null ) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		nhanvien.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(nhanvien.getId(), nhanvien);
		Response Save = null;
		return Save.status(201).build();
	}
	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateNhanvien(@PathParam("Id") int Id, Nhanvien nhanvien) throws URISyntaxException {
		Nhanvien temp = INMEMORYDB.get(Id);
		if (nhanvien == null) {
			return Response.status(404).build();
		}
		temp.setTen(nhanvien.getTen());
		temp.setChucvu(nhanvien.getChucvu());
		temp.setGioitinh(nhanvien.getGioitinh());
		temp.setSodienthoai(nhanvien.getSodienthoai());
		temp.setEmail(nhanvien.getEmail());
		temp.setDiachi(nhanvien.getDiachi());
		
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}
	@DELETE
	@Path("/delete/{Id}")
	public Response deleteNhanvien(@PathParam("Id") int Id) throws URISyntaxException {
		Nhanvien nhanvien = INMEMORYDB.get(Id);
		if (nhanvien != null) {
			INMEMORYDB.remove(nhanvien.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}

	}
