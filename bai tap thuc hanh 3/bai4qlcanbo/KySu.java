
package bai4qlcanbo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String ndt;

    public void setNdt(String ndt) {
        this.ndt = ndt;
    }

    public String getNdt() {
        return ndt;
    }

    public KySu() {
    }

    public KySu(String ndt) {
        this.ndt = ndt;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap Nganh dao tao: ");
        ndt=new Scanner(System.in).nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%30s|",ndt);
    }
}
