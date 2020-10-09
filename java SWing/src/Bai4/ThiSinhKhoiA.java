/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class ThiSinhKhoiA extends ThiSinh{
    private float dtoan;
    private float dly;
    private float dhoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(float dtoan, float dly, float dhoa, String hoten, String ngaysinh, String diachi) {
        super(hoten, ngaysinh, diachi);
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
    public void nhapkA(){
        super.nhap();
        System.out.println("Nhap diem Toan: ");
        dtoan=new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem Hoa: ");
        dhoa=new Scanner(System.in).nextFloat();
        System.out.println("Nhap diem Ly: ");
        dly=new Scanner(System.in).nextFloat();
    }
    public void inkA(){
        super.in(); 
        System.out.printf("%10.1f %10.1f %10.1f ",dtoan,dhoa,dly);
    }    
}
