/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.MyClolorModel;
import Controller.MyColorListener;
import javax.swing.Action;
/**
 *
 * @author Truong Nguyen
 */
public class MyColorView extends JFrame {

    private MyClolorModel model;
    private JLabel label;

    public MyColorView() {
        this.model = new MyClolorModel();
        this.innit();
    }

    private void innit() {
        this.setTitle("MyColor");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("My Color");
        JPanel japnel = new JPanel(new GridLayout(1, 3));
        Font font = new Font("Arial", Font.BOLD, 40);
        Font fontext = new Font("Eras Medium ITC",Font.BOLD,60) ;
        Font fontspe = new Font("Britannic Bold",Font.ITALIC,50);
        MyColorListener event = new MyColorListener(this);
        // NUT MAU DO
        JButton text1 = new JButton("textRed");
        text1.setFont(fontext);
        text1.setForeground(Color.RED);
        text1.setBackground(Color.green);
        text1.setOpaque(true);
        text1.addActionListener(event);
        // NUT MAU XANH
        JButton text2 = new JButton("textGreen");
        text2.setFont(font);
        text2.setForeground(Color.GREEN);
        text2.setBackground(Color.yellow);
     text2.addActionListener(event);
        // nut mau vang
        JButton text3 = new JButton("textYellow");
        text3.setFont(fontspe);
        text3.setForeground(Color.yellow);
         text3.setBackground(Color.red);
         label.setFont(fontext);
               text3.addActionListener(event);
        
        japnel.add(label);
        japnel.add(text1);
        japnel.add(text2);
        japnel.add(text3);
        
       this.setLayout(new BorderLayout());
       this.add(label, BorderLayout.NORTH);
         this.add(japnel, BorderLayout.CENTER);

        this.setVisible(true);

    }
    public static void main(String[] args) {
        MyColorView view = new MyColorView();
    }

    public void changeColor(Color a) {
      this.label.setForeground(a);
    }
    public void changeBackgroundColor(Color b){
        this.label.setBackground(b);
        this.label.setOpaque(true);
    }

    

}
