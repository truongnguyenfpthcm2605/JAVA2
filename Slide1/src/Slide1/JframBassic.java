/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide1;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Truong Nguyen
 */
public class JframBassic extends  JFrame{

    public JframBassic(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // mau nền
        getContentPane().setBackground(Color.green);
        
    }
    
    public static void main(String[] args) {
        JframBassic jf = new JframBassic("Demo");
    }
}
