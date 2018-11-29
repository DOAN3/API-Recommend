package com.hoalan.api.nhanvien;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/nhanvien")
public class NhanvienController {

    @Autowired
   NhanvienRepository nhanvienRepository;
    
//    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
//    public String getKhachhangRepository() {
//      return "khachangRepository";
//    }
    @RequestMapping(value="/hoalan/all",method = RequestMethod.GET)
    public java.util.List<Nhanvien> getAllNhanviens() {
      return nhanvienRepository.findAll();
    }
    
    @RequestMapping(value="/timkiem/{ten}",method = RequestMethod.GET)
    public Nhanvien showKhachhang(@PathVariable String ten){
        return nhanvienRepository.findOneByTen(ten);
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Nhanvien nhanvien) {
       nhanvienRepository.save(nhanvien);
    }

    @RequestMapping(value = "/{id}") 
    public Nhanvien read(@PathVariable String id) {
        return nhanvienRepository.findOne(id);
    }
    


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Nhanvien nhanvien) {
        nhanvienRepository.save(nhanvien);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        nhanvienRepository.delete(id); 
    }

}