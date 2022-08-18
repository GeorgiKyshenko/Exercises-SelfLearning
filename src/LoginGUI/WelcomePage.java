package LoginGUI;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcome = new JLabel();

    public WelcomePage(String userID) {

        welcome.setBounds(0, 0, 200, 35);
        welcome.setFont(new Font(null, Font.PLAIN, 25));
        welcome.setText("Hello " + userID + " !");

        frame.add(welcome);
        frame.setTitle("Your Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

    }
}
