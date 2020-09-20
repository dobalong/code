
package bai5thisinh;

import java.util.Scanner;
public class Thisinh {
    private String mats;
    private String hoten;
    private int dtoan;
    private int dly;
    private int dhoa;

    public Thisinh(String mats, String hoten, int dtoan, int dly, int dhoa) {
        this.mats = mats;
        this.hoten = hoten;
        this.dtoan = dtoan;
        this.dly = dly;
        this.dhoa = dhoa;
    }

    public Thisinh() {
    }

    public String getMats() {
        return mats;
    }

    public String getHoten() {
        return hoten;
    }

    public int getDtoan() {
        return dtoan;
    }

    public int getDly() {
        return dly;
    }

    public int getDhoa() {
        return dhoa;
    }

    public void setMats(String mats) {
        this.mats = mats;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDtoan(int dtoan) {
        this.dtoan = dtoan;
    }

    public void setDly(int dly) {
        this.dly = dly;
    }

    public void setDhoa(int dhoa) {
        this.dhoa = dhoa;
    }
public void nhap(){
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap ma thi sinh: ");
    this.mats=sc.nextLine();
    System.out.println("nhap ho ten: ");
    this.hoten=sc.nextLine();
    System.out.println("nhap diem toan: ");
    this.dtoan=sc.nextInt();
    System.out.println("nhap diem ly: ");
    this.dly=sc.nextInt();
    System.out.println("nhap diem hoa: ");
    this.dhoa=sc.nextInt();
}
public int diemtong(){
    return dtoan+dly+dhoa;
}
    public void xuatTS(){
        System.out.println("Mã: "+this.mats);
        System.out.println("Tên: "+this.hoten);
        System.out.println("Điểm toán: "+this.dtoan);
        System.out.println("Điểm lý: "+this.dly);
        System.out.println("Điểm hoá: "+this.dhoa);
        System.out.println("Điểm tổng: "+diemtong());
    }


@Override
    public String toString(){
       
        return this.mats+"\t\t"+this.hoten+"\t\t"+this.dtoan+"\t\t"+this.dly+"\t\t\t"+this.dhoa+"\t\t\t"+diemtong();
    }
}
