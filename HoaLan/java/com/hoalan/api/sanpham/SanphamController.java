package com.hoalan.api.sanpham;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/sanpham")
public class SanphamController {

    @Autowired
   SanphamRepository sanphamRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcasanpham",method = RequestMethod.GET)
    public java.util.List<Sanpham> getAllSanphams() {
      return sanphamRepository.findAll();
    }
    
//    @RequestMapping(value="/timkiemsanpham/{ten}",method = RequestMethod.GET)
//    public Sanpham show(@PathVariable String ten){
//        return sanphamRepository.findOneByTen(ten);
//    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Sanpham sanpham) {
       sanphamRepository.save(sanpham);
    }

    @RequestMapping(value = "/{id}") 
    public Sanpham read(@PathVariable long id) {
        return sanphamRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Sanpham sanpham) {
        sanphamRepository.save(sanpham);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable long id) {
        sanphamRepository.delete(id); 
    }
    

}