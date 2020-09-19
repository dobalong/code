
package bai11qlhoso;

import java.util.Scanner;


public class Bai11QLhoso {

    
    public static void main(String[] args) {
        manager ma=new manager();
        int c;
        while(true){
            ma.menu();
            c=new Scanner(System.in).nextInt();
            switch(c){
                case 1: ma.nhapHS(); break;
                case 2: ma.xuatHS(); break;
                case 3: ma.xuatns();break;
                case 4: System.out.println("So hs= "+ma.dem());;break;
                case 5: return;
            }
        }
    }
    
}
