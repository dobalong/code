
package bai2sv;


public class Bai2Sv {

    public static void main(String[] args) {
        input a=new input(); 
       input in1=new input(1521001234,"DO NAM TRUNG",10,10);
       input in2=new input(1621001234,"KIM Jong Un",9,9);
       input in3=new input(1721001234,"PU TIN",8,8);
       System.out.println("MASV         HOTEN               DiemLT      DiemTH");
        System.out.println(in1);
        System.out.println(in2);
       System.out.println(in3);
       System.out.println("diem TB=");
       a.diemtb();
       
       
       
       
    }
    
}
