/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.hinh;
public class hinhchunhat extends hinhhoc {
    public hinhchunhat(float cdai,float crong){
        super(cdai,crong);
    }
    @Override
    public void out(){
        System.out.println("Hinh chu nhat: ");
        System.out.println(" dien tich HCN: "+(this.cdai*this.crong));
        System.out.println("Chu vi HCN: "+(this.crong+this.cdai)*2);
    }
    @Override
    public void in(){
        super.in();
    }
}
