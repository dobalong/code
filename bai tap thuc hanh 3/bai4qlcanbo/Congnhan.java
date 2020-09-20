
package bai4qlcanbo;

import java.util.Scanner;


public class Congnhan extends CanBo{
        private int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public Congnhan() {
    }

    public Congnhan(int bac) {
        this.bac = bac;
    }


    @Override
    public void  nhap(){
        super.nhap();
        System.out.println("Nhap bac .../9");
        bac=new Scanner(System.in).nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%30d|",bac);
    }
}
