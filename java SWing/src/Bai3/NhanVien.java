/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Date;

/**
 *
 * @author BA LONG
 */
public class NhanVien extends Person{
    private String phongban;
    private float heso;
    private float thamnien;
    private double luongcoban;
    private  double luongthuclinh;

    public NhanVien() {
    }

    public NhanVien(String hoten, String diachi, String gioitinh ,String phongban, String ngaysinh, float heso, float thamnien, double luongcoban, double luongthuclinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.heso = heso;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
        this.luongthuclinh = luongthuclinh;
    }

  

   

    

    public String getPhongban() {
        return phongban;
    }

    public float getHeso() {
        return heso;
    }

    public float getThamnien() {
        return thamnien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public double getLuongthuclinh() {
        return luongthuclinh;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public void setHeso(float heso) {
        this.heso = heso;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public void setLuongthuclinh(double luongthuclinh) {
        this.luongthuclinh = luongthuclinh;
    }
    public double tinhluong(){
        return luongcoban*heso*(1+thamnien/100); 
    }
    @Override
    public String toString(){
        return super.toString()+",Phong ban: "+phongban+",He so Luong: "+heso+",Tham nien: "+thamnien+",Luong co ban: "+luongcoban+", Luong thuc linh: "+tinhluong()+"\n";
    }
    
}
