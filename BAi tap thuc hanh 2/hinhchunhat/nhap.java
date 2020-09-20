
package hinhchunhat;
import java.util.Scanner;

public class nhap {
    private int chieudai;
    private int chieurong;
    public nhap(int chieudai,int chieurong){
        chieudai=chieudai;
        chieurong=chieurong;
    }
    public nhap(){
        
    }

    public int getChieudai() {
        return chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.chieudai=sc.nextInt();
        System.out.println("nhap chieu rong: ");
        this.chieurong=sc.nextInt();
    }
    public void tinh(){
        System.out.println("dien tich= "+(chieudai*chieurong));
        System.out.println("chu vi = "+(chieudai+chieurong)*2);
    }
    public String toString(){
        return chieudai+" "+chieurong+" "+chieudai*chieurong+" "+(chieudai+chieurong)*2;
    }
    
}
