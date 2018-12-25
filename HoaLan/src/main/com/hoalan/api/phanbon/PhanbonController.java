package com.hoalan.api.phanbon;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/phanbon")
public class PhanbonController {

    @Autowired
   PhanbonRepository phanbonRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcakho",method = RequestMethod.GET)
    public java.util.List<Phanbon> getAllPhanbons() {
      return phanbonRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Phanbon phanbon) {
       phanbonRepository.save(phanbon);
    }

    @RequestMapping(value = "/{id}") 
    public Phanbon read(@PathVariable String id) {
        return phanbonRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Phanbon phanbon) {
        phanbonRepository.save(phanbon);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        phanbonRepository.delete(id); 
    }

}