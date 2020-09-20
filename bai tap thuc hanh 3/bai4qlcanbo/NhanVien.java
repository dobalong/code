
package bai4qlcanbo;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String ttcv;

    public void setTtcv(String ttcv) {
        this.ttcv = ttcv;
    }

    public String getTtcv() {
        return ttcv;
    }

    public NhanVien(String ttcv) {
        this.ttcv = ttcv;
    }

    public NhanVien() {
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap thong tin cong viec: ");
        ttcv=new Scanner(System.in).nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%30s|",ttcv);
    }
            
}
