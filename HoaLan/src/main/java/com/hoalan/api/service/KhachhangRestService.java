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

import com.hoalan.api.model.Khachhang;
import com.hoalan.api.model.Khachhangs;



@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "khachhang")
@Path("/khachhang")
public class KhachhangRestService {
	private static Map<Integer, Khachhang> INMEMORYDB = new HashMap<>();
	static {
		Khachhang khachhang1 = new 	Khachhang();
		khachhang1.setId(1);
		khachhang1.setTen("Trang");
		khachhang1.setGioitinh("Nữ");
		khachhang1.setSodienthoai(03545656565);
		khachhang1.setEmail("Trang@gmail.com");
		khachhang1.setDiachi("Bình thủy Cần Thơ");
		

		Khachhang khachhang2 = new 	Khachhang();
		khachhang2.setId(2);
		khachhang2.setTen("Nhân");
		khachhang2.setGioitinh("Nam");
		khachhang2.setSodienthoai(0123456703);
		khachhang2.setEmail("Nhan@gmail.com");
		khachhang2.setDiachi("Ninh Kiều Cần Thơ");
		
		
		INMEMORYDB.put(khachhang1.getId(), khachhang1);
		INMEMORYDB.put(khachhang2.getId(), khachhang2);
	}


	@GET
	@Produces("application/json")
	public Khachhangs getAllKhachhangs() {
		Khachhangs khachhang = new Khachhangs();
		khachhang.setKhachhangs(new ArrayList<>(INMEMORYDB.values()));
		return khachhang;
	}

	@GET
	@Path("/{Id}")
	@Produces("application/json")
	public Response getKhachhangById(@PathParam("Id") int Id) throws URISyntaxException {
		Khachhang khachhang = INMEMORYDB.get(Id);
		if (khachhang == null) {
			return Response.status(404).build();
		}
		return Response.status(200).entity(khachhang).build();
	}

	@POST
	@Consumes("application/json")
	@Path("/create")
	public Response createUser(Khachhang khachhang) throws URISyntaxException {
		if (khachhang.getTen() == null || khachhang.getGioitinh() == null || khachhang.getSodienthoai() == 0 || khachhang.getEmail() == null || khachhang.getDiachi() == null) {
			return Response.status(400).entity("Please provide all mandatory inputs").build();
		}
		khachhang.setId(INMEMORYDB.values().size() + 1);
		INMEMORYDB.put(khachhang.getId(), khachhang);
		return Response.status(201).build();
	}

	@PUT
	@Path("/update/{Id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateKhachhang(@PathParam("Id") int Id, Khachhang khachhang) throws URISyntaxException {
		Khachhang temp = INMEMORYDB.get(Id);
		if (khachhang == null) {
			return Response.status(404).build();
		}
		temp.setTen(khachhang.getTen());
		temp.setGioitinh(khachhang.getGioitinh());
		temp.setSodienthoai(khachhang.getSodienthoai());
		temp.setGioitinh(khachhang.getGioitinh());
		temp.setGioitinh(khachhang.getGioitinh());
		INMEMORYDB.put(temp.getId(), temp);
		return Response.status(200).entity(temp).build();
	}

	@DELETE
	@Path("/delete/{Id}")
	public Response deleteKhachhang(@PathParam("khachhangId") int khachhangId) throws URISyntaxException {
		Khachhang khachhang = INMEMORYDB.get(khachhangId);
		if (khachhang != null) {
			INMEMORYDB.remove(khachhang.getId());
			return Response.status(200).build();
		}
		return Response.status(404).build();
	}
}