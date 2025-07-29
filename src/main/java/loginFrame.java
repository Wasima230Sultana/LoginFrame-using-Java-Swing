
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class loginFrame extends JFrame {

    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButtton;
    private Container c;
    private Font f;

    loginFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 450, 500);
        this.setTitle("Login Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Arial", Font.BOLD, 18);

        userLabel = new JLabel("Username : ");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170, 50, 200, 50);
        c.add(tf);

        passLabel = new JLabel("Password : ");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setFont(f);
        pf.setBounds(170, 120, 200, 50);
        pf.setEchoChar('*');
        c.add(pf);

        loginButton = new JButton("Login");
        loginButton.setBounds(170, 190, 90, 50);
        loginButton.setFont(f);
        c.add(loginButton);

        clearButtton = new JButton("Clear");
        clearButtton.setBounds(280, 190, 90, 50);
        clearButtton.setFont(f);
        c.add(clearButtton);

        clearButtton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");

            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = tf.getText();
                String password = pf.getText();
                if (userName.equals("wasimasultana") && password.equals("wasIMA")) {
                    JOptionPane.showMessageDialog(null, "You are successfully login the device.");
//                    dispose();
                    newFrame frame = new newFrame();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong username or password");
                }
            }
        });
    }

    public static void main(String[] args) {
        loginFrame frame = new loginFrame();
        frame.setVisible(true);
    }

}
