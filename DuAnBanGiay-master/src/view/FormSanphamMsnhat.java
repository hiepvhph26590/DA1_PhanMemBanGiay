/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import domainmodel.Anh;
import domainmodel.ChiTietSP;
import domainmodel.DanhMuc;
import domainmodel.DongSP;
import domainmodel.MauSac;
import domainmodel.SanPham;
import domainmodel.Size;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import repository.SanPhamRepository;
import service.DongspService;
import service.ISizeService;
import service.MausacService;
import service.impl.DongspServiceimpl;
import service.impl.MausacServiceimpl;
import service.impl.SizeServiceiml1;
import service.DanhMucService;
import service.IAnhService;
import service.SanphamService;
import service.impl.AnhService;
import service.impl.DanhMucServiceimpl;
import service.impl.SanphamServiceimpl;
import viewmodel.SanphamProduct;


/**
 *
 * @author PC DUNG
 */
public class FormSanphamMsnhat extends javax.swing.JPanel {
    DefaultTableModel defaultTable = new DefaultTableModel();
    /**
     * Creates new form FormSanphamMsnhat
     */
    
     List<SanphamProduct> listSanpham = new ArrayList<>();
    List<MauSac> listMausac = new ArrayList<>();
    List<DongSP> listDongsp = new ArrayList<>();
    List<Size> listSize = new ArrayList<>();
    List<DanhMuc> listDanhmuc = new ArrayList<>();
    List<Anh> listAnh = new ArrayList<>();

    MausacService service_mausac = new MausacServiceimpl();
    DongspService service_dongsp = new DongspServiceimpl();
    ISizeService service_size = new SizeServiceiml1();
    DanhMucService service_danhmuc = new DanhMucServiceimpl();
//    
    SanphamService service_sanpham = new SanphamServiceimpl();

    IAnhService service_anh = new AnhService();
    
