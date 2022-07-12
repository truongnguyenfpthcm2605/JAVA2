/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  view.MyColorView;
/**
 *
 * @author Truong Nguyen
 */
public class MyColorListener implements  ActionListener{
   private  MyColorView view ;

    public MyColorListener(MyColorView view) {
        this.view = view;
        
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        String rules = e.getActionCommand();
        if(rules.equals("textRed")){
           this.view.changeColor(Color.red);
           this.view.changeBackgroundColor(Color.yellow);
        }else if(rules.equals("textGreen")){
              this.view.changeColor(Color.green);
               this.view.changeBackgroundColor(Color.red);
        }else{
             this.view.changeColor(Color.yellow);
              this.view.changeBackgroundColor(Color.GREEN);
    }
    }
}
