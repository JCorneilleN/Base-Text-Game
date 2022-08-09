

package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author John
 */
public class EndCredit extends JPanel implements ActionListener {
  
    Timer creditTimer = new Timer(5,this);
    String text;
    int textY = 600;
  File file = new File("MHWGO.wav");

    
    public EndCredit()  {
        
       JFrame windows = new JFrame("Credit Roll Test");
        windows.setSize(800,600);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setLocationRelativeTo(null);
        windows.add(this);
        windows.setVisible(true);
        
      
        
        this.setBackground(Color.black);
        
        
        text =" DUNGEON OF HELL\n\n " 
               + " Made by\n "
                
                
                +" Corneille Ngoy\n\n\n\n\n\n\n\n"
                +" Special Thanks To\n"
                +"Central Washinton University\n"
                +"&\n" + " Douglas McKinley\n\n\n\n\n\n\n\n\n\n\n"
                
                
               
                +" Thank you for playing! ";
                
       creditTimer.start();
      
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D)g;
        
        g2d.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        g2d.setColor(Color.white);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        int y = textY;
        
        for(String line : text.split("\n")){
            
            int stringLength = (int)g2d.getFontMetrics().getStringBounds(line, g2d).getWidth();
            int x = getWidth()/2 - stringLength/2;
             g2d.drawString(line, x, y += 28);
        }
        
       
    }
    
    public void actionPerformed(ActionEvent e){
        
        System.out.println(textY);
        textY--;
        if(textY < -500){
            creditTimer.stop();
        }
        
        repaint();
    }
    
}