/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai141;

import java.util.Scanner;

/**
 *
 * @author BA LONG
 */
public class MaTran {
    int dong;
    int cot;
    int[][] mang;
    
    MaTran() {};
    MaTran(int n, int m) {
        this.dong = n;
        this.cot = m;
        mang = new int[n][m];
    };
    
    static MaTran nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap m: ");
        int m = Integer.parseInt(sc.nextLine());
        MaTran ma_tran = new MaTran(n, m);
        for (int i = 0; i < ma_tran.dong; i ++) {
            for (int j = 0; j < ma_tran.cot; j ++) {
                System.out.println("Nhap phan tu thu [" + i + ", " + j + "]: ");
                ma_tran.mang[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        return ma_tran;
    }
    
    public void in_ma_tran() {
        for (int i = 0; i < this.dong; i ++) {
            for (int j = 0; j < this.cot; j ++) {
                System.out.print(this.mang[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    
    public MaTran cong_ma_tran(MaTran ma_tran) {
        if (this.dong == ma_tran.dong && this.cot == ma_tran.cot) {
            MaTran C = new MaTran(this.dong, this.cot);
            for (int i = 0; i < this.dong; i ++) {
                for (int j = 0; j < this.cot; j ++) {
                    C.mang[i][j] = this.mang[i][j] + ma_tran.mang[i][j];
                }
            }
            return C;
        } else {
            return null;
        }
    }
    public MaTran hieu_ma_tran(MaTran ma_tran) {
        if (this.dong == ma_tran.dong && this.cot == ma_tran.cot) {
            MaTran C = new MaTran(this.dong, this.cot);
            for (int i = 0; i < this.dong; i ++) {
                for (int j = 0; j < this.cot; j ++) {
                    C.mang[i][j] = this.mang[i][j] - ma_tran.mang[i][j];
                }
            }
            return C;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
         System.out.println("Nhap va in ma tran A");
        MaTran A = MaTran.nhap();
        A.in_ma_tran();
        System.out.println("Nhap va in ma tran B");
        MaTran B = MaTran.nhap();
        B.in_ma_tran();
        
        System.out.println("Cong ma tran");
        MaTran C = A.cong_ma_tran(B);
        if (C == null) {
            System.out.println("Khong the cong ma tran");
        } else {
            C.in_ma_tran();
        }
    }
    
    
}
