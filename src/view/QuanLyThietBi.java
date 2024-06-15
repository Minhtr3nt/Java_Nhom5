/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import FileController.FileData;
import Model.ThietBi;
import Model.ThietBiHoTro;
import Model.ThietBiThucHanh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abccc
 */
public class QuanLyThietBi extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyThietBi
     */
    String filename = "Data.txt";
    FileData io = new FileData();
    List<ThietBi> dsTB = new ArrayList<>(io.readObjectFromFile(filename));
    private DefaultTableModel modelThietbiThuchanh;
    private DefaultTableModel modelThietbiHotro;
    public QuanLyThietBi() {
        initComponents();
        modelThietbiThuchanh = (DefaultTableModel) jTable1.getModel();
        modelThietbiHotro = (DefaultTableModel) jTable2.getModel();
        this.showThietBi();
    }
    public void showThietBi(){
        modelThietbiThuchanh.setRowCount(0);
        modelThietbiHotro.setRowCount(0);
        for(ThietBi TB: dsTB){
            if(TB instanceof ThietBiThucHanh){
                modelThietbiThuchanh.addRow(new Object[]{ TB.getTenDN(), TB.getMatKhau(),TB.getMaTb(), TB.getTenTb(),TB.getSoLuong(), TB.getNamSX(), TB.getLoaiThietBi(), TB.getGhiChu(),  TB.getDanhGia()});
            }
            if(TB instanceof ThietBiHoTro){
                 modelThietbiHotro.addRow(new Object[]{TB.getTenDN(), TB.getMatKhau(), TB.getMaTb(), TB.getTenTb(),TB.getSoLuong(), TB.getNamSX(), TB.getLoaiThietBi(), TB.getGhiChu(),  TB.getDanhGia()});
            }       
        }
    }
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
            io.WriteObjectToFile(dsTB, filename);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi ghi dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }
    void checkTKSua(String MaTB, String Tendn, String Matkhau, String TenTB, int SoLuong, int NamSX,  String GhiChu){
        int selectedRow = jTable1.getSelectedRow();
       
        if(selectedRow != -1){
            String MaTBSua = (String)jTable1.getValueAt(selectedRow , 2);
            for(ThietBi tb : dsTB){
                if(tb.getMaTb().equals(MaTBSua)){
                    tb.setTk(Tendn, Matkhau);
                    tb.setTenTb(TenTB);
                    
                    tb.setNamSX(NamSX);
                    tb.setSoLuong(SoLuong);
                    tb.setGhiChu(GhiChu);
                }
            }
            
            io.WriteObjectToFile(dsTB, filename);
            
            this.showThietBi();
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GhiChutxt = new javax.swing.JTextArea();
        LoaiTBtxt = new javax.swing.JComboBox<>();
        SoLuongtxt = new javax.swing.JTextField();
        NamSXtxt = new javax.swing.JTextField();
        TenTBtxt = new javax.swing.JTextField();
        MaTBtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên ĐN", "Mật Khẩu", "Mã Thiết Bị", "Tên Thiết Bị", "Số Lượng", "Năm Sản Xuất", "Loại Thiết Bị", "Ghi Chú", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Bảng Thiết Bị Thực Hành");

        jLabel2.setText("Bảng Thiết Bị Hỗ Trợ");

        jLabel3.setText("Tên Đăng Nhập");

        jLabel4.setText("Mật Khẩu");

        jLabel5.setText("Nhập lại mật khẩu");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã Thiết Bị");

        jLabel7.setText("Tên Thiết Bị");

        jLabel8.setText("Năm Sản Xuất");

        jLabel9.setText("Số Lượng");

        jLabel10.setText("Loại Thiết Bị");

        jLabel11.setText("Ghi Chú");

        GhiChutxt.setColumns(20);
        GhiChutxt.setRows(5);
        jScrollPane3.setViewportView(GhiChutxt);

        LoaiTBtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hỗ trợ", "Thực hành" }));
        LoaiTBtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiTBtxtActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Quản lý thiết bị");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên ĐN", "Mật Khẩu", "Mã Thiết Bị", "Tên Thiết Bị", "Số Lượng", "Năm Sản Xuất", "Loại Thiết Bị", "Ghi Chú", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(65, 65, 65)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(32, 32, 32)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(MaTBtxt))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NamSXtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(TenTBtxt))
                                    .addComponent(LoaiTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(163, 163, 163)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80))
                                    .addComponent(SoLuongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TenTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SoLuongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(LoaiTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamSXtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(MaTBtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoaiTBtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiTBtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoaiTBtxtActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
   // Hàm xử lý sự kiện nhấn nút sửa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        
        String GhiChu = GhiChutxt.getText();
        checkTKSua(MaTB,Tendn,Matkhau,TenTB, SoLuong, NamSX, GhiChu );
        this.showThietBi();
    }//GEN-LAST:event_jButton2ActionPerformed
    // Hàm xử lý sự kiện khi nhấn thêm
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
        this.showThietBi();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //Hàm xử lý khi nhấn button xóa
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         int selectedRow = jTable1.getSelectedRow();
    int selectedRow2 = jTable2.getSelectedRow();

    if(selectedRow != -1){
        String MaTBXoa = (String) jTable1.getValueAt(selectedRow, 2);
        Iterator<ThietBi> iterator = dsTB.iterator();
        while (iterator.hasNext()) {
            ThietBi TB = iterator.next();
            if (TB.getMaTb().equals(MaTBXoa)) {
                iterator.remove();
            }
        }

        this.showThietBi();
        io.WriteObjectToFile(dsTB, filename);
    }

    if(selectedRow2 != -1){
        String MaTBXoa2 = (String) jTable2.getValueAt(selectedRow2, 2);
        Iterator<ThietBi> iterator2 = dsTB.iterator();
        while (iterator2.hasNext()) {
            ThietBi TB = iterator2.next();
            if (TB.getMaTb().equals(MaTBXoa2)) {
                iterator2.remove();
            }
        }

        this.showThietBi();
        io.WriteObjectToFile(dsTB, filename);
    }
    }//GEN-LAST:event_jButton3ActionPerformed
    // Xử lý nút thoát
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuAdmin secondForm = new MenuAdmin();
                        secondForm.setVisible(true);
                        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThietBi().setVisible(true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
