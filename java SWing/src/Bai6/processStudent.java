/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class processStudent {
    ArrayList<Student> sv=new ArrayList<>();
    public void creart(){
        System.out.println("Nhap so SV: ");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("nhap thong tin sinh vien thu "+(i+1)+": ");
            Student st=new Student();
            st.nhap();
            sv.add(st);
        }
    } 
    public  void ghiFile(){
        
        try {
           
           FileOutputStream fos=new FileOutputStream("Studentb6.dat");
           ObjectOutputStream oos=new ObjectOutputStream(fos); 
           oos.writeObject(sv);
           oos.close();
           fos.close();
           
        } catch (IOException e) {
            
            System.out.println("\nLoi ghi File");
        }
    }
    public void docFile(){
        try {
            FileInputStream fis  =new FileInputStream("Studentb6.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList<Student> ds=(ArrayList<Student>)ois.readObject();
            ds.forEach(x->{x.in();});
            fis.close();
            ois.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nDoc that bai ");
        }
    }
    public static void main(String[] args) {
        processStudent ps=new processStudent();
    int chon;
    while(true){
            System.out.println("\n 1.Nhap n Sinh vien");
            System.out.println("2.Ghi File");
            System.out.println("3. Doc File");
            System.out.println("4. Thoat");
            System.out.println("Moi chon");
            chon=new Scanner(System.in).nextInt();
            switch(chon){
                case 1: ps.creart();break;
                case 2: 
                    ps.ghiFile();
                    break;
                case 3:
                    System.out.println("Danh sach SV");
                    System.out.printf("%30s |%10s","Ho ten","Tuoi");
                    ps.docFile();
                    break;
                    
            }
                    
    } 
    }
}
