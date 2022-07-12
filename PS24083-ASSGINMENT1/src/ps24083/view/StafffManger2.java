/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ps24083.view;

import checkData.Data;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ps24083.model.Employee;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Truong Nguyen
 */
public class StafffManger2 extends javax.swing.JFrame {

    Employee el;
    DefaultTableModel model;
    List<Employee> list = new ArrayList<>();
    int location = -1;
    Data data = new Data();
    File f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\FileAssginment.txt");

    /**
     * Creates new form StafffManger2
     */
    public StafffManger2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private String checkformBlank() {
        StringBuilder str = new StringBuilder();
        str.append("");
        if (txtmaSv.getText().isEmpty() || txtnameSV.getText().isEmpty() || txtAge.getText().isEmpty() || txtEmail.getText().isEmpty() || txtSalary.getText().isEmpty()) {
            str.append("Hãy nhập form đầy đủ ! \n");
        }

        if (!data.checkMaSv(txtmaSv.getText())) {
            str.append("Nhập sai định dạng mã nhân viên \n");
            txtmaSv.setBackground(Color.yellow);
        } else {
            txtmaSv.setBackground(Color.white);

        }
        if (!data.checkName(txtnameSV.getText())) {
            str.append("Nhập tên phai hơn 10 kí tự và nhỏ hơn 30 kí tự \n");
            txtnameSV.setBackground(Color.YELLOW);
        } else {
            txtnameSV.setBackground(Color.white);
        }

        try {
            if (!data.checkAge(txtAge.getText())) {
                str.append("Nhập lại tuổi từ 16 đến 55 \n");
                txtAge.setBackground(Color.yellow);
            } else {
                txtAge.setBackground(Color.white);
            }
        } catch (Exception e) {
            str.append("Nhập tuổi là số \n");
            txtAge.setBackground(Color.yellow);
            txtAge.setText("");
        }
        if (!data.checkEmail(txtEmail.getText())) {
            txtEmail.setBackground(Color.YELLOW);
            str.append("Lỗi nhập sai định dạng Email \n");
        } else {
            txtEmail.setBackground(Color.white);
        }
        try {
            if (!data.checksalary(txtSalary.getText())) {
                str.append("Nhập lương la số và lớn hớn 5000 \n");
                txtSalary.setBackground(Color.yellow);
            } else {
                txtSalary.setBackground(Color.white);
            }
        } catch (Exception e) {
            str.append("Nhập lương là số  \n");
            txtSalary.setBackground(Color.yellow);
            txtSalary.setText("");
        }

        if (str.length() > 0) {
            JOptionPane.showMessageDialog(this, str.toString());

        }
        return str.toString();
    }

    private void innitDentifiersTable() {
        model = (DefaultTableModel) tblList.getModel();
        model.setColumnIdentifiers(new String[]{
            "Mã Nhân viên", "Họ Và Tên", "Tuổi", "Email", "Luong"
        });
    }

    // duyet du lieu tu list vao bang
    private void fillTable() {
        try {
            model.setRowCount(0);
            for (Employee item : list) {
                model.addRow(new Object[]{item.getMaSv(), item.getName(), item.getAge(), item.getEmail(), item.getSalary()}
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu ");
        }

    }

    // them moi 1 doi tuong tu form vao list
    private int addnewData() {
        try {

            el = new Employee();
            el.setMaSv(txtmaSv.getText());

            el.setName(txtnameSV.getText());
            el.setAge(Integer.parseInt(txtAge.getText()));
            el.setEmail(txtEmail.getText());
            el.setSalary(Double.parseDouble(txtSalary.getText()));
            for (Employee emp : list) {
                if (el.getMaSv().equals(emp.getMaSv())) {
                    JOptionPane.showMessageDialog(this, "Không được thêm trùng mã nhân viên");
                    return 0;
                } else if (el.getEmail().equals(emp.getEmail())) {
                    JOptionPane.showMessageDialog(this, "Không được thêm trùng Email");
                    return 0;
                }
            }
            list.add(el);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nhập dữ liệu sai định dạng quy định hoặc trùng mã", "Syntaxt Error!", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
        return 1;
    }

    // hien thi vi tri doi tuong torng bang len cac textbox from
    private void fromList(int location) {
        el = list.get(location);
        txtmaSv.setText(el.getMaSv());
        txtnameSV.setText(el.getName());
        txtAge.setText(String.valueOf(el.getAge()));
        txtEmail.setText(el.getEmail());
        txtSalary.setText(String.valueOf(el.getSalary()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnSXSalary = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSXName = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSXAge = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        txtmaSv = new javax.swing.JTextField();
        txtnameSV = new javax.swing.JTextField();
        btnReverseFirst = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        btnReverse = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();
        txtSalary = new javax.swing.JTextField();
        btnnextEnd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhân Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("HỌ VÀ TÊN");

        btnSXSalary.setText("Sắp Xếp Theo Lương");
        btnSXSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXSalaryActionPerformed(evt);
            }
        });

        jLabel4.setText("TUỔI");

        btnSXName.setText("Sắp Xếp Theo Tên");
        btnSXName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXNameActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL");

        btnSXAge.setText("Sắp Xếp Theoi Tuổi");
        btnSXAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXAgeActionPerformed(evt);
            }
        });

        jLabel6.setText("LƯƠNG");

