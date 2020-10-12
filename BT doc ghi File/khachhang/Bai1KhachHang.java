
package bai1.khachhang;

import java.util.Scanner;


public class Bai1KhachHang {
    int n;
    Input[] in=new Input[100];
    public void nhap(){
        System.out.println("NHap so luong Khach hang: ");
        n=new Scanner(System.in).nextInt();
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println("Nhap vao Khach hang thu " + (i + 1) + ": ");
            in[i]=new Input();
            in[i].nhap();  
        }
    }
    public void in(){
        System.out.println("Danh sach khach hang");
        System.out.printf("%30s %30s %10s","MA","TEN","Nam sinh");
        for(int i=0;i<n;i++){
            System.out.println();
            in[i].xuat();
        }
        System.out.println();
    }
    public void ghiFile(){
        DocGhiFile f=new DocGhiFile();
        f.ghiFile();
    }
  
    public static void main(String[] args) {
        Bai1KhachHang b=new Bai1KhachHang();
        b.nhap();
        b.in();
        b.ghiFile();
        
    }
    
}
