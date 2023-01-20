package sierpinskitriangle;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SierpinskiTriangle extends Canvas {

    public void paint(Graphics g)
    {
        int x1 = 512, y1 = 109, x2 = 146, y2 = 654, x3 = 876, y3 = 654, x = 512, y = 382;
        
        int dx = 0, dy = 0;
        
        for(long i = 0; i < 100000; i++)
        {
            g.drawLine(x,y,x,y);
            
            int rand = (int) (Math.random() * 3);
            
            if(rand == 0)
            {
                dx = x - x1;
                dy = y - y1;
            }
            
            if(rand == 1)
            {
                dx = x - x2;
                dy = y - y2;
            }
            
            if(rand == 2)
            {
                dx = x - x3;
                dy = y - y3;
            }
            
            x = x - dx / 2;
            y = y - dy / 2;
            
        }
    }
    
    public static void main(String[] args) {
       
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(1024, 768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new SierpinskiTriangle());
        win.setVisible(true);
        
       
    }
    
}
