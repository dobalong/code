/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class ThiSinh {
   
   private String hoten;
   private String ngaysinh;
   private String diachi;
   
   
    public ThiSinh() {
    }

    public ThiSinh(String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void nhap(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Nhap ho ten: ");
       hoten=sc.nextLine();
       System.out.println("Nhap ngay sinh: ");
       ngaysinh=sc.nextLine();
       System.out.println("Nhap dia chi: ");
       diachi=sc.nextLine();
   }
    public void in(){
        
        System.out.printf("\n%30s %20s %20s ",hoten,ngaysinh,diachi);
    }
   
    
}
