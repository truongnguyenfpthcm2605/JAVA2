/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Truong Nguyen
 */
public class DemoJPanel extends  JFrame{

    public DemoJPanel(String title) throws HeadlessException {
        super(title);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        getContentPane().setBackground(Color.red);
        
        JPanel jp = new JPanel(new GridLayout(3, 3));
        add(jp);
        JButton[] jb = new JButton[9];
        
        // them cai nut jbutton vao layout
        for (int i = 0; i < jb.length; i++) {
            jb[i] = new JButton("But "+ i);
            jp.add(jb[i]);
        }
         setVisible(true);
    }
    public static void main(String[] args) {
        DemoJPanel dm = new DemoJPanel("Demo Jpanel");
        
    }
    
}
