/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author BA LONG
 */
public class Person implements Serializable{
    private String hoten;
    private String diachi;
    private String gioitinh;
    private Date ngaysinh;

    public Person() {
    }

    public Person(String hoten, String diachi, String gioitinh, Date ngaysinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String ngaysinhToString(){
        SimpleDateFormat sdf =new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(ngaysinh);
    }
    @Override
    public String toString(){
        return ",Ho Ten: "+hoten+",Dia chi: "+diachi+",Ngay Sinh: "+ngaysinhToString()+", Gioi tinh: "+gioitinh;
                
    }

}
