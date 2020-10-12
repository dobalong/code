/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class Nguoi implements Serializable{
    private String hoten;
    private int namsinh;
    private String quequan;

    public Nguoi() {
    }

    public Nguoi(String hoten, int namsinh, String quequan) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.quequan = quequan;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten=sc.nextLine();
        System.out.println("Nhap que quan: ");
        quequan=sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namsinh=sc.nextInt();
    }
    public  void in(){
        System.out.printf("\n %30s %20s %10d",hoten,quequan,namsinh);
    }
}
