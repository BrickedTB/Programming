package abstractshape;
import java.io.*;
abstract class AbstractShape 
{
    String objectName = " ";
    
    AbstractShape(String name)
    {
        this.objectName = name;
    }
    
    public void moveTo(int x, int y)
    {
        System.out.println(this.objectName + " " + "has been moved to" + " " 
        + " x = " + x + " and y = " + y);
    }
    
    abstract public double area();
    abstract public void draw();
    
}

    class Rectangle extends AbstractShape
    {
        
    }

    public static void main(String[] args) {
        
    }
    
}
