/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author BA LONG
 */
public class Creat {
    ArrayList<CBGV> dscb=new ArrayList<>();
    public void nhapdscb(){
            System.out.println("Nhap thuong tin can bo");
            CBGV cb=new CBGV();
            cb.nhapcb();
            dscb.add(cb);
        
    }
    public void ghiFile(){
        try {
            FileOutputStream fos=new FileOutputStream("DSCBb12.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(dscb);
            oos.close();
            fos.close();
            System.out.println("\nghi thanh cong");
        } catch (IOException e) {
            System.out.println("loi ghi file");
        }
    }
    public  void docFile(){
        try {
            FileInputStream fis=new FileInputStream("DSCBb12.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            System.out.println("Danh sach Can Bo");
            System.out.printf("\n %30s %20s %10s %10s %10s %10s %10s","Ho ten","Dia chi","Nam Sinh","Luong cung","Thuong","Phat","Luong TL");
            ArrayList<CBGV>cb=(ArrayList<CBGV>)ois.readObject();
            cb.forEach(x->{x.incb();});
            System.out.println("\nDoc thanh cong");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Doc Ghi File that bai");
        }
    }
}