    public FormSanphamMsnhat() {
        initComponents();
        listSanpham = service_sanpham.getAllSp();
        listDongsp = service_dongsp.getListDongsp();
        listMausac = service_mausac.getListMausac();
        listSize = service_size.getall();
        listDanhmuc = service_danhmuc.getDanhMucs();
        listAnh = service_anh.getListAnh();
//        

        cboDongsp.setModel(new DefaultComboBoxModel(listDongsp.toArray()));
        cboMausac.setModel(new DefaultComboBoxModel(listMausac.toArray()));
        cboSize.setModel(new DefaultComboBoxModel(listSize.toArray()));
        cboDanhmuc.setModel(new DefaultComboBoxModel(listDanhmuc.toArray()));
        fillSanpham();
        
    }
     public void fillSanpham() {
        defaultTable.setRowCount(0);
        defaultTable = (DefaultTableModel) tblSanpham.getModel();
        for (SanphamProduct sp : listSanpham) {
            defaultTable.addRow(new Object[]{sp.getIdSp(), sp.getTensp(), sp.getAnh(), sp.getMoTa(), sp.getGia(), sp.getSoluong(),
                sp.getIdDongsp(), sp.getIdSize(), sp.getMaDanhmuc(), sp.getIdMausac(), sp.getThoiGianBH(),sp.TrangThai()});
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

        lblanh = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cboDongsp = new javax.swing.JComboBox<>();
        cboDanhmuc = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cboMausac = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtMaSp = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSoluong1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cboSize = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtNambh = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        lblTensp = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblDongsp1 = new javax.swing.JLabel();
        lblDanhmuc1 = new javax.swing.JLabel();
        lblMausac = new javax.swing.JLabel();
        lblMasp = new javax.swing.JLabel();
        lblSoluong = new javax.swing.JLabel();
        lblNambh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanpham = new javax.swing.JTable();
        cboTT = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnChon = new javax.swing.JButton();
        txtAnh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        lblanh.setBackground(new java.awt.Color(153, 255, 0));
        lblanh.setForeground(new java.awt.Color(102, 255, 0));
        lblanh.setText("ẢNH");

        jLabel18.setText("Tên SP:");

        jLabel17.setText("Giá:");

        jLabel15.setText("Dòng sp:");

        cboDanhmuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Danh mục:");

        jLabel29.setText("Màu sắc:");

        jLabel21.setText("Mã SP:");

        jLabel25.setText("Số lượng:");

        jLabel31.setText("Size:");

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel30.setText("Năm BH:");

        txtMota.setEditable(false);
        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane2.setViewportView(txtMota);

        jLabel28.setText("Mô tả");

        lblTensp.setForeground(new java.awt.Color(255, 0, 51));
        lblTensp.setText("-");

        lblGia.setForeground(new java.awt.Color(255, 0, 51));
        lblGia.setText("-");

        lblDongsp1.setForeground(new java.awt.Color(255, 0, 0));
        lblDongsp1.setText("-");

        lblDanhmuc1.setForeground(new java.awt.Color(255, 0, 51));
        lblDanhmuc1.setText("-");

        lblMausac.setForeground(new java.awt.Color(255, 0, 51));
        lblMausac.setText("-");

        lblMasp.setForeground(new java.awt.Color(255, 0, 0));
        lblMasp.setText("-");

        lblSoluong.setForeground(new java.awt.Color(255, 0, 0));
        lblSoluong.setText("-");

        lblNambh.setForeground(new java.awt.Color(255, 0, 51));
        lblNambh.setText("-");

        tblSanpham.setBackground(new java.awt.Color(204, 255, 255));
        tblSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sp", "Tên sp", "Ảnh", "Mô tả", "Đơn giá", "Số lượng", "Dòng sp", "Size", "Danh mục", "Màu", "Năm BH", "Trạng thái"
            }
        ));
        tblSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanpham);

        cboTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoat động", "Dừng hoạt động" }));

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnChon.setText("Chon ảnh");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboDanhmuc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboDongsp, javax.swing.GroupLayout.Alignment.LEADING, 0, 222, Short.MAX_VALUE)
                            .addComponent(txtTensp)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(115, 115, 115))
                            .addComponent(txtGia)
                            .addComponent(lblTensp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDongsp1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDanhmuc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMausac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMausac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(27, 27, 27)
                        .addComponent(cboSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtNambh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblNambh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSoluong1))))))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChon)
                        .addGap(816, 816, 816))))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnNew)
                .addGap(37, 37, 37)
                .addComponent(btnSave)
                .addGap(33, 33, 33)
                .addComponent(btnUpdate)
                .addGap(31, 31, 31)
                .addComponent(btnDelete)
                .addGap(72, 72, 72)
                .addComponent(cboTT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTensp)
                                    .addComponent(lblMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGia)
                                    .addComponent(lblSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel25)
                                    .addComponent(txtSoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel31)
                            .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addGap(8, 8, 8)
                        .addComponent(lblDongsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel30)
                            .addComponent(txtNambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDanhmuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNambh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMausac)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnChon)
                                .addComponent(txtAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(cboTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanphamMouseClicked
        // TODO add your handling code here:
        int index = tblSanpham.getSelectedRow();
        txtMaSp.setText(tblSanpham.getValueAt(index, 0).toString());
        txtTensp.setText(tblSanpham.getValueAt(index, 1).toString());
        //        txtAnh.setText(tblSanpham.getValueAt(index, 2).toString());
        txtGia.setText(tblSanpham.getValueAt(index, 4).toString());
        txtSoluong1.setText(tblSanpham.getValueAt(index, 5).toString());

        byte[] image = (listAnh.get(index).getUrlImage());
        ImageIcon icon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(lblanh.getWidth(), lblanh.getHeight(), Image.SCALE_SMOOTH));
        lblanh.setIcon(icon);

        if (tblSanpham.getValueAt(index, 6) == null) {
            lblDongsp1.setText("Sản phẩm không có mã dòng sản phẩm ");
        } else {
            lblDongsp1.setText("");
            for (int j = 0; j < listDongsp.size(); j++) {
                if (listDongsp.get(j).getTen().equals(tblSanpham.getValueAt(index, 6).toString())) {
                    cboDongsp.setSelectedIndex(j);
                }
            }
        }
        //
        //        if (tblSanpham.getValueAt(index, 7) == null) {
            //            lblSize.setText("Sản phẩm không có size ");
            //        } else {
            //            lblSize.setText("");
            //            for (int j = 0; j < listSize.size(); j++) {
                //                if (listSize.get(j).getSoSize().equals(tblSanpham.getValueAt(index, 7).toString())) {
                    //                    cboSize.setSelectedIndex(j);
                    //                }
                //            }
            //        }
        //        cboSize.setSelectedItem(tblSanpham.getValueAt(index, 7).toString());
        cboSize.getModel().setSelectedItem(tblSanpham.getValueAt(index,7).toString());

        //
        if (tblSanpham.getValueAt(index, 8) == null) {
            lblDanhmuc1.setText("Sản phẩm không có mã danh mục ");
        } else {
            lblDanhmuc1.setText("");
            for (int j = 0; j < listDanhmuc.size(); j++) {
                if (listDanhmuc.get(j).getTen().equals(tblSanpham.getValueAt(index, 8).toString())) {
                    cboDanhmuc.setSelectedIndex(j);
                }
            }
        }
        txtNambh.setText(tblSanpham.getValueAt(index, 10).toString());
        cboTT.getModel().setSelectedItem(tblSanpham.getValueAt(index,11).toString());
        //
        //
        if (tblSanpham.getValueAt(index, 9) == null) {
            lblMausac.setText("Sản phẩm không có màu sắc ");
        } else {
            lblMausac.setText("");
            for (int j = 0; j < listMausac.size(); j++) {
                if (listMausac.get(j).getTen().equals(tblSanpham.getValueAt(index, 9).toString())) {
                    cboMausac.setSelectedIndex(j);
                }
            }
        }

        txtMota.setText(tblSanpham.getValueAt(index,3).toString());
    }//GEN-LAST:event_tblSanphamMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtAnh.setText("");
        txtMaSp.setText("");
        txtTensp.setText("");
        txtGia.setText("");
        txtSoluong1.setText("");
        txtNambh.setText("");
        lblanh.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    
     public boolean checkSanpham(){
        if (txtMaSp.getText().isBlank()) {
            lblMasp.setText("Mã sản phẩm còn trống");
//            return false;

        } else {
            lblMasp.setText("");
        }

        if (txtTensp.getText().isBlank()) {
            lblTensp.setText("Tên sản phẩm còn trống");
//            return false;
        } else {
            lblTensp.setText("");
        }

        if (txtGia.getText().isBlank()) {
            lblGia.setText("Giá còn trống");
//            return false;
        } else {
            lblGia.setText("");
        }

        if (txtSoluong1.getText().isBlank()) {
            lblSoluong.setText("Số lượng còn trống");
//            return false;
        } else {
            lblSoluong.setText("");
        }

        if (txtNambh.getText().isBlank()) {
            lblNambh.setText("Năm còn trống");
            return false;
        } else {
            lblNambh.setText("");
        }
        return true;
    }
    
      SanPham themsanpham() {
        return new SanPham(txtMaSp.getText(), txtTensp.getText());
    }
     
         SanphamProduct themsp(){
        SanphamProduct s=new SanphamProduct();
        s.setGia(Double.parseDouble(txtGia.getText()));
        s.setMaDanhmuc( ((DanhMuc) cboDanhmuc.getSelectedItem()).getMaDanhMuc());
         s.setIdSize(((Size) cboSize.getSelectedItem()).getId());
        s.setIdMausac(((MauSac) cboMausac.getSelectedItem()).getId());
        s.setIdDongsp(((DongSP) cboDongsp.getSelectedItem()).getId());
       
        s.setThoiGianBH(Integer.parseInt(txtNambh.getText()));
        s.setSoluong(Integer.parseInt(txtSoluong1.getText()));
        int tt;
        if(cboTT.getSelectedItem().equals("Đang hoạt động")){
            tt=1;
        }else{
            tt=0;
        }
        s.setTrangThai(tt);
                return s;
    }
     
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Anh a = new Anh();
        a.setTen(txtTensp.getText());
        String anh = txtAnh.getText();
        anh = anh.replace("//", "////");
        a.setUrlImage(urlimage);
        listAnh.add(a);
        service_anh.them(a);
        if(checkSanpham()){
            JOptionPane.showMessageDialog(this, service_sanpham.insert(themsanpham(), themsp()));
            listSanpham = service_sanpham.getAllSp();
            fillSanpham();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Anh a = new Anh();
        a.setTen(txtTensp.getText());
        String anh = txtAnh.getText();
        anh = anh.replace("//", "////");
        a.setUrlImage(urlimage);
        listAnh.add(a);
        service_anh.sua(a);
        listAnh=service_anh.getListAnh();
        JOptionPane.showMessageDialog(this,"sửa thành công");
        //        int row = tblSanpham.getSelectedRow();
        //        if (row == -1) {
            //            JOptionPane.showMessageDialog(this, "Chọn hàng để sửa");
            //        } else {
            //                JOptionPane.showMessageDialog(this, service_sanpham.update(tblSanpham.getValueAt(row, 0).toString(), themsanpham(),themsp()));
            //                JOptionPane.showMessageDialog(this, "Sửa thành công");
            //                fillSanpham();
            //
            //        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int rowIndex = tblSanpham.getSelectedRow();

        JOptionPane.showMessageDialog(this, service_sanpham.delete(tblSanpham.getValueAt(rowIndex, 0).toString()));
        listSanpham=service_sanpham.getAllSp();
        fillSanpham();
    }//GEN-LAST:event_btnDeleteActionPerformed
    byte[] urlimage = null;
    String filename = null;
    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txtAnh.setText(filename);
        lblanh.setIcon(new ImageIcon(f.toString()));
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] byt = new byte[1024];
            for (int i; (i = fis.read(byt)) != -1;) {
                baos.write(byt, 0, i);
            }
            urlimage = baos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnChonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dongspview s=new Dongspview();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DanhMucView e=new DanhMucView();
        e.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Mausacview a=new Mausacview();
        a.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ViewSize r=new ViewSize();
        r.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboDanhmuc;
    private javax.swing.JComboBox<String> cboDongsp;
    private javax.swing.JComboBox<String> cboMausac;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JComboBox<String> cboTT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDanhmuc1;
    private javax.swing.JLabel lblDongsp1;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblMasp;
    private javax.swing.JLabel lblMausac;
    private javax.swing.JLabel lblNambh;
    private javax.swing.JLabel lblSoluong;
    private javax.swing.JLabel lblTensp;
    private javax.swing.JLabel lblanh;
    private javax.swing.JTable tblSanpham;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSp;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtNambh;
    private javax.swing.JTextField txtSoluong1;
    private javax.swing.JTextField txtTensp;
    // End of variables declaration//GEN-END:variables
}