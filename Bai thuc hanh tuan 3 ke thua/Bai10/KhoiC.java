/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class KhoiC extends ThiSinh{
    private float dvan;
    private float dsu;
    private float ddia;

    public KhoiC() {
    }

    public KhoiC(float dvan, float dsu, float ddia, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.dvan = dvan;
        this.dsu = dsu;
        this.ddia = ddia;
    }

    public float getDvan() {
        return dvan;
    }

    public float getDsu() {
        return dsu;
    }

    public float getDdia() {
        return ddia;
    }

    public void setDvan(float dvan) {
        this.dvan = dvan;
    }

    public void setDsu(float dsu) {
        this.dsu = dsu;
    }

    public void setDdia(float ddia) {
        this.ddia = ddia;
    }
    public void nhapc(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem van: ");
        dvan=sc.nextFloat();
        System.out.println("Nhap diem su: ");
        dsu=sc.nextFloat();
        System.out.println("Nhap diem dia: ");
        ddia=sc.nextFloat();
    }
    public void inc(){
        super.in();
        System.out.printf("%10.2f %10.2f %10.2f",dvan,dsu,ddia);
    }
}
