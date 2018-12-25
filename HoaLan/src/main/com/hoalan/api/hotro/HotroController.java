package com.hoalan.api.hotro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/hotro")
public class HotroController {

    @Autowired
   HotroRepository hotroRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
    public java.util.List<Hotro> getAllHotros() {
      return hotroRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Hotro hotro) {
       hotroRepository.save(hotro);
    }

    @RequestMapping(value = "/{id}") 
    public Hotro read(@PathVariable String id) {
        return hotroRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Hotro hotro) {
        hotroRepository.save(hotro);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        hotroRepository.delete(id); 
    }

}