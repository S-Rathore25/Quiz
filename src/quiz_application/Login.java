
package quiz_application;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules,Back;
     JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon//login.jpeg"));
        JLabel image = new JLabel(icon);
        image.setBounds(0 ,0 , 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300,25);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.red);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        Back = new JButton("Back");
        Back.setBounds(915,270,120,25);
        Back.setBackground(Color.red);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
            
        }else if (ae.getSource()==Back){
            setVisible(false);
        }
    }
    
    public static void main (String[] args){
        new Login();
        
    }
}
