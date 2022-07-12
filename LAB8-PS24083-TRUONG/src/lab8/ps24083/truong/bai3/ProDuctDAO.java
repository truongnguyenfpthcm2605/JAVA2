/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8.ps24083.truong.bai3;

import java.io.Serializable;
import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Truong Nguyen
 */
public class ProDuctDAO extends Dao<Product> {

    @Override
    public void update(Product entity) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(entity.name)) {
                list.set(i, entity);
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        for (Product p : list) {
            if (p.name.equals(id)) {
                return p;
            }
        }
        return null;
    }

}
