/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author BA LONG
 */
public class ThiSinhKhoiC extends ThiSinh{
    private Float dvan;
    private float dsu;
    private float ddia;

    public ThiSinhKhoiC(Float dvan, float dsu, float ddia) {
        this.dvan = dvan;
        this.dsu = dsu;
        this.ddia = ddia;
    }

    public ThiSinhKhoiC() {
    }

    public Float getDvan() {
        return dvan;
    }

    public float getDsu() {
        return dsu;
    }

    public float getDdia() {
        return ddia;
    }

    public void setDvan(Float dvan) {
        this.dvan = dvan;
    }

    public void setDsu(float dsu) {
        this.dsu = dsu;
    }

    public void setDdia(float ddia) {
        this.ddia = ddia;
    }
    public void nhapkc(){
        super.nhap();
        System.out.println("Nhap diem Vam: ");
        dvan=new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem Dia: ");
        ddia=new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem Su: ");
        dsu=new Scanner(System.in).nextFloat();
    }
    public void inkC(){
        super.in();
        System.out.printf("%10.1f %10.1f %10.1f ",dvan,ddia,dsu);
    }    
}
    

