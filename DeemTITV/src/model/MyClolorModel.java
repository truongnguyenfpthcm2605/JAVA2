/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;

/**
 *
 * @author Truong Nguyen
 */
public class MyClolorModel {
    private Color fbackground;
    private Color background;
    private boolean opaque;

    public MyClolorModel() {
        this.fbackground = Color.black;
        this.background = Color.white;
        this.opaque = true;
    }

    public Color getFbackground() {
        return fbackground;
    }

    public void setFbackground(Color fbackground) {
        this.fbackground = fbackground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }
    
    
    
}
