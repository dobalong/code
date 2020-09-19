
package bai1sv;
import java.util.Scanner;
public abstract class Nguoi {
    protected String hoten;
    protected int namsinh;
    protected  float diemTB;

    public Nguoi() {
    }

    public Nguoi(String hoten, int namsinh, float diemTB) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diemTB = diemTB;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsing(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setDiemtb(float diemTB) {
        this.diemTB = diemTB;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoten=sc.nextLine();
        System.out.println("NHap nam sinh: ");
        this.namsinh=sc.nextInt();
        System.out.println("Nhap diem TB: ");
        this.diemTB=sc.nextFloat();
    }
    public void xuat(){
        System.out.println("Ho ten: "+hoten);
        System.out.println("Nam sinh: "+namsinh);
        System.out.println("Diem TB: "+diemTB);
        
    }
    
}
