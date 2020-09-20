
package timngaytiep;

import java.util.Scanner;
public class Timngaytiep {
    public int ktnamnhuan(int nam){
        if( ((nam%4==0)&&(nam%100!=0))||(nam%400==0)) return 1;
        return 0;
    }
    public int timsongay(int thang ,int nam){
        int day=0;
        switch(thang){
            case 1: case 3: case 5:case 7:case 8:case 10:case 12:
                day=31;
                break;
            case 4: case 6 :case 9: case 11: 
                day=30;
                break;
            case 2:
                int check=ktnamnhuan(nam);
                if(check==1){
                    day=29;
                }
                else{
                   day=28;
                }
                    
        }
        return day;
    }
    public void ngayketiep(int ngay, int thang ,int nam){
        int ngaytrongthang=timsongay(thang, nam);
        if(ngay<ngaytrongthang){
            ngay++;
        }
        else if (thang<12){
        ngay=1;thang++;
        }
        else{
            ngay=thang=1;
            nam++;
        }
        System.out.println("ngay ke tiep: "+ngay+"/"+thang+"/"+nam);

    }
    public static void main(String[] args) {
        int ngay,thang ,nam;
        Timngaytiep b=new Timngaytiep() ;
        
            System.out.println("nhap nam: ");
            nam=new Scanner(System.in).nextInt();
            System.out.println("nhap thang: ");
            thang=new Scanner(System.in).nextInt();
            System.out.println("nhap ngay: ");
            ngay=new Scanner(System.in).nextInt();
            b.ngayketiep(ngay, thang, nam);
        
    }
    
}
