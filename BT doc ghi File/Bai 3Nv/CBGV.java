/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class CBGV extends Nguoi{
    private float luongcung;
    private float thuong;
    private float phat;
    private float luongtl;

    public CBGV() {
    }

    public CBGV(float luongcung, float thuong, float phat, float luongtl, String hoten, int namsinh, String quequan) {
        super(hoten, namsinh, quequan);
        this.luongcung = luongcung;
        this.thuong = thuong;
        this.phat = phat;
        this.luongtl = luongtl;
    }

    public float getLuongcung() {
        return luongcung;
    }

    public float getThuong() {
        return thuong;
    }

    public float getPhat() {
        return phat;
    }

    public float getLuongtl() {
        return luongtl;
    }

    public void setLuongcung(float luongcung) {
        this.luongcung = luongcung;
    }

    public void setThuong(float thuong) {
        this.thuong = thuong;
    }

    public void setPhat(float phat) {
        this.phat = phat;
    }

    public void setLuongtl(float luongtl) {
        this.luongtl = luongtl;
    }
    public void nhapcb(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong cung: ");
        luongcung=sc.nextFloat();
        System.out.println("Nhap thuong: ");
        thuong=sc.nextFloat();
        System.out.println("Nhap phat: ");
        phat=sc.nextFloat();
    }
    public Float luongthuclinh(){
        return luongcung+thuong-phat;
    }
    public void incb(){
        super.in();
        System.out.printf("%10.2f %10.2f %10.2f %10.2f",luongcung,thuong,phat,luongthuclinh());
    }
}
