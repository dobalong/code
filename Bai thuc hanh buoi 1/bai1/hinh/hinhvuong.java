
package bai1.hinh;
public class hinhvuong extends hinhhoc {
   
    private float canh;
    hinhvuong(){super();}
     hinhvuong (float cdai,float crong,float canh){
        super(cdai,crong);
        this.canh=cdai;
    }
     @Override
     public void out(){
         System.out.println("hinh vuong:");
         System.out.println("dien tich hinh vuong: "+(this.canh*this.canh));
         System.out.println("chu vi hinh vuong: "+(this.canh*4));
     }
     @Override
     public void in(){
         super.in();
     }  
}
