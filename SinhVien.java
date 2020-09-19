
package bai1sv;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    protected String msv;
    protected  int diemtb;


    public String getMsv() {
        return msv;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setDiemtb(int diemtb) {
        this.diemtb = diemtb;
    }

    public SinhVien(String msv, int diemtb) {
        this.msv = msv;
        this.diemtb = diemtb;
    }

    public SinhVien() {
    }
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap maSV: ");
        msv=sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemtb=sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Ma SV : "+msv);
        System.out.println("diem trung binh: "+diemtb);
        
    }

    
}
