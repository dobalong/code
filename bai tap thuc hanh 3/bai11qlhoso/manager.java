
package bai11qlhoso;

import java.util.Scanner;


public class manager {
    HSHOCSINH[] hs= new HSHOCSINH[100];
    int n;
    public void nhapHS(){
        System.out.println("Nhap so luong hoc sinh: ");
        n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin hoc sinh: ");
            hs[i]=new HSHOCSINH();
            hs[i].nhap();
        }
    }
    public void xuatHS(){
        System.out.println("Danh sach hoc sinh: ");
        System.out.printf("\n%30s|%5s|%10s|%30s|%10s|%10s|%10s|","HO TEN","tuoi","Nam Sinh","Que Quan","lop","Khoa hoc","Ky hoc");
        for(int i=0;i<n;i++){
            System.out.println();
            hs[i].xuat();
            
        }
    }
    public void xuatns(){
        for(int i=0;i<n;i++){
            if(hs[i].getNamsinh()==1985)
                xuatHS();
        }
    }
    public int dem(){
        int dem=0;
        for(int i=0;i<n;i++){
            if((hs[i].getNamsinh())==1985&&hs[i].getQuequan().equals("ThaiNguyen") )
                dem++;
        }
        return dem;
    }
    public void menu(){
        System.out.println("1. Nhap danh sach hoc sinh ");
        System.out.println("2. Xuat danh sach hoc sinh ");
        System.out.println("3. Xuat hoc sinh sinh nam 1985");
        System.out.println("4.Dem hoc sinh sinh nam 1985 va que thai nguyen ");
        System.out.println("5. Thoat");
        System.out.print("Chon: ");
    }
    
}
