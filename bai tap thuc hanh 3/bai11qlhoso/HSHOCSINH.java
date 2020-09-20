/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11qlhoso;

import java.util.Scanner;


public class HSHOCSINH extends Nguoi{
    private String hoten;
    private  int tuoi;
    private int namsinh;
    private String quequan;

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getHoten() {
        return hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public HSHOCSINH() {
    }

    public HSHOCSINH(String hoten, int tuoi, int namsinh, String quequan) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.namsinh = namsinh;
        this.quequan = quequan;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoten=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.println("Nhap que quan: ");
        sc.nextLine();
        quequan=sc.nextLine();
        System.out.println();
        System.out.println("Nhap nam sinh: ");
        namsinh=sc.nextInt();
        
       
    }
    @Override
    public void xuat(){
        System.out.printf("%30s|%5d|%10d|%30s|",hoten,tuoi,namsinh,quequan);
        super.xuat();
    }
}
