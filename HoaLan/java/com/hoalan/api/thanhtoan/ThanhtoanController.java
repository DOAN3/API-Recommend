package com.hoalan.api.thanhtoan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/thanhtoan")
public class ThanhtoanController {

    @Autowired
   ThanhtoanRepository thanhtoanRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
    public java.util.List<Thanhtoan> getAllThanhtoans() {
      return thanhtoanRepository.findAll();
    }
    
//    @RequestMapping(value="/timkiem/{ten}",method = RequestMethod.GET)
//    public Thanhtoan show(@PathVariable String ten){
//        return thanhtoanRepository.findOneByTen(ten);
//    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Thanhtoan thanhtoan) {
       thanhtoanRepository.save(thanhtoan);
    }

    @RequestMapping(value = "/{id}") 
    public Thanhtoan read(@PathVariable String id) {
        return thanhtoanRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Thanhtoan thanhtoan) {
        thanhtoanRepository.save(thanhtoan);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        thanhtoanRepository.delete(id); 
    }

}