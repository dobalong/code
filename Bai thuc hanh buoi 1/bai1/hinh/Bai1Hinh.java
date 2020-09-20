/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.hinh;
public class Bai1Hinh {
    public static void main(String[] args) {
        hinhhoc hh=new hinhhoc(){
            @Override
            public void nhap(){
        }
    };
        
    hh.nhap();
    if(hh.getcdai()==hh.getcrong()){
        hh = new hinhvuong(hh.getcdai(),hh.getcrong());
    }
    else{
        hh= new hinhchunhat(hh.getcdai(),hh.getcrong());
    }
    hh.out();
    hh.in();
}
}
