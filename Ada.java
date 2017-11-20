/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Chhavi Jain
 */
public class Ada extends JFrame implements ActionListener 
{
    JButton b1,b2;
    Ada()
    {
        setBounds(200,200,280,250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel l1=new JLabel("Welcome Mr. Malhotra."), l2=new JLabel("How can I help You?");
        l1.setBounds(30,10,140,30);
        l2.setBounds(30,40,140,30);
        b1=new JButton("schedule room cleaning");
        b2=new JButton("ration breakfast leftover");
        b1.setBounds(30,100,190,30);
        b2.setBounds(30,150,190,30);
        add(b1);
        add(b2);
        add(l1);
        add(l2); 
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Ada();
    }
    public void actionPerformed(ActionEvent e)
    {
        JButton b=(JButton)e.getSource();
        this.dispose();
        if(b.equals(b2))
            new FracKnap().main(new String[]{});
        else
            new ActivitySchedule().main(new String[]{});
    }
}
