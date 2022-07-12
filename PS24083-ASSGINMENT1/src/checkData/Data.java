package checkData;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Data extends JFrame {

    public boolean checkEmail(String e) {
        String parttern = "^\\w{3,}@\\w{2,}(\\.[a-zA-Z]{2,3}){1,2}$";
        return e.matches(parttern);
    }
//    public boolean checksdt(String s){
//        String parttern = "0[932]\\d{8,9}";
//        return s.matches(parttern);
//    }
//    public boolean checkCmnd(String c){
//        String parttern = "\\d{9,12}";
//        return c.matches(parttern);
//        
//    }

    public boolean checkMaSv(String ma) {
        String parttern = "^[ps]+\\d{5}$";
        return ma.matches(parttern);
    }

    public boolean checkName(String name) {
        if (name.length() > 30 ||  name.length() <10) {
            return false;
        }
        return true;
    }

    public boolean checkAge(String age) throws  Exception{

        int a = Integer.parseInt(age);
        if (a < 16 || a > 55) {
            return false;
        }

        return true;

    }

    public boolean checksalary(String salary) throws  Exception{

        double b = Double.parseDouble(salary);
        if (b < 5000) {
            return false;
        }

        return true;
    }

}
