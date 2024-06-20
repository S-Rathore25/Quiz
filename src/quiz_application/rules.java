
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{
    
    String name;
    JButton Start,Back;
    
    rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel(" Welcome " + name + " To Simple Minds ");
        heading.setBounds(50,20, 700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel Rules = new JLabel();
        Rules.setBounds(20,90, 700,350);
        Rules.setFont(new Font("Tahoma", Font.PLAIN,16));
       Rules.setText(
       "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
       );
        add(Rules);
        
        Back = new JButton("Back");
        Back.setBounds(250,500,100, 30);
        Back.setBackground(Color.red);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        
        Start = new JButton("Start");
        Start.setBounds(400,500,100,30);
        Start.setBackground(Color.red);
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);
        
        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Start){
            setVisible(false);
            new Quiz(name);
        }else  {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main (String[] args){
       new rules("User");
        
    }
}
