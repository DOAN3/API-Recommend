package com.hoalan.api.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.hoalan.api.service.DonhangRestService;
import com.hoalan.api.service.HotroRestService;
import com.hoalan.api.service.KhachhangRestService;
import com.hoalan.api.service.NhanvienRestService;
import com.hoalan.api.service.UserRestService;
import com.hoalan.api.service.ThanhtoanRestService;
import com.hoalan.api.service.ChitietdonhangRestService;
import com.hoalan.api.service.LoaisanphamRestService;
import com.hoalan.api.service.DanhgiaRestService;
import com.hoalan.api.service.NhacnhoRestService;

@Component
public class HoalanConfig extends ResourceConfig {
public HoalanConfig() {
		register(UserRestService.class);
		register(ThanhtoanRestService.class);
		register(KhachhangRestService.class);
		register(DonhangRestService.class);
        register(HotroRestService.class);
        register(NhanvienRestService.class);
        register(ChitietdonhangRestService.class);
        register(LoaisanphamRestService.class);
        register(DanhgiaRestService.class);
        register(NhacnhoRestService.class);
		
		

   }
}