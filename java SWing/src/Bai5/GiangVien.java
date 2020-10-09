/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author BA LONG
 */
public class GiangVien {
    private String hoten;
    private String magv;
    private String diachi;
    private String khoa;
    private String gt;

    public GiangVien() {
    }

    public GiangVien(String hoten, String magv, String diachi, String khoa, String gt) {
        this.hoten = hoten;
        this.magv = magv;
        this.diachi = diachi;
        this.khoa = khoa;
        this.gt = gt;
    }

    public String getHoten() {
        return hoten;
    }

    public String getMagv() {
        return magv;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getGt() {
        return gt;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    
    
    @Override
    public String toString(){
        return "Ma Giang Vien: "+magv+ ",Ho ten: "+hoten+",Dia chi: "+diachi+",Khoa: "+khoa+",Gioi Tinh: "+gt;
    }
}
