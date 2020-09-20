
package bai3tamgiac;
import java.util.Scanner;
public class Tamgiac {
    private float a;
    private float b;
    private float c;

    public Tamgiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Tamgiac() {
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    
    public void nhap(){
        System.out.println("nhap 3 canh cua tam giac: ");
        a=new Scanner(System.in).nextFloat();
        b=new Scanner(System.in).nextFloat();
        c=new Scanner(System.in).nextFloat();
    }
    public void kiemtra(){
        
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
	System.out.print("\nĐây là tam giác ");
		if ((a == b) || (b == c) || (c == a)) {
			System.out.print("cân !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("đều !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("vuông ");
		}         
                else if (((a == b) && (b == c) && (c == a))&&((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a))){
                        System.err.println("vuong can");
                }
                 
        }
        
    }
    public void tinh(){
        
        float p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("\nDien tich tam giac: "+s);
            System.out.println("chu vi tam giac: "+p*2);
    
    }
   public void hienthi(){
       nhap();
       kiemtra();
       tinh();
   }
}
