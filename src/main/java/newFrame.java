
import java.awt.*;
import javax.swing.*;


public class newFrame extends JFrame{
    private Container c;
    private JLabel label;
    newFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(420,50,400,400);
        this.setTitle("New Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
        
        label = new JLabel("Hello! Welcome to new frame");
        label.setBounds(50, 50, 250, 50);
        c.add(label);
    }
    public static void main(String[] args) {
        newFrame frame = new newFrame();
        frame.setVisible(true);
    }

    void setVisibility(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
