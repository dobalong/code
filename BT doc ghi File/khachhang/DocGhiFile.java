
package bai1.khachhang;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

    

public class DocGhiFile {
    ArrayList<Input> in=new ArrayList<>();
    public void ghiFile(){
        try{
            FileOutputStream fos =new FileOutputStream("Khachhang.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.flush();
                oos.writeObject(in);
                oos.close();
                oos.close();
        } catch(IOException ex){
        }
    }
    public void docFile(){
        
        try {
            FileInputStream fin=new FileInputStream("Khachhang.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
           
            
            
        } catch (Exception e) {
        }
    }

   
    
}
