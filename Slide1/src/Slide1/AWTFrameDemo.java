

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Truong Nguyen
 */
public class AWTFrameDemo extends  JFrame implements ActionListener{
    Button btnRed, btnYellow;
    public AWTFrameDemo(String title) throws HeadlessException {
        super(title);
        btnRed = new Button("Red");
         btnYellow = new Button("Yellow");
        setLayout(new FlowLayout());
        add(btnRed);
        add(btnYellow);
        btnRed.addActionListener(this);
        btnYellow.addActionListener(this);
        
    }
  

    @Override
    public void actionPerformed(ActionEvent e) {
       String cmd = e.getActionCommand();
       if(cmd.equals("Red")){
           setBackground(Color.red);
       }else{
           setBackground(Color.yellow);
       }
        
     
    }
    public static void main(String[] args) {
        AWTFrameDemo awt = new  AWTFrameDemo("Demo AWT");
        awt.setSize(300,200);

        awt.setLocationRelativeTo(null);
        awt.addWindowFocusListener(new  WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
                awt.setVisible(true);
        
    }
    
}
