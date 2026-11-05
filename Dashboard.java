import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.border.Border;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Dashboard{
  private JFrame Dash;
  private JButton python,c;

  public Dashboard(){
    Dash =  new JFrame("DASHBOARD");
    Color c1 = new Color(51,51,51);


    python = new JButton(new ImageIcon(this.getClass().getResource("/pictures/python-01.png")));
    python.setBounds(200,250,400,300);
    python.setBackground(Color.WHITE);
    python.setForeground(Color.WHITE);

    c = new JButton(new ImageIcon(this.getClass().getResource("/pictures/c-01.png")));
    c.setBounds(850,250,400,300);
    c.setBackground(Color.WHITE);
    c.setForeground(Color.WHITE);



    Dash.add(python);Dash.add(c);

    Dash.setSize(1280,720);
    Dash.getContentPane().setBackground(Color.WHITE);
    Dash.setLayout(null);
    Dash.setVisible(true);
    Dash.setLocationRelativeTo(null);
    Dash.setExtendedState(JFrame.MAXIMIZED_BOTH);
    Dash.setUndecorated(true);
    Dash.setResizable(false);

  }



}
