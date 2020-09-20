
package bài.pkg2.pkg9.pkg9;
import java.util.Scanner;
public class Bài299 {
    
    public int NguyenToYorN(int x)
    {
        if(x<2)
            return 0;
        if(x==2||x==3)
            return 1;
        if(x%2==0)
            return 0;
        int i;
        for(i=3;i<=Math.sqrt(x);i+=2)
            if((x%i)==0)
             return 0;
        return 1;
    }
    public void ktnt(){
        int n,i;
        System.out.println("Nhap so nguyen duong n kiem tra nguyen to : ");
        n=new Scanner(System.in).nextInt();
        if(NguyenToYorN(n)==1)
            System.out.println("n là so nguyen to");
        else
            System.out.println("n khong la so nguyen to ");
       
        System.out.println("Cac so nguyen to <n: ");
        for(i=2;i<n;i++)
            if(NguyenToYorN(i)==1)
            System.out.printf("   "+i);
        System.out.printf("\n");
        
    }
    public int hoanhaoYorN(int k){
        int sum =0;
        for(int i=1;i<k;i++){
            if(k%i==0)
                sum+=i;
        }
        if(sum==k) return 1;
        return 0;
    }
    public void kthh(){
        int n,i;
        System.out.println("Nhap so nguyen duong n kiem tra hoan hao : ");
        n=new Scanner(System.in).nextInt();
        if(hoanhaoYorN(n)==1)
            System.out.println("n là so hoan hao");
        else
            System.out.println("n khong la so hoan hao ");
       
        System.out.println("Cac so hoan hao <n: ");
        for(i=2;i<n;i++)
            if(hoanhaoYorN(i)==1)
            System.out.printf("   "+i);
        System.out.printf("\n");
        
    }
    public int ucln(int x,int y){
        while(x*y!=0){
            if(x>y){
                x%=y;
            }
            else 
                y%=x;
        }
        return x+y;
        
    }
    public void tucln(){
        int a,b;
        System.out.println("nhap a,b tim UCLN : ");
        a=new Scanner(System.in).nextInt();
        b=new Scanner(System.in).nextInt();
        System.out.println("UCLN(a,b)=  "+ ucln(a,b));
    }
    public void phanso(){
        int x;int y;
        System.out.println("nhap tu so, mau so: ");
        x=new Scanner(System.in).nextInt();
        y=new Scanner(System.in).nextInt();
        
       int t=x/ucln(x,y);
        int m=y/ucln(x,y);
        if(m!=1){
            System.out.println("phan so sau rut gon: "+t+"/"+m);
        }
        else
            System.out.println("phan so sau rut gon: "+t);
        
    }
    public static void main(String[] args) {

        Bài299 sc= new Bài299();
        sc.ktnt();
        sc.kthh();
        sc.tucln();
        sc.phanso();
        
        
        
    }
    
}
