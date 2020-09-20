
package bai14xulyvanban;

import java.util.Scanner;


public class Bai14XuLyVanBan {

    
    public static void main(String[] args) {
       VanBan vb=new VanBan();
        int c;
        while(true){
            vb.menu();
            c=new Scanner(System.in).nextInt();
            switch(c){
                case 1: vb.nhap(); break;
                case 2: System.out.println("so tu: "+vb.demtu()); break;
                case 3: System.out.println("So ky tu 'h' va 'H' : "+vb.demH()); break;
                case 4: vb.chuanHoa();break;
                case 5: return;
            }
        }
    }
    
}
