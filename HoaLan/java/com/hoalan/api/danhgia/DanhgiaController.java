package com.hoalan.api.danhgia;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/danhgia")
public class DanhgiaController {

    @Autowired
   DanhgiaRepository danhgiaRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/tatcadanhgia",method = RequestMethod.GET)
    public java.util.List<Danhgia> getAllDanhgias() {
      return danhgiaRepository.findAll();
    }
    



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Danhgia danhgia) {
       danhgiaRepository.save(danhgia);
    }

    @RequestMapping(value = "/{id}") 
    public Danhgia read(@PathVariable String id) {
        return danhgiaRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Danhgia danhgia) {
        danhgiaRepository.save(danhgia);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        danhgiaRepository.delete(id); 
    }

}