

package bai11qlhoso;

import java.util.Scanner;


public class Nguoi {
   private String lop;
   private int khoc;
   private int nhoc;

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setKhoc(int khoc) {
        this.khoc = khoc;
    }

    public void setNhoc(int nhoc) {
        this.nhoc = nhoc;
    }

    public String getLop() {
        return lop;
    }

    public int getKhoc() {
        return khoc;
    }

    public int getNhoc() {
        return nhoc;
    }

    public Nguoi(String lop, int khoc, int nhoc) {
        this.lop = lop;
        this.khoc = khoc;
        this.nhoc = nhoc;
    }

    public Nguoi() {
    }
   public void nhap(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Nhap lop: ");
       lop=sc.nextLine();
       System.out.println("Nhap khoa hoc: ");
       khoc=sc.nextInt();
       System.out.println("Nhap nam hoc: ");
       nhoc=sc.nextInt();
   }
   public void xuat(){
       System.out.printf("%10s|%10d|%10d|",lop,khoc,nhoc);
   }
}
