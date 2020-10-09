/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author BA LONG
 */
public class SinhVien implements Serializable{
    protected String masv;
    protected  String hoten;
    protected String gioitinh;
    protected float diemtb;
    protected Date ngaysinh;

public SinhVien() {
    }
public SinhVien(String masv, String hoten, String gioitinh, float diemtb, Date ngaysinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diemtb = diemtb;
        this.ngaysinh = ngaysinh;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }
    
    @Override
    public String toString(){
        return "Ma SV: "+masv+", HO TEN: "+hoten+"Ngay Sinh: "+ngaysinh+", Gioi tinh: "+gioitinh+", Diem TB: "+diemtb;
}
}
