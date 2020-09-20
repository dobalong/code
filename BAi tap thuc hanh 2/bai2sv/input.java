
package bai2sv;
import java.util.Scanner;
public class input {
    private float diemLT;
    private float diemTH;
    private int masv;
    private String hoten;
    public input(int masv,String hoten,float diemLT, float diemTH ) {
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.masv = masv;
        this.hoten = hoten;
    }

    public input() {
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public int getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
    public float diemtb(){
       float dtb=(diemLT+diemTH)/2;
       return dtb;
    }
     public String toString(){
         return masv+"\t"+hoten+"\t"+diemLT+"\t"+diemTH;
     }
     
    
    
    
}
