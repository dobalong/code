
package bai4qlcanbo;

import java.util.Scanner;

public class CanBo {
   private String hoten;
   private int namsinh;
   private String gioitinh;
   private String diachi;

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public CanBo() {
    }

    public CanBo(String hoten, int namsinh, String gioitinh, String diachi) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }
   public void nhap(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Nhap ho ten: ");
       hoten=sc.nextLine();
       System.out.println("Nhap nam sinh: ");
       namsinh=sc.nextInt();
       System.out.println("Nhap gioi tinh: ");
       sc.nextLine();
       gioitinh=sc.nextLine();
       System.out.println("Nhap dia chi: ");
       diachi=sc.nextLine();
   }
   public void xuat(){
       System.out.printf("%30s|%8d|%10s|%30s|",hoten,namsinh,gioitinh,diachi);
   }
}
