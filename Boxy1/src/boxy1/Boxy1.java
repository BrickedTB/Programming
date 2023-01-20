package boxy1;

import javax.swing.JFrame;
import java.awt.*;

public class Boxy1 extends Canvas{
    
    public void paint(Graphics window)
    {
        window.setColor(Color.BLUE);
        window.fillRect(200,300,100,100);
        window.setColor(Color.WHITE);
        window.fillRect(210,310,80,80);
        
    }

    public static void main(String[] args) {
  
        JFrame win = new JFrame("Boxy1");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Boxy1 canvas = new Boxy1();
        canvas.setBackground(Color.WHITE);
        win.add( canvas ); 
        win.setVisible(true);
        
    }
    
}
