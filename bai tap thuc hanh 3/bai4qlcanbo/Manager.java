
package bai4qlcanbo;

import java.util.Scanner;


public class Manager {
    int snv;
    NhanVien[] nv=new NhanVien[100];
    int scn;
    Congnhan[] cn =new Congnhan[100];
    int sks;
    KySu[] ks =new KySu[100];
    public void nhapNV(){
        System.out.println("Nhap so luong nhan vien: ");
        snv=new Scanner(System.in).nextInt();
        for(int i=0;i<snv;i++){
            System.out.println("Nhap thong tin nhan vien thu "+i+1);
            nv[i]=new NhanVien();
            nv[i].nhap();
        }
    }
    public void xuatNV(){
        System.out.println("\nDanh sach Nhan vien: ");
        System.out.printf("%30s|%8s|%10s|%30s|%30s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi","Cong Viec");
        for(int i=0;i<snv;i++){
           System.out.println();
           nv[i].xuat();
        }
    }
    public void nhapCN(){
        System.out.println("\nNhap so luong cong nhan: ");
        scn=new Scanner(System.in).nextInt();
        for(int i=0;i<scn;i++){
            System.out.println("Nhap thong tin Cong nhan thu "+i+1);
            cn[i]=new Congnhan();
            cn[i].nhap();
        }
    }
    public void xuatCN(){
        System.out.println("\nDanh sach Cong Nhan");
        System.out.printf("%30s|%8s|%10s|%30s|%30s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi"," Bac");
         for(int i=0;i<scn;i++){
             System.out.println();
             cn[i].xuat();
         }
    }
    public void nhapKS(){
        System.out.println("\nNhap so luong Ky SU: ");
        sks=new Scanner(System.in).nextInt();
        for(int i=0;i<sks;i++){
            System.out.println("Nhap thong tin Ky Su thu "+i+1);
            ks[i]=new KySu();
            ks[i].nhap();
        }
    }
    public void xuatKS(){
        System.out.println("\nDanh sach Ky Su ");
         System.out.printf("%30s|%8s|%10s|%30s|%30s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi"," Nghanh dao tao");
         for(int i=0;i<sks;i++){
             System.out.println();
             ks[i].xuat();
         }
    }
    public void menu(){
        System.out.println("\n1.Nhap thong tin can bo");
        System.out.println("2.Tim kiem theo ten");
        System.out.println("3.In danh sach can bo");
        System.out.println("4.Thoat");
        System.out.println("Moi chon");
    }
    public void findname(){
        String ten;
        int scb=snv+sks+scn;
        System.out.println("\nNhap ten can tim: ");
        ten=new Scanner(System.in).nextLine();
        System.out.println("Danh sach can bo ");
        for(int i=0;i<scb;i++){
            if(ks[i].getHoten().equals(ten)){
                System.out.printf("\n%30s|%8s|%10s|%30s|%30s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi"," Nghanh dao tao");
                System.out.println();
                ks[i].xuat();
            }
            else if(cn[i].getHoten().equals(ten)){
                System.out.printf("\n%30s|%8s|%10s|%30s|%8s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi"," Bac");
                System.out.println();
                cn[i].xuat();
            }
            else if(nv[i].getHoten().equals(ten)){
                System.out.printf("\n%30s|%8s|%10s|%30s|%30s|","Ho Ten","Nam Sinh","Gioi Tinh","Dia chi","Cong Viec");
                System.out.println();
                nv[i].xuat();
            }
        } 
    }

   
}
