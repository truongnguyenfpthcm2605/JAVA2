/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ps24083.view;

import checkData.Data;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ps24083.model.Employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Truong Nguyen
 */
public class StafffManger extends javax.swing.JFrame implements Runnable {

    Employee el;
    DefaultTableModel model;
    List<Employee> list = new ArrayList<>();
    int location = -1;
    Data data = new Data();
    File f = new File("D:\\SUMMER2022\\MOB1023JAVA2\\FileAssginment.txt");
    String linkImage = "D:\\SUMMER2022\\MOB1023JAVA2\\ImageAsm\\anhmacdinh.png";

    /**
     * Creates new form StafffManger2
     */
    public StafffManger() {
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
            str.append("Tên Không được chứa số và phải hơn 10 kí tự \n");
            txtnameSV.setBackground(Color.YELLOW);
        } else {
            txtnameSV.setBackground(Color.white);
        }

        try {
            if (!data.checkAge(txtAge.getText())) {
                str.append("Nhập lại tuổi từ 16 đến 55  \n");
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
            "Employee Code", "Full Name", "Age", "Email", "Salary"
        });
    }

    // duyet du lieu tu list vao bang
    private void fillTable() {
        try {
            model.setRowCount(0);
            for (Employee item : list) {
                model.addRow(new Object[]{item.getMaSv(), item.getName(), item.getAge(), item.getEmail(), item.getSalary()}
                );
                tblImage.setIcon(reSizeImgae(String.valueOf(item.getImg())));
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
            el.setImg(linkImage);

            for (Employee emp : list) {
                if (el.getMaSv().equals(emp.getMaSv())) {
                    JOptionPane.showMessageDialog(this, "Không được thêm trùng mã nhân viên");
                    return 0;
                } else if (el.getEmail().equals(emp.getEmail())) {
                    JOptionPane.showMessageDialog(this, "Không được thêm trùng Email");
                    return 0;
                } else if (el.getImg().equals("D:\\SUMMER2022\\MOB1023JAVA2\\ImageAsm\\anhmacdinh.png")) {
                    JOptionPane.showMessageDialog(this, "Vui Lòng Chọn ảnh");
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
        tblImage.setIcon(reSizeImgae(String.valueOf(el.getImg())));
    }

    private void States() {
        int end = list.size();
        int i = tblList.getSelectedRow();
        txtSTT.setText("Star : " + i + " End : " + end);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtClock = new javax.swing.JLabel();
        txtSTT = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        tblImage = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PS24083-TRUONG");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("FULLNAME");

        btnSXSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sorticon.png"))); // NOI18N
        btnSXSalary.setText("Sort Salary");
        btnSXSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXSalaryActionPerformed(evt);
            }
        });

        jLabel4.setText("AGE");

        btnSXName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sorticon.png"))); // NOI18N
        btnSXName.setText("Sort Name");
        btnSXName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXNameActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL");

        btnSXAge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sorticon.png"))); // NOI18N
        btnSXAge.setText("Sort Age");
        btnSXAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSXAgeActionPerformed(evt);
            }
        });

        jLabel6.setText("SALARY");

        btnReverseFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back-Music-icon.png"))); // NOI18N
        btnReverseFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseFirstActionPerformed(evt);
            }
        });

        btnReverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Reverseicon.png"))); // NOI18N
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nexticon.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnnextEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/forward-icon.png"))); // NOI18N
        btnnextEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextEndActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Personicon.png"))); // NOI18N
        jLabel1.setText("STAFF MANAGER");

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

        jLabel2.setText("CODE EMLOYEE");

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconFind.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/openicon.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Closeicon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/editicon.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.png"))); // NOI18N

        txtClock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClock.setForeground(new java.awt.Color(51, 51, 255));
        txtClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/TimeIcon.png"))); // NOI18N

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icondelete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconSave.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconNew.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        tblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/anhmacdinh.png"))); // NOI18N
        tblImage.setText("jLabel12");

        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImage.setText("Chose Imgae");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSXSalary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSXName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSXAge, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnameSV)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(txtmaSv, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReverseFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReverse, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnnextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtClock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtClock)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(tblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOpen)
                            .addComponent(btnExit))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnReverseFirst)
                                    .addComponent(btnReverse)
                                    .addComponent(btnnext)
                                    .addComponent(btnnextEnd)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSTT)))
                        .addGap(18, 18, 18)
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSXSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSXName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSXAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addGap(24, 24, 24))
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
        tblImage.setIcon(reSizeImgae(String.valueOf(linkImage)));
        txtmaSv.setBackground(Color.white);
        txtnameSV.setBackground(Color.white);
        txtAge.setBackground(Color.white);
        txtEmail.setBackground(Color.white);
        txtSalary.setBackground(Color.white);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (checkformBlank().equals("")) {
            if (addnewData() > 0) {
                int chosse = JOptionPane.showConfirmDialog(this, "Bạn có chắt muốn lưu nhân viên này  không?", "Lưu Nhân Viên", JOptionPane.YES_NO_OPTION);
                if (chosse == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                    btnNewActionPerformed(evt);
                } else {
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
                    btnNewActionPerformed(evt);

                }

            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (location == -1) {
                JOptionPane.showMessageDialog(this, "chưa có đối tượng xóa");
            } else {
                int a = JOptionPane.showConfirmDialog(this, "Bạn có chắt muốn xóa không!", "Xóa Nhân viên", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.YES_OPTION) {
                    int[] index = tblList.getSelectedRows(); // vi tri nhan la 1 mang gia tri
                    for (int i = 0; i <= index.length - 1; i++) {
                        location = index[i]; // moi vi tri được chọn gắn cho vi tri trong list
                        list.remove(index[0]);
                    }
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Xóa Thành Công!");
                    btnNewActionPerformed(evt);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hãy Chọn đối tượng trước khi xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {

            FileInputStream input = new FileInputStream(f);
            ObjectInputStream oop = new ObjectInputStream(input);
            boolean hasExists = list.stream().anyMatch(emp -> emp.getMaSv().equalsIgnoreCase(txtmaSv.getText()));

            if (hasExists) {
                return;
            }
            list.addAll((List<Employee>) oop.readObject());
            oop.close();
            input.close();
            fillTable();
            btnReverseFirstActionPerformed(evt);

            JOptionPane.showMessageDialog(this, "Đọc File lên danh sách Thành công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không tồn tại File đọc Thất bại");
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu để lưu! Hãy Nhập dữ Liệu");
                return;
            }
            int chose = JOptionPane.showConfirmDialog(this, "Do You Want to Exit program and Save File?", "Exit", JOptionPane.YES_NO_OPTION);
            if (chose == JOptionPane.YES_OPTION) {
                FileOutputStream output = new FileOutputStream(f);
                ObjectOutputStream opp = new ObjectOutputStream(output);
                opp.writeObject(list);
                opp.close();
                output.close();
                fillTable();
                JOptionPane.showMessageDialog(this, "Lưu về file Thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Program Continue");
            }
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
        Thread t = new Thread(this);
        t.start();


    }//GEN-LAST:event_formWindowOpened

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            boolean check = false;
            String a = JOptionPane.showInputDialog(this, "Nhập mã nhân viên muốn tìm?");
            if (a != null) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMaSv().equals(a)) {
                        fromList(i);
                        tblList.setRowSelectionInterval(i, i);
                        check = true;
                    }
                }
                if (check == false) {
                    JOptionPane.showMessageDialog(this, "Không có Nhân viên cần tìm");

                } else {
                    JOptionPane.showMessageDialog(this, "Đã tìm thấy nhân viên trên form");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hãy Nhập mã nhân viên");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "loi");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        try {
            if (location == -1) {
                JOptionPane.showMessageDialog(this, "Hay chon doi tuong can sua");
            } else {

                if (checkformBlank().equals("")) {
                    el = new Employee();
                    el = list.get(location);
                    el.setName(txtnameSV.getText());
                    el.setAge(Integer.parseInt(txtAge.getText()));
                    el.setEmail(txtEmail.getText());
                    el.setSalary(Double.parseDouble(txtSalary.getText()));
                    el.setImg(tblImage.getText());
                    tblImage.setIcon(reSizeImgae("D:\\SUMMER2022\\MOB1023JAVA2\\ImageAsm\\anhmacdinh.png"));
                    list.set(location, el);
                    JOptionPane.showMessageDialog(this, "Bạn Hãy Sửa thông tin");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sai định dạng dữ liệu");
        }
    }//GEN-LAST:event_btnEditActionPerformed
    private ImageIcon reSizeImgae(String path) {
        ImageIcon myImage = new ImageIcon(path);
        Image img = myImage.getImage();
        Image newimg = img.getScaledInstance(tblImage.getWidth(), tblImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        try {
            JFileChooser f = new JFileChooser("D:\\SUMMER2022\\MOB1023JAVA2\\ImageAsm");
            f.setCurrentDirectory(new File("./src/image"));
            f.setDialogTitle("Open File Image");
            f.showOpenDialog(null);
            File fnameImage = f.getSelectedFile();
            linkImage = fnameImage.getAbsolutePath();
            tblImage.setIcon(reSizeImgae(String.valueOf(linkImage)));
            JOptionPane.showMessageDialog(this, "Thêm Ảnh Thành Công");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Ảnh!");
        }
    }//GEN-LAST:event_btnImageActionPerformed

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
            java.util.logging.Logger.getLogger(StafffManger.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StafffManger.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StafffManger.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StafffManger.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StafffManger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnImage;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tblImage;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JLabel txtClock;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtSTT;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtmaSv;
    private javax.swing.JTextField txtnameSV;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat fm = new SimpleDateFormat();
            fm.applyPattern("hh:mm:ss aa");
            String time = fm.format(now);
            txtClock.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}
