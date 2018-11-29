package com.hoalan.api.ngaytuoi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/ngaytuoi")
public class NgaytuoiController {

    @Autowired
   NgaytuoiRepository ngaytuoiRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcangaytuoi",method = RequestMethod.GET)
    public java.util.List<Ngaytuoi> getAllNgaytuois() {
      return ngaytuoiRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Ngaytuoi ngaytuoi) {
    	ngaytuoiRepository.save(ngaytuoi);
    }

    @RequestMapping(value = "/{id}") 
    public Ngaytuoi read(@PathVariable String id) {
        return ngaytuoiRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Ngaytuoi ngaytuoi) {
    	ngaytuoiRepository.save(ngaytuoi);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
    	ngaytuoiRepository.delete(id); 
    }

}