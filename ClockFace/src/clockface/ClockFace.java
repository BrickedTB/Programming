package clockface;

import javax.swing.JFrame;
import java.awt.*;

public class ClockFace extends Canvas {
    
    public void paint(Graphics g)
    {
        g.drawOval(275,200,200,200);
        
        g.drawLine(375,300,375,225);
        g.drawString("12",368,220);
        
        g.drawLine(375,300,425,300);
        g.drawString("3", 460, 305);
        
        g.drawString("6",375,390);
        g.drawString("9",282,305);
    }
  
    public static void main(String[] args) {
        
        JFrame win = new JFrame("ClockFace");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas ); 
        win.setVisible(true);
    }
    
}
