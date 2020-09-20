
package bai8phanso;

import java.util.Scanner;
public class input {
    private int ts;
    private  int ms;

    public input() {
    }

    public input(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public int getMs() {
        return ms;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }
    Scanner sc=new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap tu so: ");
        ts=sc.nextInt();
        System.out.println("Nhap mau so: ");
        ms=sc.nextInt();
    }
    public void in(){
        System.out.println(ts+"/"+ms);
    }
    private int ucln(int a, int b) {
        if (b > a) {
            int t;
            t = a;
            a = b;
            b = t;
        }
        int kq = 1, i;
        for (i = 2; i <= b; i++) {
            if (((a % i) == 0) && (b % i) == 0) kq = i;
        }
        return kq;
    }
    private int bcnn(int a, int b) {
        if (b > a) {
            int t;
            t = a;
            a = b;
            b = t;
        }
        int i,kq = a*b;
        for (i = a; i < (a*b)+1; i++) {
            if (((i % a) == 0) && (i % b) == 0) kq=i;
        }
        return kq;
    }
    public void rutPs(){
        int t = ucln(this.ts,this.ms);
        this.ts=this.ts/t;
        this.ms=this.ms/t;
    }
    public void congPs(int ts2, int ms2){
        if(this.ms != ms2) {
            int t = bcnn(this.ms,ms2);
            int ms1=this.ms*(t/this.ms);
            int ts1=this.ts*(t/this.ms);
            ts2=ts2*(t/ms2);
            ms2=ms1;
            System.out.println(ts1+"/"+ms1+"+"+ts2+"/"+ms2);
            
            int tskq=ts1+ts2;
            int mskq=ms1;
            int tmp = ucln(tskq,mskq);
            tskq=tskq/tmp;
            mskq=mskq/tmp;
            System.out.println("Ket qua: "+tskq+"/"+mskq);

        }
        else {
            int ts1 = this.ts;
            int ms1 = this.ms;
            int tskq = ts1 + ts2;
            int mskq = ms1;
            int tmp = ucln(tskq, mskq);
            tskq = tskq / tmp;
            mskq = mskq / tmp;
            System.out.println("Ket qua: " + tskq + "/" + mskq);
        }
    }
    public void truPs(int ts2, int ms2){
        if(this.ms != ms2) {
            int t = bcnn(this.ms,ms2);
            int ms1=this.ms*(t/this.ms);
            int ts1=this.ts*(t/this.ms);
            ts2=ts2*(t/ms2);
            ms2=ms1;
            System.out.println(ts1+"/"+ms1+"-"+ts2+"/"+ms2);
            
            int tskq=ts1-ts2;
            int mskq=ms1;
            int tmp = ucln(tskq,mskq);
            tskq=tskq/tmp;
            mskq=mskq/tmp;
            System.out.println("Ket qua: "+tskq+"/"+mskq);

        }
        else {
            int ts1 = this.ts;
            int ms1 = this.ms;
            int tskq = ts1 - ts2;
            int mskq = ms1;
            int tmp = ucln(tskq, mskq);
            tskq = tskq / tmp;
            mskq = mskq / tmp;
            System.out.println("Ket qua: " + tskq + "/" + mskq);
        }
    }
    public void nhanPs(int ts2, int ms2){
        int tskq=this.ts*ts2;
        int mskq=this.ms*ms2;
        int tmp = ucln(tskq, mskq);
        tskq = tskq / tmp;
        mskq = mskq / tmp;
        System.out.println("Ket qua: " + tskq + "/" + mskq);
    }
    public void chiaPs(int ts2, int ms2){
        int tskq=this.ts*ms2;
        int mskq=this.ms*ts2;
        int tmp = ucln(tskq, mskq);
        tskq = tskq / tmp;
        mskq = mskq / tmp;
        System.out.println("Ket qua: " + tskq + "/" + mskq);
    }
    public void toDecimal(){
        System.out.println("Kết quả: "+(double)this.ts/this.ms);
    }    
}
