/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.io.Serializable;

/**
 *
 * @author Truong Nguyen
 */
public class ProDuct  implements  Serializable{
    private String maHang;
    private String tenHang;
    private double gia;

    public ProDuct(String maHang, String tenHang, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public ProDuct() {
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
