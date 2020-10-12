/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class ThiSinh implements Serializable{
    private String sbd;
    private String hoten;
    private String diachi;
    private int uutien;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String hoten, String diachi, int uutien) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.diachi = diachi;
        this.uutien = uutien;
    }

    public String getSbd() {
        return sbd;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getUutien() {
        return uutien;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setUutien(int uutien) {
        this.uutien = uutien;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so bao danh: ");
        sbd=sc.nextLine();
        System.out.println("Nhap Ho ten: ");
        hoten=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi=sc.nextLine();
        System.out.println("Nhap uu tien: ");
        uutien=sc.nextInt();
    }
    public  void in(){
        System.out.printf("\n%10s %30s %20s %10d",sbd,hoten,diachi,uutien);
    }
}
