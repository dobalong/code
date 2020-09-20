
package bai8phanso;

import java.util.Scanner;
public class Bai8phanso {

    public static void main(String[] args) {
        int chon;
        input ps1= new input();
        input ps2=new input();
        System.out.println("Nhap phan so thu nhat: ");
        ps1.nhap();
        System.out.println("Nhap phan so thu hai: ");
        ps2.nhap();
        do{
        System.out.println("1.Cộng");
        System.out.println("2.Trừ");
        System.out.println("3.Nhân");
        System.out.println("4.Chia");
        System.out.println("5.Thoát");
        System.out.println("Lựa chọn: ");
        chon=new Scanner(System.in).nextInt();
        switch(chon){
            case 1:
                ps1.congPs(ps2.getTs(),ps2.getMs());
                break;
            case 2:
                ps1.truPs(ps2.getTs(),ps2.getMs());
                break;
            case 3:
                ps1.nhanPs(ps2.getTs(),ps2.getMs());
                break;
            case 4:
                ps1.chiaPs(ps2.getTs(),ps2.getMs());
                break;
        }
    }while(chon!=5);
    }
}
