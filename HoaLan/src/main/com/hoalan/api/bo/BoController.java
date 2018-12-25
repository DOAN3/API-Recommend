package com.hoalan.api.bo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/bo")
public class BoController {

    @Autowired
   BoRepository boRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcaho",method = RequestMethod.GET)
    public java.util.List<Bo> getAllBo() {
      return boRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Bo bo) {
    	boRepository.save(bo);
    }

    @RequestMapping(value = "/{id}") 
    public Bo read(@PathVariable String id) {
        return boRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Bo bo) {
    	boRepository.save(bo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	boRepository.delete(id); 
    }

}