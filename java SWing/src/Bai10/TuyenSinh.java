/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author BA LONG
 */
public class TuyenSinh {
    ArrayList<KhoiA> dssva=new ArrayList<>();
    ArrayList<KhoiB> dssvb=new ArrayList<>();
    ArrayList<KhoiC> dssvc=new ArrayList<>();
    public void nhapna(){
        System.out.println("Nhap so Sv khoi A: ");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin Sinh vien thu "+(i+1)+": ");
            KhoiA ka=new KhoiA();
            ka.nhapa();
            dssva.add(ka);
        }
    }
    public void nhapnb(){
        System.out.println("Nhap so Sv khoi B: ");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin Sinh vien thu "+(i+1)+": ");
            KhoiB kb=new KhoiB();
            kb.nhapb();
            dssvb.add(kb); 
        }
    }
    public void nhapnc(){
        System.out.println("Nhap so sinh vien khoi C: ");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
            KhoiC kc=new KhoiC();
            kc.nhapc();
            dssvc.add(kc);
        }
    }
    public  void ghiFile(){
        try {
            FileOutputStream fis=new FileOutputStream("danhsachSvb10.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fis);
            oos.writeObject(dssva);
            oos.writeObject(dssvb);
            oos.writeObject(dssvc);
            oos.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Loi Ghi File");
        }
    }
    public void docFile(){
        try {
            FileInputStream fis=new FileInputStream("danhsachSvb10.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            System.out.println("\nDanh sach Sinh vien Khoi A");
            System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Toan","D LY","D hoa");
            ArrayList<KhoiA> dsa=(ArrayList<KhoiA>)ois.readObject();
            dsa.forEach(x->{x.ina();});
            System.out.println("\nDanh sach Sinh vien Khoi B");
            System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Toan","D hoa","D sinh");
            ArrayList<KhoiB> dsb=(ArrayList<KhoiB>)ois.readObject();
            dsb.forEach(x->{x.inb();});
            System.out.println("\nDanh sach Sinh vien Khoi C");
            System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Van","D Su","D Dia");
            ArrayList<KhoiC> dsc=(ArrayList<KhoiC>)ois.readObject();
            dsc.forEach(x->{x.inc();});
            ois.close();
            fis.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("doc that bai ");
        }
    }
    public void find(){
        System.out.println("Nhap so bao danh can tim: ");
        String Sbd=new Scanner(System.in).nextLine();
        for(KhoiA a:dssva){
            if(a.getSbd().equals(Sbd)){
                System.out.println("\nDanh sach Sinh vien Khoi A");
                System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Toan","D LY","D hoa");
                a.ina();
            }
        }
        for(KhoiB b:dssvb){
            if(b.getSbd().equals(Sbd)){
                System.out.println("\nDanh sach Sinh vien Khoi B");
                System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Toan","D hoa","D sinh");
                b.inb();
            }
        }
        for(KhoiC c:dssvc){
            if(c.getSbd().equals(Sbd)){
                System.out.println("\nDanh sach Sinh vien Khoi C");
                System.out.printf("\n%10s %30s %20s %10s %10s %10s %10s","So BD","Ho Ten","Dia chi","UU tien","D Van","D Su","D Dia");
                c.inc();
            }
        }
        
    }
    
}    
