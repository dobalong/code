
package bai7matran;

import java.util.Scanner;
public class input {
   private int n;
   private int[][] a=new int[100][100];

    public input(int n) {
        this.n = n;
    }

    public input() {
    }

    public int getN() {
        return n;
    }

    public int[][] getA() {
        return a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
   public void nhap(){
       int i,j;
       Scanner sc= new Scanner(System.in);
       System.out.println("Nhap bac cua ma tran: ");
       n=sc.nextInt();
       System.out.println("nhap ca phan tu cua ma tran ");
       for( i=0;i<n;i++){
           for( j=0;j<n;j++){
               System.out.println("nhap gia tri tai a"+i+j+": ");
               a[i][j]=sc.nextInt();
           }
       }
   }
   public int sumcheochinh(){
       int i,j,sum=0;
       for(i=0;i<n;i++){
          sum+=a[i][i];   
       }
       return sum;
   }
   public int sumcheophu(){
       int i,j,sum=0;
       for(i=0;i<n;i++){
           sum+=a[i][n-i-1];
       }
       return sum;
   }
   public void output(){
       System.out.println("Bac cua ma tran: "+n);
       System.out.println("ma tran vuong vua nhap: ");
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(a[i][j]+"  ");
           }
           System.out.println();
       }
       System.out.println("tong cheo chinh= "+sumcheochinh());
       System.out.println("tong cheo phu= "+sumcheophu());
   }   
}
