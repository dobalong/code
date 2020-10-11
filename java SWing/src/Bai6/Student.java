/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class Student implements Serializable{
    private String hoten;
    private int tuoi;

    public Student() {
    }

    public Student(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void nhap(){
        System.out.println("Nhap Ho ten: ");
        hoten=new Scanner(System.in).nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi=new Scanner(System.in).nextInt();
    }
    public void in(){
        System.out.printf("\n%30s |%10d",hoten,tuoi);
    }
            
}
