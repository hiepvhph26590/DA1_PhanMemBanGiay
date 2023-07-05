/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import domainmodel.NhanVien;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import repository.NhanVienRepository;

/**
 *
 * @author Admin
 */
public class FrmNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form FrmNhanVien
     */
    private DefaultTableModel dtm;
    private ButtonGroup buttonGroup = new ButtonGroup();
    private NhanVienRepository nhanVienRepository = new NhanVienRepository();

    public FrmNhanVien() {
        initComponents();
        rdGioiTinh();
        loadData(nhanVienRepository.getAll());
    }

    public void rdGioiTinh() {
        buttonGroup.add(rdNam);
        buttonGroup.add(rdNu);
    }

    public void loadData(List<NhanVien> list) {
        dtm = (DefaultTableModel) tbNhanVien.getModel();
        dtm.setRowCount(0);
        for (NhanVien nhanVien : list) {
            Object[] row = new Object[]{
                nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getGioiTinh(),
                nhanVien.getEmail(), nhanVien.getQueQuan(), nhanVien.getNgaySinh(),
                nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), getTTrangThai(nhanVien.getTrangThai())
            };
            dtm.addRow(row);
        }
    }

    public String getTTrangThai(int trangThai) {
        if (trangThai == 0) {
            return "Hoạt Động";
        } else if (trangThai == 1) {
            return "Ngừng Hoạt Động";
        } else {
            return null;
        }
    }

    private NhanVien getNhanVien() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMaNV(txtManv.getText());
        nhanVien.setTenNV(txtTennv.getText());
        if (rdNam.isSelected()) {
            nhanVien.setGioiTinh("Nam");
        } else if (rdNu.isSelected()) {
            nhanVien.setGioiTinh("Nữ");
        }
        nhanVien.setEmail(txtEmail.getText());
        nhanVien.setQueQuan(txtQuequan.getText());
        nhanVien.setNgaySinh(date.getDate());
        nhanVien.setTaiKhoan(txtTaiKhoan.getText());
        nhanVien.setMatKhau(txtMatKhau.getText());
        nhanVien.setTrangThai(Integer.parseInt((String) cbTT.getSelectedItem()));

        return nhanVien;
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
        tbNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtQuequan = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        cbTT = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 102));

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Email", "Quê Quán", "Ngày Sinh", "Tài Khoản", "Mật Khẩu", "Trạng Thái"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Nhân Viên");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giới Tính");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quê Quán");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ngày Sinh");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tài Khoản");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mật Khẩu");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Trạng Thái");

        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setText("Nam");

        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhật");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        cbTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt Động", "Ngừng Hoạt Động" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtQuequan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(54, 54, 54)
                        .addComponent(rdNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdNu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtTennv)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnLamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnSua)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTaiKhoan)
                            .addComponent(txtMatKhau)
                            .addComponent(cbTT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(185, 185, 185))))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQuequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        NhanVien nhanVien = getNhanVien();
        nhanVienRepository.addNhanVien(nhanVien);
        loadData(nhanVienRepository.getAll());
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        NhanVien nhanVien = getNhanVien();
        nhanVienRepository.updateNhanVien(nhanVien);
        loadData(nhanVienRepository.getAll());
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        int row = tbNhanVien.getSelectedRow();
        dtm = (DefaultTableModel) tbNhanVien.getModel();
        txtManv.setText(tbNhanVien.getValueAt(row, 0).toString());
        txtTennv.setText(tbNhanVien.getValueAt(row, 1).toString());
        if (tbNhanVien.getValueAt(row, 2).toString().equals("nam")) {
            rdNam.setSelected(true);
            rdNu.setSelected(false);
        } else {
            rdNu.setSelected(true);
        }
        txtEmail.setText(tbNhanVien.getValueAt(row, 3).toString());
        txtQuequan.setText(tbNhanVien.getValueAt(row, 4).toString());
        date.setDate((Date) tbNhanVien.getValueAt(row, 5));
        txtTaiKhoan.setText(tbNhanVien.getValueAt(row, 6).toString());
        txtMatKhau.setText(tbNhanVien.getValueAt(row, 7).toString());
        cbTT.setSelectedItem(tbNhanVien.getValueAt(row, 8));
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        txtManv.setText("");
        txtEmail.setText("");
        txtMatKhau.setText("");
        txtQuequan.setText("");
        txtTaiKhoan.setText("");
        txtTennv.setText("");
        buttonGroup.clearSelection();
        cbTT.setSelectedIndex(0);
        date.setDate(null);
    }//GEN-LAST:event_btnLamMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbTT;
    private com.toedter.calendar.JDateChooser date;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtQuequan;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTennv;
    // End of variables declaration//GEN-END:variables
}