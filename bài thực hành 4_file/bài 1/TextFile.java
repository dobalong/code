/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;

import com.sun.org.apache.bcel.internal.generic.AASTORE;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author green
 */
public class TextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        custList custs = new custList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {            
            System.out.println("1. Nhap DS Kh");
            System.out.println("2. In DS KH");
            System.out.println("3. Load DS KH tu file");
            System.out.println("4. Luu DS KH vao file");
            System.out.println("5. Thoat");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: 
                    custs.add();
                    break;
                case 2:
                    custs.out();
                    break;
                case 3:
                    System.out.println("Nhap ten file");
                    System.out.println(""+custs.load(sc.nextLine()));
                    break;
                case 4: 
                    System.out.println("Nhap ten File");
                    custs.save(sc.nextLine());
                    break;
            }
        } while (choice !=5);
    }
    
}
