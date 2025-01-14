/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import FileController.FileData;
import Model.TaiKhoan;
import Model.ThietBi;
import Model.ThietBiHoTro;
import Model.ThietBiThucHanh;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author abccc
 */
public class DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
        LoaiTBtxt.removeAllItems();
        LoaiTBtxt.addItem("Hỗ trợ");
        LoaiTBtxt.addItem("Thực hành");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MaTBtxt = new javax.swing.JTextField();
        TenTBtxt = new javax.swing.JTextField();
        NamSXtxt = new javax.swing.JTextField();
        SoLuongtxt = new javax.swing.JTextField();
        LoaiTBtxt = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        GhiChutxt = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Đăng Ký Thiết Bị");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Tên Đăng Nhập");

        jLabel3.setText("Mật Khẩu");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Đăng Ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nhập lại mật khẩu");

        jLabel5.setText("Mã Thiết Bị");

        jLabel6.setText("Tên Thiết Bị");

        jLabel7.setText("Số Lượng");

        jLabel8.setText("Năm Sản Xuất");

        jLabel9.setText("Loại Thiết Bị");

        jLabel10.setText("Ghi Chú");

        LoaiTBtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LoaiTBtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiTBtxtActionPerformed(evt);
            }
        });

        GhiChutxt.setColumns(20);
        GhiChutxt.setRows(5);
        jScrollPane1.setViewportView(GhiChutxt);

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LoaiTBtxt, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                        .addComponent(NamSXtxt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SoLuongtxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(MaTBtxt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(TenTBtxt)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MaTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TenTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NamSXtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SoLuongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LoaiTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 64, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Sự kiện khi nhấn nút đăng ký
    FileData<ThietBi> iofile = new FileData<>();
    String filename = "Data.txt";
    List<ThietBi> dsTB = new ArrayList<>(iofile.readObjectFromFile(filename));
     void checkTK(String MaTB, String Tendn, String Matkhau, String TenTB, int SoLuong, int NamSX, String LoaiTB, String GhiChu){
        if (dsTB != null) {
            for (ThietBi tk : dsTB) {
                if (tk.getTenDN().equals(Tendn)) {
                    JOptionPane.showMessageDialog(null, "Tên đăng nhập đã tồn tại", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (tk.getMaTb().equals(MaTB)) {
                    JOptionPane.showMessageDialog(null, "Mã thiết bị đã tồn tại", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    return;
                
                }
            }
        } else {
            dsTB = new ArrayList<>();
           
        }
        if(LoaiTB.equals("Hỗ trợ")){
            ThietBiHoTro tb = new ThietBiHoTro();
            tb.setMaTb(MaTB);
            tb.setTk(Tendn, Matkhau);
            tb.setTenTb(TenTB);
            tb.setLoaiThietBi(LoaiTB);
            tb.setNamSX(NamSX);
            tb.setSoLuong(SoLuong);
            tb.setGhiChu(GhiChu);
            dsTB.add(tb);
            JOptionPane.showMessageDialog(null, "Đã thêm thiết bị hỗ trợ vào dữ liệu", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            ThietBiThucHanh tb = new ThietBiThucHanh();
            tb.setMaTb(MaTB);
            tb.setTk(Tendn, Matkhau);
            tb.setTenTb(TenTB);
            tb.setLoaiThietBi(LoaiTB);
            tb.setNamSX(NamSX);
            tb.setSoLuong(SoLuong);
            tb.setGhiChu(GhiChu);
            dsTB.add(tb);
            JOptionPane.showMessageDialog(null, "Đã thêm thiết bị thực hành vào dữ liệu", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
        
        try {
            iofile.WriteObjectToFile(dsTB, filename);
            JOptionPane.showMessageDialog(null, "Đã đăng ký thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi ghi dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Tài khoản không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jPasswordField1.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jPasswordField2.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(MaTBtxt.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Mã thiết bị không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(TenTBtxt.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Tên thiết bị không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(SoLuongtxt.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Số lượng thiết bị không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
             if(Integer.parseInt(SoLuongtxt.getText()) < 0)
                 JOptionPane.showMessageDialog(null, "Số lượng thiết bị không hợp lệ, phải là số nguyên lớn hơn 0", "Thông báo", JOptionPane.WARNING_MESSAGE);
             return;
        }
        
        if(NamSXtxt.getText().trim().length()==0){
            
             JOptionPane.showMessageDialog(null, "Năm sản xuất không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            if(Integer.parseInt(NamSXtxt.getText()) < 0){
                JOptionPane.showMessageDialog(null, "Năm sản xuất thiết bị không hợp lệ", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
             return;
        }
        
        if(MaTBtxt.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "Mã thiết bị không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String Tendn = jTextField1.getText();
        String Matkhau = jPasswordField1.getText();
        String MaTB = MaTBtxt.getText();
        String TenTB = TenTBtxt.getText();
        int SoLuong = Integer.parseInt(SoLuongtxt.getText());
        int NamSX = Integer.parseInt(NamSXtxt.getText());
        String LoaiTB = (String) LoaiTBtxt.getSelectedItem();
        String GhiChu = GhiChutxt.getText();
        checkTK(MaTB,Tendn,Matkhau,TenTB, SoLuong, NamSX, LoaiTB, GhiChu );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LoaiTBtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiTBtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoaiTBtxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DangNhap secondForm = new DangNhap();
                        secondForm.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
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
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea GhiChutxt;
    private javax.swing.JComboBox<String> LoaiTBtxt;
    private javax.swing.JTextField MaTBtxt;
    private javax.swing.JTextField NamSXtxt;
    private javax.swing.JTextField SoLuongtxt;
    private javax.swing.JTextField TenTBtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
