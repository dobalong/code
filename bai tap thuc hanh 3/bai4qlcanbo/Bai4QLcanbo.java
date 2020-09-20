
package bai4qlcanbo;

import java.util.Scanner;

public class Bai4QLcanbo {


    public static void main(String[] args) {
       Manager ma =new Manager();
       int c;
       while(true){
           ma.menu();
           c=new Scanner(System.in).nextInt();
           switch(c){
               case 1: ma.nhapNV();
                       ma.nhapCN();
                       ma.nhapKS();
                       break;
               case 3: ma.xuatKS();
                       ma.xuatNV();
                       ma.xuatCN();
                       break;
               case 2: ma.findname();break;
               
               case 4:return;
           }
       }
    }
    
}
