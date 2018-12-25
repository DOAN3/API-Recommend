package com.hoalan.api.loaisanpham;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/loaisanpham")
public class LoaisanphamController {

    @Autowired
   LoaisanphamRepository loaisanphamRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatloaisanpham",method = RequestMethod.GET)
    public java.util.List<Loaisanpham> getAllLoaisanphams() {
      return loaisanphamRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Loaisanpham loaisanpham) {
       loaisanphamRepository.save(loaisanpham);
    }

    @RequestMapping(value = "/{id}") 
    public Loaisanpham read(@PathVariable String id) {
        return loaisanphamRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Loaisanpham loaisanpham) {
    	loaisanphamRepository.save(loaisanpham);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	loaisanphamRepository.delete(id); 
    }

}