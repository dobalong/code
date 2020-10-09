/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person implements Serializable{
    private String hoten;
    private  String ngaysinh;
    private String diachi;
    private String gioitinh;

    public Person() {
    }

    public Person(String hoten,String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
           
    @Override
    public String toString(){
        return "Ho Ten: "+hoten+",Ngay Sinh: "+ngaysinh+", Dia chi: "+diachi+",Gioi Tinh: "+gioitinh;
    }

    
}
