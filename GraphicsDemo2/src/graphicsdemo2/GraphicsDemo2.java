package graphicsdemo2;

import javax.swing.JFrame;
import java.awt.*;

public class GraphicsDemo2 extends Canvas {
    
    public void paint(Graphics g)
    {
        
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);
        g.setColor(Color.blue);
        g.drawLine(50,150,100,180); 
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);
        
        g.setColor(Color.black);
        
        g.drawString("Graphics are pretty neat.", 500,100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36));
        g.drawString("Yes, they are.", 400,200);
        
        g.setColor(Color.white);
        g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC,60));
        
        g.drawString("Leander Lions", 300, 350);
        
        g.setColor(Color.blue);
        g.setFont(Font.decode("Calibri-BOLDITALIC-60"));
        
        g.drawString("Leander Lions", 290, 360);
        
        g.setColor(Color.black);
        g.setFont(new F)
        
        
        
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo2 canvas = new GraphicsDemo2();
        win.add( canvas ); 
        win.setVisible(true);
    }
    
}
