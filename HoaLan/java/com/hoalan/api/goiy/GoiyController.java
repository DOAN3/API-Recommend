package com.hoalan.api.goiy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/goiy")
public class GoiyController {

    @Autowired
   GoiyRepository goiyRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcadanhgia",method = RequestMethod.GET)
    public java.util.List<Goiy> getAllGoiys() {
      return goiyRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Goiy goiy) {
    	goiyRepository.save(goiy);
    }

    @RequestMapping(value = "/{id}") 
    public Goiy read(@PathVariable String id) {
        return goiyRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Goiy goiy) {
    	goiyRepository.save(goiy);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	goiyRepository.delete(id); 
    }

}