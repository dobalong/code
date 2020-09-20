
package bài.pkg4matran;
import java.util.Scanner;
public class Bài4matran {
    int n,m;
    int a[][];
    public void nhap(){
        System.out.println("nhap co ma tran n*m: ");
        n=new Scanner(System.in).nextInt();
        m=new Scanner(System.in).nextInt();
        a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("nhap phan tu thu A"+i+j+": ");
                a[i][j]=new Scanner(System.in).nextInt();
            }
        }
        
    }
    public void in(){
        System.out.println("Ma tran A: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("   "+a[i][j]);
            }
            System.out.print("\n");
        }
    }
    public int ktnt(int a){
         if(a<2){ return 0;}
         else {
            for(int i=2;i<a;i++){
               if(a%i == 0){
               return 0;
               }
            }
                return 1;
        }
     }
    public void tnt(){
        System.out.print("\n cac so nt:  ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ktnt(a[i][j])==1){
                    System.out.print("  "+a[i][j]);
                }
            }
        }
    }
    public void max(){
        int max=a[0][0];
        int c=0,b=0;
        for( int i=0;i<n;i++)
            for( int j=0;j<m;j++){
             if(a[i][j]>max){
                 max=a[i][j];
                c=i;b=j;
             }   
            }
        System.out.println("\nmax= "+ max);
        System.out.println("vi tri A"+c+b);
        
        
    }
    public void sxc(){
        for(int k=0;k<n;k++)
            for(int i=0;i<m-1;i++)
                for(int j=m-1;j>i;j--)
                    if(a[j][k]<a[j-1][k]){
                        int temp=a[j][k];
                        a[j][k]=a[j-1][k];
                        a[j-1][k]=temp;
                    }
        in();
    }
    public static void main(String[] args) {
        Bài4matran b= new Bài4matran();
        b.nhap();
        b.in();
        b.tnt();
        b.max();
        b.sxc();
    }
    
}
