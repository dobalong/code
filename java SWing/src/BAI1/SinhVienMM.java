/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.util.Date;

/**
 *
 * @author BA LONG
 */
public class SinhVienMM extends SinhVien{
    private String donvi;
    private float luong;

    public SinhVienMM() {
    }

    public SinhVienMM(String donvi, float luong, String masv, String hoten, String gioitinh, float diemtb, Date ngaysinh) {
        super(masv, hoten, gioitinh, diemtb, ngaysinh);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public float getLuong() {
        return luong;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    @Override
    public String toString(){
        return "Sinh vien Mat Ma: "+super.toString()+",Don vi:"+donvi+",Luong: "+luong;
    }
}
