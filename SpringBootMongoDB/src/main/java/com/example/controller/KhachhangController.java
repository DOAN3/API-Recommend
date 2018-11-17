package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Khachhang;
import com.example.repository.KhachhangRepository;





@RestController
@RequestMapping("/khachhang")
public class KhachhangController {

    @Autowired
   KhachhangRepository khachhangRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
    public java.util.List<Khachhang> getAllKhachhangs() {
      return khachhangRepository.findAll();
    }
    
    @RequestMapping(value="/timkiem/{ten}",method = RequestMethod.GET)
    public Khachhang showKhachhang(@PathVariable String ten){
        return khachhangRepository.findOneByTen(ten);
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Khachhang khachhang) {
       khachhangRepository.save(khachhang);
    }

    @RequestMapping(value = "/{id}") 
    public Khachhang read(@PathVariable String id) {
        return khachhangRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Khachhang khachhang) {
        khachhangRepository.save(khachhang);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        khachhangRepository.delete(id); 
    }

}