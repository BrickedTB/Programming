package boxy2;

import javax.swing.JFrame;
import java.awt.*;

public class Boxy2 extends Canvas{
    
    public void paint(Graphics window)
    {
        drawBox(window, Color.RED, 200, 300);
        
    }
    
    public void drawBox( Graphics window, Color c, int x, int y)
    {
        window.setColor(c);
        window.fillRect(x, y, 100, 100);
        window.setColor(Color.WHITE);
        window.fillRect(x+10,y+10,80,80);
        
    }
    public static void main(String[] args) {
        
        Boxy2 canvas = new Boxy2();
        JFrame win = new JFrame("Boxy2");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas ); 
        win.setVisible(true);
        
    }
    
}
