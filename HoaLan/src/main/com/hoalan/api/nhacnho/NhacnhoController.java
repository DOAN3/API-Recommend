package com.hoalan.api.nhacnho;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/nhacnho")
public class NhacnhoController {

    @Autowired
   NhacnhoRepository nhacnhoRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcanhacnho",method = RequestMethod.GET)
    public java.util.List<Nhacnho> getAllNhacnhos() {
      return nhacnhoRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Nhacnho nhacnho) {
    	nhacnhoRepository.save(nhacnho);
    }

    @RequestMapping(value = "/{id}") 
    public Nhacnho read(@PathVariable String id) {
        return nhacnhoRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Nhacnho nhacnho) {
    	nhacnhoRepository.save(nhacnho);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        nhacnhoRepository.delete(id); 
    }

}