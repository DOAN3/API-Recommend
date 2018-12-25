package com.hoalan.api.kho;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/kho")
public class KhoController {

    @Autowired
   KhoRepository khoRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcakho",method = RequestMethod.GET)
    public java.util.List<Kho> getAllKhos() {
      return khoRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Kho kho) {
       khoRepository.save(kho);
    }

    @RequestMapping(value = "/{id}") 
    public Kho read(@PathVariable String id) {
        return khoRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Kho kho) {
        khoRepository.save(kho);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        khoRepository.delete(id); 
    }

}