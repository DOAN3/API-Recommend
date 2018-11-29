package com.hoalan.api.chitietsanpham;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/chitietsanpham")
public class ChitietsanphamController {

    @Autowired
   ChitietsanphamRepository chitietsanphamRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcachitietsanpham",method = RequestMethod.GET)
    public java.util.List<Chitietsanpham> getAllKhos() {
      return chitietsanphamRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Chitietsanpham chitietsanpham) {
       chitietsanphamRepository.save(chitietsanpham);
    }

    @RequestMapping(value = "/{id}") 
    public Chitietsanpham read(@PathVariable String id) {
        return chitietsanphamRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Chitietsanpham chitietsanpham) {
        chitietsanphamRepository.save(chitietsanpham);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        chitietsanphamRepository.delete(id); 
    }

}