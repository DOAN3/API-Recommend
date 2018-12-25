package com.hoalan.api.nhacungcap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/nhacungcap")
public class NhacungcapController {

    @Autowired
   NhacungcapRepository nhacungcapRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcanhacungcap",method = RequestMethod.GET)
    public java.util.List<Nhacungcap> getAllNhacungcaps() {
      return nhacungcapRepository.findAll();
    }
    


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Nhacungcap nhacungcap) {
    	nhacungcapRepository.save(nhacungcap);
    }

    @RequestMapping(value = "/{id}") 
    public Nhacungcap read(@PathVariable String id) {
        return nhacungcapRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Nhacungcap nhacungcap) {
    	nhacungcapRepository.save(nhacungcap);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	nhacungcapRepository.delete(id); 
    }

}