package com.hoalan.api.sanpham;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping(value="/timkiem",method = RequestMethod.GET)
   public Sanpham getAllSanphamms(@RequestParam String ten) {
    	return sanphamRepository.findByTen(ten);
    }
    
//    @RequestMapping(value="/timkiemsanpham/{ten}",method = RequestMethod.GET)
//    public Sanpham show(@PathVariable String ten){
//        return sanphamRepository.findOneByTen(ten);
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Sanpham sanpham) {
       sanphamRepository.save(sanpham);
    }

    @RequestMapping(value = "/{id}") 
    public Sanpham read(@PathVariable String id) {
        return sanphamRepository.findOne(id);
    }
    
    @RequestMapping("/mota/{mota}")
    public Sanpham mota(@PathVariable(value="mota") String mota ) {
		return sanphamRepository.findByMota(mota);
    }
//    @RequestMapping("/goiy/{goiy}")
//    public Sanpham goiy(@PathVariable(value="goiy") String goiy ) {
//		return sanphamRepository.findByGoiy(goiy);
//    }
    @RequestMapping("timkiem/gia/{gia}")
    public Sanpham gia(@PathVariable(value="gia") int gia ) {
		return sanphamRepository.findByGia(gia);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Sanpham sanpham) {
        sanphamRepository.save(sanpham);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        sanphamRepository.delete(id); 
    }
     
   
    @RequestMapping(value="/gia",method = RequestMethod.GET)
    public java.util.List<Sanpham> getAllGia() {
      return sanphamRepository.findSanphamByGiaBetween(10000, 50000);
    }

}