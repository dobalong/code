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
public class Main {
    public static void main(String[] args) {
         TuyenSinh ts=new TuyenSinh();
         int chon;
         while(true){
             System.out.println("\nThong tin tuyen sinh");
             System.out.println("1.Nhap Sinh vien Khoi A");
             System.out.println("2.Nhap sinh vien Khoi B");
             System.out.println("3.Nhap Sinh vien Khoi C");
             System.out.println("4.In Danh Sach");
             System.out.println("5.Ghi File");
             System.out.println("6.Doc File ");
             System.out.println("7.Tim kiem theo so bao danh");
             System.out.println("8.Thoat");
             System.out.println("Moi chon: ");
             chon=new Scanner(System.in).nextInt();
             switch(chon){
                 case 1: ts.nhapna(); break;
                 case 2: ts.nhapnb(); break;
                 case 3: ts.nhapnc(); break;
                 case 4: ts.inds();break;
                 case 5:ts.ghiFile(); break;
                 case 6:ts.docFile(); break;
                 case 7: ts.find(); break;
                 case 8:return;
             }
         }
    }
       
}
