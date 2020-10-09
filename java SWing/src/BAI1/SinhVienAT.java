/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.util.Date;


public class SinhVienAT extends SinhVien{
    private float hocphi;

    public SinhVienAT() {
    }

    public SinhVienAT(float hocphi, String masv, String hoten, String gioitinh, float diemtb, Date ngaysinh) {
        super(masv, hoten, gioitinh, diemtb, ngaysinh);
        this.hocphi = hocphi;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }
    @Override
    public String toString(){
        return "Sinh Vien HTTT: "+super.toString()+", Hoc Phi: "+hocphi;
    }
    
    
}
