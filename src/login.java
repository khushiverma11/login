import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class login extends JFrame implements ActionListener
{
    JButton b;
    JPanel p;
    JLabel l1,l2;
    JTextField t1,t2;

    login()
    {                           //username
        l1 = new JLabel();
        l1.setText("username");
        t1 = new JTextField(20);
        //password
        l2 = new JLabel();
        l2.setText("password");
        t2 = new JTextField(8);
        //button
        b = new JButton("submit");
        //panel
        p = new JPanel(new GridLayout(3, 1));
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b);
        //panel added to center(you can also add in east west south or north)
        add(p, BorderLayout.CENTER);
        b.addActionListener(this);
        setTitle("login page");
    }
        public void actionPerformed(ActionEvent ae)
        {
                                //get values from user
            String l1Value =t1.getText();
            String l2Value =t2.getText();
                                //check values are right or not
            if(l1Value.equals("test1@gmail.com") && l2Value.equals("test"))
            {
                NewPage page=new NewPage();
                page.setVisible(true);

                JLabel l3=new JLabel("welcome: "+ l1Value);
                                // layer that is used to hold objects is called the content pane
                page.getContentPane().add(l3);
            }
            else
            {
                System.out.println("incorrect password");
            }
        }
}
class loginformdemo
{
    public static void main(String aa[])
    {
        try
        {
            login form = new login();
            form.setSize(300, 100);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}


