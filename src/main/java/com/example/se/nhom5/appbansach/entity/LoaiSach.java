package com.example.se.nhom5.appbansach.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "loaisach")
public class LoaiSach {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="maLoai")
    private int maLoai;
    
    @Column(name="tenLoai")
    private String tenLoai;
    
    
    public LoaiSach() {
        super();
    }
    public LoaiSach(int maLoai) {
        super();
        this.maLoai = maLoai; 
    }
    
    public LoaiSach(int maLoai, String tenLoai ) {
        super();
        this.maLoai = maLoai;
        this.tenLoai = tenLoai; 
    } 
    public int getMaLoai() {
        return maLoai;
    }
    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }
    public String getTenLoai() {
        return tenLoai;
    }
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
  
    @Override
    public String toString() {
        return "LoaiSach [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
    }
}
