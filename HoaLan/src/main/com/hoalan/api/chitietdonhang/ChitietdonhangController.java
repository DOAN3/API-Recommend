package com.hoalan.api.chitietdonhang;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/chitietdonhang")
public class ChitietdonhangController {

    @Autowired
    ChitietdonhangRepository chitietdonhangRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcachitietdonhang",method = RequestMethod.GET)
    public java.util.List<Chitietdonhang> getAllThanhtoans() {
      return chitietdonhangRepository.findAll();
    }
    
//    @RequestMapping(value="/timkiem/{ten}",method = RequestMethod.GET)
//    public Chitietdonhang show(@PathVariable String ten){
//        return chitietdonhangRepository.findOneByTen(ten);
//    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Chitietdonhang chitietdonhang) {
    	chitietdonhangRepository.save(chitietdonhang);
    }

    @RequestMapping(value = "/{id}") 
    public Chitietdonhang read(@PathVariable String id) {
        return chitietdonhangRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Chitietdonhang chitietdonhang) {
    	chitietdonhangRepository.save(chitietdonhang);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	chitietdonhangRepository.delete(id); 
    }

}