package com.example.controller;



import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Donhang;
import com.example.repository.DonhangRepository;





@RestController
@RequestMapping("/donhang")
public class DonhangController {

    @Autowired
   DonhangRepository donhangRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public java.util.List<Donhang> getAllDonhangs() {
//      return donhangRepository.findAll();
//    }
//    
//    @RequestMapping(value="/timkiem/{ten}",method = RequestMethod.GET)
//    public Khachhang showKhachhang(@PathVariable String ten){
//        return khachhangRepository.findOneByTen(ten);
//    }
    @RequestMapping(value="/hoalan/all" , method=RequestMethod.GET)
    public @ResponseBody List<Donhang> fetchResult(@RequestParam("donhang") @DateTimeFormat(pattern="yyyy-MM-dd") Donhang donhang) {
		return donhangRepository.findAll();
        //Content goes here
    }



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Donhang donhang) {
       donhangRepository.save(donhang);
    }

    @RequestMapping(value = "/{id}") 
    public Donhang read(@PathVariable String id) {
        return donhangRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Donhang donhang) {
        donhangRepository.save(donhang);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        donhangRepository.delete(id); 
    }

}