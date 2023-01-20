package boxy3;

import javax.swing.JFrame;
import java.awt.*;

public class Boxy3 extends Canvas{
    
    public void paint(Graphics window)
    {
        drawBox(window,Color.YELLOW,200,300,50,30);
        drawBox(window,Color.GREEN,400,220,30,150);
       
    }
    
    public void drawBox( Graphics window, Color c, int x, int y, int w, int h)
    {
        window.setColor(c);
        window.fillRect(x, y, 100, 100);
        window.setColor(Color.YELLOW);
        window.fillRect(x+10,y+10,w+10,h+10);
        
    }
    public static void main(String[] args) {
        
        Boxy3 canvas = new Boxy3();
        JFrame win = new JFrame("Boxy2");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setBackground(Color.WHITE);
        win.add( canvas ); 
        win.setVisible(true);
        
    }
    
}
