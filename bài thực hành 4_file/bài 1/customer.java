/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author green
 */
public class customer implements java.io.Serializable{
    private String id;
    private String name;
    private Date dob;

    public customer(String id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        //format lại cách in ra nếu không có cái này thì khi gọi các
        //thành phần KH được lưu vào arraylist nó sẽ trả về địa chỉ cùa nó
        SimpleDateFormat spD = new SimpleDateFormat("dd/MM/yyyy");
        String str = spD.format(getDob());
        return "customer{" + "id=" + id + ", name=" + name + ", date of birth=" + str + '}';
    }
}
