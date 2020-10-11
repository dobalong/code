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
public class KhoiB extends ThiSinh{
    private float dtoan;
    private float dhoa;
    private float dsinh;

    public KhoiB() {
    }

    public KhoiB(float dtoan, float dhoa, float ddia, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.dtoan = dtoan;
        this.dhoa = dhoa;
        this.dsinh = dsinh;
    }

    public float getDtoan() {
        return dtoan;
    }

    public float getDhoa() {
        return dhoa;
    }

    public float getDsinh() {
        return dsinh;
    }

    public void setDtoan(float dtoan) {
        this.dtoan = dtoan;
    }

    public void setDhoa(float dhoa) {
        this.dhoa = dhoa;
    }

    public void setDsinh(float dsinh) {
        this.dsinh = dsinh;
    }
    public void nhapb(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem toan: ");
        dtoan=sc.nextFloat();
        System.out.println("Nhap diem hoa: ");
        dhoa=sc.nextFloat();
        System.out.println("Nhap diem sinh: ");
        dsinh=sc.nextFloat();
    }
    public void inb(){
        super.in();
        System.out.printf("%10.2f %10.2f %10.2f",dtoan,dhoa,dsinh);
    }
    
   
}
