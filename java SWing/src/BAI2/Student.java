/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2;

import java.util.Date;


public class Student extends  Person{
    private String masv;
    private String email;
    private float diem;

    public Student() {
    }

    public Student(String masv, String email, float diem, String hoten, String diachi, String gioitinh, Date ngaysinh) {
        super(hoten, diachi, gioitinh, ngaysinh);
        this.masv = masv;
        this.email = email;
        this.diem = diem;
    }

    public String getMasv() {
        return masv;
    }

    public String getEmail() {
        return email;
    }

    public float getDiem() {
        return diem;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    @Override
    public String toString(){
        return "Ma SV: "+masv+super.toString()+",Email: "+email+",Diem: "+diem;
    }
}
