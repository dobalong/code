
package bai1.hinh;
import java.util.Scanner;
public abstract class hinhhoc {
    protected float cdai;
    protected float crong;
    public hinhhoc(float cdai,float crong){
        this.cdai=cdai;
        this.crong=crong;
    }
    public hinhhoc(){
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("nhap chieu dai: ");
            this.cdai=sc.nextFloat();
            System.out.println("nhap chieu rong: ");
            this.crong=sc.nextFloat();
        }
    }
    public abstract void out();
    public void in(){
        this.cdai=Math.round(cdai);
        this.crong=Math.round(crong);
        System.out.println("............");
        for(int i=0;i<cdai;i++){
            for(int j=0;j<cdai;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public float getcdai(){
        return cdai;
    }
    public float getcrong(){
        return crong;
    }
}
