
package bai1.khachhang;

import java.io.Serializable;
import java.util.Scanner;


public class Input implements Serializable {
    private String ma;
    private String ten;
    private int namsinh;
    int n;

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public Input() {
    }

    public Input(String ma, String ten, int namsinh) {
        this.ma = ma;
        this.ten = ten;
        this.namsinh = namsinh;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        ma=sc.nextLine();
        System.out.println("Nhap ten: ");
        ten=sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namsinh=sc.nextInt();
    }  
    public void xuat(){
        System.out.printf("%30s %30s %10d",ma,ten,namsinh);
    }
}
