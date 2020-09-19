
package bai1sv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Bai1SV {
    int n;
    String mSV;
    SinhVien[] sv =new SinhVien[100];
    private int i;
    
     enum rank{
        yeu(2),trungbinh(5),kha(7),gioi(10);
        private final int value;
        private rank(int value){
            this.value=value;
        }
    }
     public void nhapds(){
        System.out.println("NHap so luong Sinh Vien: ");
        n=new Scanner(System.in).nextInt();
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println("Nhap vao sinh vien thu " + (i + 1) + ": ");
            sv[i]=new SinhVien();
            sv[i].nhap();   
        }
     }
     public void in(){
        System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<n;i++){
         sv[i].xuat();
        }
    }
     public void sxenum(){
        System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<n;i++){
            sv[i].xuat();
            for (rank r:rank.values()){
                if(sv[i].getDiemTB()<r.value){
                    System.out.println("xep loai: "+r);
                    System.out.println();
                    break;
                }
            }
        }
    }
     public void sxdiem(){
         System.out.println("Danh sach sap xep theo diem: ");
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(sv[j].getDiemtb()>sv[i].getDiemtb()){
                     SinhVien tmp=sv[j];
                     sv[j]=sv[i];
                     sv[i]= tmp; 
                 }
             }
         }
         in();
     }
     public void find(){
        System.out.println("nhap ma Sv can tim: ");
        mSV=new Scanner(System.in).nextLine();
        for(int i=0;i<n;i++){
            if(sv[i].getMsv().equals(mSV)){
               System.out.println("sinh vien can tim: "); 
               sv[i].xuat();
            } 
            }
    }
    public void Menu() {
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. Sap xep theo diem TB enum");
        System.out.println("4.Sap xep theo diem tb giam dan ");
        System.out.println("5. Tim kiem theo ma sv");
        System.out.println("6. Thoat");
        System.out.print("Chon: ");
    }
    public static void main(String[] args) {
        Bai1SV b=new Bai1SV();
        int c;
        while(true){
            b.Menu();
            c=new Scanner(System.in).nextInt();
            switch(c){
            case 1:
                b.nhapds();
                break;
            case 2:
                b.in();break;
            case 3:
                b.sxenum();
                break;
            case 4:
                b.sxdiem();break;
            case 5:
                b.find();break;
            case 6: return;
            
        }
        }
    }    

}
