/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class Main {
    public static void main(String[] args) {
        Creat ct=new Creat();
        int chon;
        while(true){
            System.out.println("\n Thong tin can bo");
            System.out.println("1.Nhap Danh sach");
            System.out.println("2.Ghi File");
            System.out.println("3.Doc File");
            System.out.println("4.Thoat");
            System.out.println("Moi chon: ");
            chon=new Scanner(System.in).nextInt();
            switch(chon){
                case 1:ct.nhapdscb();break;
                case 2: ct.ghiFile();break;
                case 3: ct.docFile();break;
                case 4: return;
            }
        }
    }
}
