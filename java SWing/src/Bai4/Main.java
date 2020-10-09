/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import Bai3.NhanVien;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class Main {
    ArrayList<ThiSinhKhoiA> list=new ArrayList<>();
    ArrayList<ThiSinhKhoiC> list1=new ArrayList<>();
    public void nhapnA(){
        System.out.println("Nhap so luong thi sinh khoi A: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            ThiSinhKhoiA a=new ThiSinhKhoiA();
            a.nhapkA();
            list.add(a);
        }   
    }
     public void nhapnC(){
        System.out.println("Nhap so luong thi sinh khoi C: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            ThiSinhKhoiC c=new ThiSinhKhoiC();
            c.nhapkc();
            list1.add(c);
        }   
    }
    public void inna(){
        System.out.println("Danh sach Sinh vien Khoi A");
        System.out.printf("%30s %20s %20s %10s %10s %10s","Ho ten|","Ngay Sinh| ","Dia chi|","Diem Toan|","Diem Hoa|","Diem Ly|");
        for(ThiSinhKhoiA a :list){
           a.inkA();
        }
    }
    public void innc(){
        System.out.println("\nDanh sach Sinh vien Khoi C");
        System.out.printf("%30s %20s %20s %10s %10s %10s","Ho ten|","Ngay Sinh| ","Dia chi|","Diem Van|","Diem Dia|","Diem Su|");
        for(ThiSinhKhoiC c :list1){
           c.inkC();
        }
    }
    public void intta(){
        System.out.println("Danh sach trung tuyen Khoi A");
        
        System.out.printf("\n%30s %20s %20s %10s %10s %10s","Ho ten|","Ngay Sinh| ","Dia chi|","Diem Toan|","Diem Hoa|","Diem Ly|");
        for(ThiSinhKhoiA a:list){
            if(a.getDhoa()+a.getDly()+a.getDtoan()>20){
                a.inkA();
            }
        }
    }
    public void inttc(){
        
        System.out.println("\nDanh sach trung tuyen Khoi C");
        System.out.printf("\n%30s %20s %20s %10s %10s %10s","Ho ten|","Ngay Sinh| ","Dia chi|","Diem Van|","Diem Dia|","Diem Su|");
        for(ThiSinhKhoiC c :list1){
            if(c.getDdia()+c.getDsu()+c.getDvan()>20){
                c.inkC();
            }
        }
    }
    public static void main(String[] args) {
        Main m=new Main();
                
      
        int chon1,chon,chon2;
        while(true){
            System.out.println("\n1. Nhap Khoi A");  
            System.out.println("2. Nhap Khoi C");
            System.out.println("3. In Danh Sach");
            System.out.println("4.In DS trung tuyen");
            System.out.println("5.Thoat");
            System.out.println("Moi chon: ");
            chon=new Scanner(System.in).nextInt();
            switch(chon){
                case 1: m.nhapnA();break;
                case 3: m.inna();
                        m.innc();break;
                case 2: m.nhapnC();break;
                
                case 4: m.intta();m.inttc();break;
                case 5: return;
                }
                
                
        }
        }
        
    
}
