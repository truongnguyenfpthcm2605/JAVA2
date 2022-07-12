/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserList;

import java.io.Serializable;

/**
 *
 * @author Truong Nguyen
 */
public class ListUser  implements  Serializable{ // add interface nay mới tương tác được với bảng
    private String user;
    private String pass;
    private String role;

    public ListUser(String user, String pass, String role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public ListUser() {
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
