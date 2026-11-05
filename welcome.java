import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.border.Border;

public class welcome implements ActionListener
{

  private static final int DELAY_TIME = 2000;

  private JButton register= new JButton(new ImageIcon(this.getClass().getResource("/pictures/weq-01.png")));
  private JButton login= new JButton(new ImageIcon(this.getClass().getResource("/pictures/wer-01.png")));
  private JFrame frame= new JFrame("CODE-SOLO");
  private JButton exit = new JButton("EXIT");



welcome()
    {

          JFrame loadingscreen = new JFrame("Loading");
          loadingscreen.setSize(1280, 720);
          loadingscreen.setLocationRelativeTo(null);
          loadingscreen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          loadingscreen.setLayout(new BorderLayout());
          loadingscreen.getContentPane().setBackground(Color.WHITE);
          loadingscreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
          loadingscreen.setUndecorated(true);
          loadingscreen.setResizable(false);

          JLabel loadingLabel = new JLabel(new ImageIcon(this.getClass().getResource("/pictures/loading.gif")));
          loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);

          loadingscreen.add(loadingLabel, BorderLayout.CENTER);

          Timer timer = new Timer(DELAY_TIME, new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  loadingscreen.setVisible(false);


              }
          });
          loadingscreen.setVisible(true);
          timer.start();




    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b2;
    JTextField t1,t2;
    JPasswordField p1;
    Container c;

    l1=new JLabel(new ImageIcon(this.getClass().getResource("/pictures/welcome.gif")));
    l1.setBounds(-550,-550, 1920,1920);

    l2=new JLabel("Already have an Account?");
    l2.setFont(new Font("Bahnschrift", Font.BOLD, 12));
    l2.setBounds(1070,140, 150,50);

    l3=new JLabel("USERNAME");
    l3.setBounds(1070,178, 100,50);
    l3.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    l4=new JLabel("PASSWORD");
    l4.setBounds(1070,280, 200,80);
    l4.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    l5=new JLabel("REGISTER NOW!");
    l5.setBounds(1070,500, 200,80);
    l5.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    l6=new JLabel(new ImageIcon(this.getClass().getResource("/pictures/line-01.png")));
    l6.setBounds(1070,500, 230,20);

    l7=new JLabel("THE NO.1 PLATFORM TO LEARN PROGRAMMING!");
    l7.setBounds(1070,680, 350,100);
    l7.setFont(new Font("Caviar Dreams", Font.PLAIN, 12));

    l8=new JLabel(new ImageIcon(this.getClass().getResource("/pictures/Untitled-2-01.png")));
    l8.setBounds(1090,630, 230,70);

    l9=new JLabel(new ImageIcon(this.getClass().getResource("/pictures/coso1-01.png")));
    l9.setBounds(1030,10, 330,150);





    login.setBounds(1070,430, 130,30);
    login.addActionListener(this);

    register.setBounds(1070,580, 130,30);
    register.addActionListener(this);

    exit.setBounds(1350,800,70,20);
    exit.setFont(new Font("Caviar Dreams", Font.BOLD, 12));
    exit.addActionListener(this);
    exit.setBackground(Color.RED);
    exit.setForeground(Color.WHITE);





    t1=new JTextField();
    t1.setBounds(1070,230, 200,30);

    p1 = new JPasswordField();
    p1.setBounds(1070,345, 200,30);
    p1.setEchoChar('⚫');



    frame.add(l1);frame.add(login);frame.add(register);frame.add(l2);frame.add(t1);frame.add(l3);frame.add(l4);frame.add(p1);frame.add(l5);frame.add(l6);frame.add(l7);frame.add(l8);frame.add(l9);
    frame.add(exit);
    frame.setSize(1280,720);
    frame.getContentPane().setBackground(Color.WHITE);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    frame.setResizable(false);



    }



        public void actionPerformed(ActionEvent e)
        {
          if(e.getSource() == register)
          {
            frame.dispose();
            new msg();
          }
          if(e.getSource() == login)
          {
            frame.dispose();
            new Dashboard();
          }
          if(e.getSource() == exit)
          {
            System.exit(0);
          }

        }


    }
