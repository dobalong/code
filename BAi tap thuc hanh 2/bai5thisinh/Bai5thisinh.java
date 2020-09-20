
package bai5thisinh;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;
import java.util.Comparator;

public class Bai5thisinh {
    public static void main(String[] args) {
        ArrayList<Thisinh> list = new ArrayList<>(100);
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Nhập số thí sinh: ");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            Thisinh t = new Thisinh();
            t.nhap();
            list.add(t);

        }
        float max = list.get(0).diemtong();
        int indexMax = 0;
        for(i=1;i<list.size();i++){
            if (list.get(i).diemtong()>max) {
                max = list.get(i).diemtong();
                indexMax = i;
            }
        }
        System.out.println("Thông tin của thí sinh có tổng điểm cao nhất: ");
        list.get(indexMax).xuatTS();
        Collections.sort(list, (Thisinh o1, Thisinh o2) -> o1.getHoten().compareTo(o2.getHoten()));
        System.out.println("MTS\t\tTÊN\t\tĐIỂM TOÁN\t\tĐIỂM LÝ\t\tĐIỂM HOÁ\t\t ĐIỂM TỔNG");
        for(i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
