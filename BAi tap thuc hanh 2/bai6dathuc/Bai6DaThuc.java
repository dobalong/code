
package bai6dathuc;


public class Bai6DaThuc {

   
    public static void main(String[] args) {
       Input p=new Input();
       Input q=new Input();
        System.out.println("Nhập đa thức thứ nhất: ");
        p.inputInfo();
        p.outputInfo();
        System.out.println("Nhập đa thức thứ hai: ");
        q.inputInfo();
        q.outputInfo();
        System.out.println("Kết quả cộng 2 đa thức: ");
        p.addPolynomial(q.getStage(),q.getEntry());
        System.out.println("Kết quả trừ 2 đa thức: ");
        p.subtractPolynomial(q.getStage(), q.getEntry());       
    }
    
}
