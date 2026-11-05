  import javax.swing.*;
  import javax.swing.*;
  import java.awt.*;
  import javax.swing.border.*;
  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import java.util.Random;
  import javax.swing.border.Border;



  public class msg implements ActionListener
  {

    private JFrame f=new JFrame("REGISTRATION");
    private JButton Show = new JButton("SHOW");
    private JButton Back;



  public msg() {

    JLabel Username,FirstName,SurName,Password,MobileNumber,Email,DateOfBirth,coso;
    JButton SignUp,Show;
    JTextField Usr,First,Sur,Mobile,Em,DoB;
    JPasswordField Pass;

    coso = new JLabel(new ImageIcon(this.getClass().getResource("/pictures/welcome.gif")));
    coso.setBounds(70,-550, 1920,1920);

    Username = new JLabel("USERNAME");
    Username.setBounds(80,40, 200,50);
    Username.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    FirstName = new JLabel("FIRST NAME");
    FirstName.setBounds(80,140, 200,50);
    FirstName.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    SurName = new JLabel("SURNAME");
    SurName.setBounds(80,240, 200,50);
    SurName.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    Password = new JLabel("NEW PASSWORD");
    Password.setBounds(80,340, 200,50);
    Password.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    MobileNumber = new JLabel("MOBILE NUMBER");
    MobileNumber.setBounds(80,440, 200,50);
    MobileNumber.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    Email = new JLabel("EMAIL");
    Email.setBounds(80,540, 200,50);
    Email.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));

    DateOfBirth = new JLabel("DATE OF BIRTH");
    DateOfBirth.setBounds(80,640, 200,50);
    DateOfBirth.setFont(new Font("Caviar Dreams", Font.PLAIN, 20));


    Usr = new JTextField();
    Usr.setBounds(80,100, 250,30);

    First = new JTextField();
    First.setBounds(80,200, 250,30);

    Sur = new JTextField();
    Sur.setBounds(80,300, 250,30);

    Pass = new JPasswordField();
    Pass.setBounds(80,400, 250,30);
    Pass.setEchoChar('⚫');

    Mobile = new JTextField();
    Mobile.setBounds(80,500, 250,30);

    Em = new JTextField();
    Em.setBounds(80,600, 250,30);

    DoB = new JTextField();
    DoB.setBounds(80,700, 250,30);

    SignUp = new JButton(new ImageIcon(this.getClass().getResource("/pictures/weq-01.png")));
    SignUp.setBounds(80,750, 130,30);

    Show = new JButton("SHOW");
    Show.setBounds(350,400, 60,30);
    Show.setFont(new Font("Caviar Dreams", Font.PLAIN, 12));


    Back = new JButton("BACK");
    Back.setBounds(20,10, 70,20);
    Back.setFont(new Font("Caviar Dreams", Font.BOLD, 12));
    Back.setBackground(Color.YELLOW);
    Back.setForeground(Color.BLACK);
    Back.addActionListener(this);



      f.add(coso);f.add(Username);f.add(FirstName);f.add(SurName);f.add(Password);f.add(MobileNumber);f.add(Email);f.add(DateOfBirth);
      f.add(Usr);f.add(First);f.add(Sur);f.add(Pass);f.add(Mobile);f.add(Em);f.add(DoB);
      f.add(SignUp);f.add(Show);f.add(Back);
      f.setSize(1280,720);
      f.getContentPane().setBackground(Color.WHITE);
      f.setLayout(null);
      f.setVisible(true);
      f.setLocationRelativeTo(null);
      f.setExtendedState(JFrame.MAXIMIZED_BOTH);
      f.setUndecorated(true);
      f.setResizable(false);

    }


      public void actionPerformed(ActionEvent e)
      {
        if(e.getSource() == Back)
        {
          f.dispose();
          new welcome();

        }
      }



  }
