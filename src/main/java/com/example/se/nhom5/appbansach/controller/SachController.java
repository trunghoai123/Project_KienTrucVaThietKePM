package com.example.se.nhom5.appbansach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.se.nhom5.appbansach.entity.LoaiSach;
import com.example.se.nhom5.appbansach.entity.Sach;
import com.example.se.nhom5.appbansach.service.LoaiSachService;
import com.example.se.nhom5.appbansach.service.SachService;
  
@RestController
@RequestMapping("/api")
public class SachController {
    @Autowired
    private SachService sachService;
    @Autowired 
    private LoaiSachService loaiSachService;
    
//    http://localhost:8088/api/sachs
    @GetMapping("/sachs")
    public List<Sach> findAllSach(){
        return sachService.findAll();
    }
//    http://localhost:8088/api/sachs/giaSach?giaMin=100000&giaMax=150000
    @GetMapping("/sachs/giaSach")
    public List<Sach> getSachsByKhoangGia(@RequestParam("giaMin") int giaMin, @RequestParam("giaMax") int giaMax){
        return sachService.getSachByKhoanGia(giaMin, giaMax);
    }
//    http://localhost:8088/api/sachs/sort/asc
    @GetMapping("/sachs/sort/asc")
    public List<Sach> getSachsByNameASC(){
        return sachService.getSachsByNameASC();
    } 
//    http://localhost:8088/api/sachs/sort/desc
    @GetMapping("/sachs/sort/desc")
    public List<Sach> getSachsByNameDESC(){
        return sachService.getSachsByNameDESC();
    }
//    http://localhost:8088/api/sachs/find?maSach=2
    @GetMapping("/sachs/find")
    public Sach findSachByMaSach(@RequestParam("maSach") int maSach) {
        return sachService.getSachByMaSach(maSach);
    }
//    http://localhost:8088/api/loaiSachs
    @GetMapping("/loaiSachs")
    public List<LoaiSach> getLoaiSachs() { 
        return loaiSachService.findAll();
    }
//    http://localhost:8088/api/sachs/tenLoai?tenLoai=Lịch sử
    @GetMapping("/sachs/loaiSach")
    public List<Sach> getSachByTenLoaiSach(@RequestParam("tenLoai") String tenLoai) {
        return sachService.getSachByTenLoaiSach(tenLoai);
    }
}
