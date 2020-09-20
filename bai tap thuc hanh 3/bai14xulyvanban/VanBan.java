
package bai14xulyvanban;

import java.util.Scanner;


public class VanBan {
    private String st;
   
    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public VanBan() {
    }

    public VanBan(String st) {
        this.st = st;
    }
    public void nhap(){
        System.out.println("Nhap xau ky tu: ");
        st=new Scanner(System.in).nextLine();
        System.out.println("Xau vua nhap: "+st);
    }
    public int demtu(){
        int demtu=0;
         char ch[] =new char[st.length()];
        for(int i=0;i<st.length();i++){
            ch[i]=st.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ){
                demtu++;   
            } 
    }
    return demtu;
    }
    public int demH(){
        int demH=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='H'||st.charAt(i)=='h')
                demH++;
        }
        return demH++;
    }
    public void chuanHoa(){
        st=st.trim();
        st=st.replaceAll("\\s+", " ");
        System.out.println("Xau sau chuan hoa:"+st);
    }
    public void menu(){
        System.out.println("Moi chon chuc nang ");
        System.out.println("1. Nhap xau ky tu");
        System.out.println("2. Dem so tu cua xau ");
        System.out.println("3.Dem so ky tu 'H' va 'h' ");
        System.out.println("4.Chuan hoa xau ");
        System.out.println("5.Ket thuc ");
        System.out.print("Moi chon: ");
    }
}
