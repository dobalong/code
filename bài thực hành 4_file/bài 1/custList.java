/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author green
 */
public class custList {

    private ArrayList<customer> ctmList;

    public custList(ArrayList<customer> ctmList) {
        this.ctmList = ctmList;
    }

    public custList() {
        //khởi tạo arraylist gọi hàm khởi tạo k tham số truyền vào
        this.ctmList = new ArrayList<>();
    }

    public void add() {
        customer ctm;
        String cont;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap thong SV");
            ctm = new customer();
            System.out.println("Nhap ID");
            ctm.setId(sc.nextLine());
            System.out.println("Nhap ten");
            ctm.setName(sc.nextLine());
            System.out.println("Nhap ngay sinh 'yyyy/mm/dd'");
            Date date = new Date(sc.nextLine());
            ctm.setDob(date);
            ctmList.add(ctm);
            System.out.println("Da them !!");
            System.out.println("Nhap 'c' de tiep tuc nhap");
            cont = sc.nextLine();
        } while ("c".equals(cont));
    }

    public void out() {
        System.out.println("" + this.ctmList);
    }

    public boolean load(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            return false;
        } else {
            ArrayList<customer> arr1 = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                arr1 = (ArrayList<customer>) ois.readObject();
                this.ctmList = arr1;
                return true;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public boolean save(String pathname) {
        File file = new File(pathname);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.ctmList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}
