/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pkgenum;

import java.awt.TrayIcon;
import java.security.cert.TrustAnchor;

/**
 *
 * @author Truong Nguyen
 */
public enum Transports {
    CAR(20),TRUCK(16),AIRPLANE(34) ,TRAIN(55), BOAT(12);
    
    private int speeed;

     Transports(int a) {
            speeed = a;
    }

    public int getSpeeed() {
        return speeed;
    }
     
    
    
}
