/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BA LONG
 */
public class FromSV extends javax.swing.JFrame {
    ArrayList<SinhVienAT> dshtt=new ArrayList();
    ArrayList<SinhVienMM> dsmm=new ArrayList();
    /**
     * Creates new form FromSV
     * @param flast
     */
    public FromSV() {
        initComponents();
        this.setLocationRelativeTo(this);
        boolean flast = false;
        txtdonvi.setEnabled(flast);
        txtluong.setEnabled(flast);
        txthocphi.setEnabled(flast);
        jblhp.setEnabled(flast);
        jbllg.setEnabled(flast);
        jbldv.setEnabled(flast);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdiemtb = new javax.swing.JTextField();
        txtdonvi = new javax.swing.JTextField();
        jbldv = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        jbllg = new javax.swing.JLabel();
        txthocphi = new javax.swing.JTextField();
        jblhp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbogioitinh = new javax.swing.JComboBox<>();
        radhttt = new javax.swing.JRadioButton();
        radmm = new javax.swing.JRadioButton();
        btnluu = new javax.swing.JToggleButton();
        btnthem = new javax.swing.JToggleButton();
        btnxoa = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel3.setText("Mã Sinh Vien");

        jLabel4.setText("Họ và Tên");

        jLabel5.setText("Ngày Sinh");

        jLabel6.setText("Giới Tính");

        jbldv.setText("Đơn Vị");

        jbllg.setText("Luong");

        jblhp.setText("Học Phí");

        jLabel10.setText("Điểm TB");

        cbogioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbogioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbogioitinhActionPerformed(evt);
            }
        });

        buttonGroup1.add(radhttt);
        radhttt.setText("Sinh Vien HTTT");
        radhttt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radhtttActionPerformed(evt);
            }
        });

        buttonGroup1.add(radmm);
        radmm.setText("Sinh Vien Mat Ma");
        radmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmmActionPerformed(evt);
            }
        });

        btnluu.setText("LUU");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("RESET");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radhttt)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(153, 153, 153)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txthoten)
                                .addComponent(txtmasv)
                                .addComponent(txtngaysinh)
                                .addComponent(txtdiemtb)
                                .addComponent(cbogioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblhp)
                            .addComponent(jbldv)
                            .addComponent(jbllg))
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthocphi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radmm))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnthem)
                .addGap(107, 107, 107)
                .addComponent(btnluu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnxoa)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(cbogioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radhttt)
                            .addComponent(radmm))))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbldv)
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbllg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblhp)
                    .addComponent(txthocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnluu)
                    .addComponent(btnxoa)
                    .addComponent(btnthem))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbogioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbogioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbogioitinhActionPerformed

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        if(radmm.isSelected()){
            try {
                FileOutputStream fos=new FileOutputStream("svmm.dat");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(dsmm);
                JOptionPane.showMessageDialog(rootPane, "Luu DS thanh cong");
                oos.close();
                fos.close();
            } catch (HeadlessException | IOException e) {
            }
        }
        else if(radhttt.isSelected()){
            try {
                FileOutputStream fos =new FileOutputStream("svhttt.dat");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(dshtt);
                JOptionPane.showMessageDialog(rootPane, "LUU thanh cong DS");
                oos.close();
                fos.close();
            } catch (HeadlessException | IOException e) {
            }
        }
    }//GEN-LAST:event_btnluuActionPerformed

    private void radhtttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radhtttActionPerformed
        boolean flast = false;
        // TODO add your handling code here:
        txtdonvi.setEnabled(flast);
        txtluong.setEnabled(flast);
        txthocphi.setEnabled(true);
        jblhp.setEnabled(true);
        jbllg.setEnabled(flast);
        jbldv.setEnabled(flast);
    }//GEN-LAST:event_radhtttActionPerformed

    private void radmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmmActionPerformed
        // TODO add your handling code here:
        boolean flast = false;
        txtdonvi.setEnabled(true);
        txtluong.setEnabled(true);
        txthocphi.setEnabled(flast);
        jblhp.setEnabled(flast);
        jbllg.setEnabled(true);
        jbldv.setEnabled(true);
    }//GEN-LAST:event_radmmActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        txtmasv.setText("");
        txthoten.setText("");
        txtngaysinh.setText("");
        txtdiemtb.setText("");
        cbogioitinh.setSelectedItem("Nam");
        txtdonvi.setText("");
        txthocphi.setText("");
        txtluong.setText("");
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        if(radmm.isSelected()){
            SinhVienMM svmm=new SinhVienMM();
            svmm.setMasv(txtmasv.getText());
            svmm.setHoten(txthoten.getText());
            svmm.setDonvi(txtdonvi.getText());
            svmm.setDiemtb(Float.parseFloat(txtdiemtb.getText()));
            svmm.setLuong(Float.parseFloat(txtluong.getText()));
            svmm.setGioitinh(cbogioitinh.getSelectedItem().toString());
            SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
            try {
                svmm.setNgaysinh(sdf.parse(txtngaysinh.getText()));
            } catch (ParseException e) {
                 Logger.getLogger(FromSV.class.getName()).log(Level.SEVERE, null, e);
            }
            dsmm.add(svmm);
            System.out.println(dsmm.toString());
            JOptionPane.showMessageDialog(rootPane, "Xuat thanh cong");
        }
        else if(radhttt.isSelected()){
            SinhVienAT svht=new SinhVienAT();
            svht.setMasv(txtmasv.getText());
            svht.setHoten(txthoten.getText());
            svht.setDiemtb(Float.parseFloat(txtdiemtb.getText()));
            svht.setHocphi(Float.parseFloat(txthocphi.getText()));
            SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
            try {
                svht.setNgaysinh(sdf.parse(txtngaysinh.getText()));
            } catch (ParseException e) {
                 Logger.getLogger(FromSV.class.getName()).log(Level.SEVERE, null, e);
            }
            dshtt.add(svht);
            System.out.println(dsmm.toString());
            JOptionPane.showMessageDialog(rootPane, "Xuat thanh cong");
        }
        
        
    }//GEN-LAST:event_btnthemActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FromSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnluu;
    private javax.swing.JToggleButton btnthem;
    private javax.swing.JToggleButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbogioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jbldv;
    private javax.swing.JLabel jblhp;
    private javax.swing.JLabel jbllg;
    private javax.swing.JRadioButton radhttt;
    private javax.swing.JRadioButton radmm;
    private javax.swing.JTextField txtdiemtb;
    private javax.swing.JTextField txtdonvi;
    private javax.swing.JTextField txthocphi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtngaysinh;
    // End of variables declaration//GEN-END:variables
}
