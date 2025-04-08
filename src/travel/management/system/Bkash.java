
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Bkash extends JFrame implements ActionListener  {
    
    
    JButton back;
    Bkash()
    {
        setBounds(500,200,800,600);
       // setLayout(null);
        
        JEditorPane pane=  new  JEditorPane();
        pane.setEditable(false);
        try
        {
            pane.setPage("https://www.bkash.com/products-services/payment");
            
            
            
        }catch( Exception e)
        {
           pane.setContentType("text/html");
           pane.setText("<html>Could not Load, Error 404 </html>");
        }
        
        JScrollPane sp=new  JScrollPane(pane);
        getContentPane().add(sp);
        
       back= new JButton("Back");
       back.setBounds(610,20,80,40);
       //back.setBackground(Color.PINK);
       //back.setForeground(Color.BLACK); 
       back.addActionListener(this);
       pane.add(back);
        
        
        setVisible(true);
        
    }
    
    
     public void actionPerformed(ActionEvent ae)
    {
          
          setVisible(false);
          new Payment();
        
    }
    public static void  main(String [] args)
    {
        new Bkash();
    }
}
