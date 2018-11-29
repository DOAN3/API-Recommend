package com.hoalan.api.giaidoan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/giaidoan")
public class GiaidoanController {

    @Autowired
   GiaidoanRepository giaidoanRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcagiaidoan",method = RequestMethod.GET)
    public java.util.List<Giaidoan> getAllGiaidoans() {
      return giaidoanRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Giaidoan giaidoan) {
    	giaidoanRepository.save(giaidoan);
    }

    @RequestMapping(value = "/{id}") 
    public Giaidoan read(@PathVariable String id) {
        return giaidoanRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Giaidoan giaidoan) {
    	giaidoanRepository.save(giaidoan);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	giaidoanRepository.delete(id); 
    }

}