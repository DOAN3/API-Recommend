package com.hoalan.api.khihau;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/khihau")
public class KhihauController {

    @Autowired
   KhihauRepository khihauRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcakhihau",method = RequestMethod.GET)
    public java.util.List<Khihau> getAllKhihau() {
      return khihauRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Khihau khihau) {
    	khihauRepository.save(khihau);
    }

    @RequestMapping(value = "/{id}") 
    public Khihau read(@PathVariable String id) {
        return khihauRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Khihau khihau) {
    	khihauRepository.save(khihau);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	khihauRepository.delete(id); 
    }

}