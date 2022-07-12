/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Truong Nguyen
 */
public class XDate {
    private static SimpleDateFormat fmdate = new SimpleDateFormat();
    public static Date parse(String text,String pattern) throws RuntimeException {
        try {
            fmdate.applyPattern(pattern);
            return fmdate.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
  
}