        btnReverseFirst.setText("<");
        btnReverseFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseFirstActionPerformed(evt);
            }
        });

        btnReverse.setText("<<");
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnnextEnd.setText(">");
        btnnextEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextEndActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("STAFF MANAGER");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconSave.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jLabel2.setText("MÃ NHÂN VIÊN ");

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setEnabled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel7.setText("Tìm Theo Mã Nhân Viên : ");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSXSalary)
                        .addGap(18, 18, 18)
                        .addComponent(btnSXName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSXAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnameSV)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(txtmaSv, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnReverseFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReverse, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFind)
                                        .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23))
                                    .addComponent(btnnextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmaSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnameSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReverseFirst)
                            .addComponent(btnReverse)
                            .addComponent(btnnext)
                            .addComponent(btnnextEnd)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOpen)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSXSalary)
                    .addComponent(btnSXName)
                    .addComponent(btnSXAge)
                    .addComponent(btnEdit))
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSXSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSXSalaryActionPerformed

        Comparator<Employee> com;
        com = (Employee el1, Employee el2) -> {
            if (el1.getSalary() > el2.getSalary()) {
                return 1;
            }
            return -1;
        };
        Collections.sort(list, com);
        fillTable();

    }//GEN-LAST:event_btnSXSalaryActionPerformed

    private void btnSXNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSXNameActionPerformed
        Comparator<Employee> com = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(list, com);
        fillTable();
    }//GEN-LAST:event_btnSXNameActionPerformed

    private void btnSXAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSXAgeActionPerformed
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(list, com);
        fillTable();
    }//GEN-LAST:event_btnSXAgeActionPerformed

    private void btnReverseFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseFirstActionPerformed
        try {
            location = 0;
            fromList(location);
            tblList.setRowSelectionInterval(location, location);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không có chỉ số chọn trong bảng");
        }
    }//GEN-LAST:event_btnReverseFirstActionPerformed

    private void btnReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseActionPerformed
        try {
            if (location != -1) {
                fromList(location);
                tblList.setRowSelectionInterval(location, location); //hien thi tuong tac tren bang
                location--;
                if (location < 0) {
                    location = list.size() - 1;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hãy Chọn đối tượng để sửa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không có chỉ số chọn trong bảng");
        }
    }//GEN-LAST:event_btnReverseActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

        try {
            if (location != -1) {
                fromList(location);
                tblList.setRowSelectionInterval(location, location);
                location++;
                if (location == list.size()) {
                    location = 0;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hãy Chọn đối tượng để sửa");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không có chỉ số chọn trong bảng");
        }

    }//GEN-LAST:event_btnnextActionPerformed

    private void btnnextEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextEndActionPerformed
        try {
            location = list.size() - 1;
            fromList(location);
            tblList.setRowSelectionInterval(location, location);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không có chỉ số chọn trong bảng");
        }
    }//GEN-LAST:event_btnnextEndActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtmaSv.setText("");
        txtnameSV.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtSalary.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (checkformBlank().equals("")) {
            if (addnewData() > 0) {
                fillTable();
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
                btnNewActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm Thất Bại");

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            location = tblList.getSelectedRow();
            fromList(location);
            el = list.remove(location);
            fillTable();
            JOptionPane.showMessageDialog(this, "Xóa Thành Công!");
            btnNewActionPerformed(evt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hãy Chọn đối tượng trước khi xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {

            FileInputStream input = new FileInputStream(f);
            ObjectInputStream oop = new ObjectInputStream(input);
            list = (List<Employee>) oop.readObject();
            oop.close();
            input.close();
            fillTable();
            btnExit.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Đọc File lên danh sách Thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không tồn tại File đọc Thất bại");
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            if(list.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "Không có dữ liệu để lưu!");
                 return ;
            }
            FileOutputStream output = new FileOutputStream(f);
            ObjectOutputStream opp = new ObjectOutputStream(output);
            opp.writeObject(list);
            opp.close();
            output.close();
            fillTable();
            JOptionPane.showMessageDialog(this, "Lưu về file Thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không tồn tại File ghi Thất bại");
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        location = tblList.getSelectedRow();
        fromList(location);
    }//GEN-LAST:event_tblListMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        innitDentifiersTable();
        fillTable();

    }//GEN-LAST:event_formWindowOpened

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            boolean check = false;
            el = new Employee();
            if (txtFind.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Hãy Nhập Mã");
            } else if (!data.checkMaSv(txtFind.getText())) {
                JOptionPane.showMessageDialog(this, "Nhập mã số sinh viên sai định dạng");
                txtFind.setText("");
            } else {
                for(int i = 0; i < list.size();i++ ){
                    if(list.get(i).getMaSv().equals(txtFind.getText())){
                        fromList(i);
                        tblList.setRowSelectionInterval(i, i);
                        check = true;
                    }   
                }
                if (check==false) {
                    JOptionPane.showMessageDialog(this, "Không có Nhân viên cần tìm");
                    txtFind.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Đã tìm thấy nhân viên trên form");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (location == -1) {
                JOptionPane.showMessageDialog(this, "Hãy Chọn đối tượng cần sửa");
            } else {
                if (checkformBlank().equals(""))  {
                    el = new Employee();
                    el = list.get(location);
                    el.setMaSv(txtmaSv.getText());
                    el.setName(txtnameSV.getText());
                    el.setAge(Integer.parseInt(txtAge.getText()));
                    el.setEmail(txtEmail.getText());
                    el.setSalary(Double.parseDouble(txtSalary.getText()));
                    list.set(location, el);
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sai định dạng dữ liệu");
            btnNewActionPerformed(evt);
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(StafffManger2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StafffManger2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StafffManger2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StafffManger2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StafffManger2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReverse;
    private javax.swing.JButton btnReverseFirst;
    private javax.swing.JButton btnSXAge;
    private javax.swing.JButton btnSXName;
    private javax.swing.JButton btnSXSalary;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnnextEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtmaSv;
    private javax.swing.JTextField txtnameSV;
    // End of variables declaration//GEN-END:variables
}
