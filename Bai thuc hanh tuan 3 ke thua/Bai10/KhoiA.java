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
public class KhoiA extends ThiSinh{
    private float dtoan;
    private float dly;
    private float dhoa;

    public KhoiA() {
    }

    public KhoiA(float dtoan, float dly, float dhoa, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.dtoan = dtoan;
        this.dly = dly;
        this.dhoa = dhoa;
    }

    public float getDtoan() {
        return dtoan;
    }

    public float getDly() {
        return dly;
    }

    public float getDhoa() {
        return dhoa;
    }

    public void setDtoan(float dtoan) {
        this.dtoan = dtoan;
    }

    public void setDly(float dly) {
        this.dly = dly;
    }

    public void setDhoa(float dhoa) {
        this.dhoa = dhoa;
    }
    public void nhapa(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap diem toan: ");
        dtoan=sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        dhoa=sc.nextFloat();
        System.out.println("Nhap diem ly: ");
        dly=sc.nextFloat();
    }
    public  void ina(){
        super.in();
        System.out.printf("%10.2f %10.2f %10.2f",dtoan,dly,dhoa);
    }
}
