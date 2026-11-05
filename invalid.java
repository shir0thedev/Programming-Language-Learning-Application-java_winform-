import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class invalid{

  invalid()
  {
    JFrame f=new JFrame("Button Example");
    JLabel MoodMessage;
    JButton b;

    b = new JButton("Click Here");
    b.setBounds(50,50,95,30);

    MoodMessage = new JLabel("Looks like you do not have any account, please SIGNUP first!");
    MoodMessage.setBounds(500,20,350,30);


    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(0, -300));
    panel.add(MoodMessage);

    f.add(panel);
    f.setUndecorated(true);

    f.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    f.pack();

    f.setVisible(true);



    f.add(b);f.add(MoodMessage);

    f.setSize(500,140);
    f.setLayout(null);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
  }
}
