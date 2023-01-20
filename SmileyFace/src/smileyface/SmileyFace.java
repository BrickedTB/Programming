package smileyface;

import java.awt.*;
import javax.swing.JFrame;

public class SmileyFace extends Canvas{

    public void paint( Graphics g )
    {
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for (int X = 0; X < 800; X += 50)
            g.drawString(String.valueOf(X), X, 50);
        for (int Y = 100; Y < 600; Y += 50)
            g.drawString(String.valueOf(Y), 28, Y);
        g.setColor(Color.lightGray);
        for (int X = 0; X < 800; X += 50)
            g.drawLine(X,0,X,599);
        for (int Y = 100; Y < 600; Y += 50)
            g.drawLine(0,Y,799,Y);
        
        g.drawOval(300, 200, 200, 200);
        g.setColor(Color.yellow);
        g.fillOval(300,200,200,200);
        
        
        g.drawOval(360, 250, 25, 50);
        g.setColor(Color.blue);
        g.fillOval(360,250,25,50);
            
        g.drawOval(420, 250, 25, 50);
        g.setColor(Color.blue);
        g.fillOval(420 ,250,25,50);
        
        g.setColor(Color.red);
        g.fillArc(325, 300, 150,50,0,-180);
    }
    
    public static void main(String[] args) {
        
        JFrame win = new JFrame("SmileyFace");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmileyFace canvas = new SmileyFace();
        win.add( canvas ); 
        win.setVisible(true);
        
    }
    
}
