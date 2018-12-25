package com.hoalan.api.goiyphu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/goiyphu")
public class GoiyphuController {

    @Autowired
   GoiyphuRepository goiyphuRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatgoiyphu",method = RequestMethod.GET)
    public java.util.List<Goiyphu> getAllGoiyphus() {
      return goiyphuRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Goiyphu goiyphu) {
    	 goiyphuRepository.save(goiyphu);
    }

    @RequestMapping(value = "/{id}") 
    public Goiyphu read(@PathVariable String id) {
        return  goiyphuRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Goiyphu goiyphu) {
    	 goiyphuRepository.save(goiyphu);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	 goiyphuRepository.delete(id); 
    }

}