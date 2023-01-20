package cdlist;

import static java.lang.System.out;
import java.util.Scanner;

public class CDListDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CDClass[] Record = new CDClass[4];
        
        int x = 0;
        while(x<4)
        {
            Record[x] = new CDClass();
            
            out.println("Artist Name: "); 
            String artist = keyboard.nextLine();
            Record[x].setartistName(artist);
            
            out.println("Album Title: ");
            String album = keyboard.nextLine(); 
            Record[x].setalbumTitle(album);
            
            out.println("Year of Release: ");
            String yor = keyboard.nextLine(); 
            Record[x].setyearOfRelease(yor); 
            
            out.println("Record Label: ");
            String label = keyboard.nextLine(); 
            Record[x].setlabel(label);
            
            System.out.println();
            x = x+1;
        }
        
        x = 0;
        while(x<4)
        {
            Record[x].getartistName();
            Record[x].getalbumTitle();
            Record[x].getyearOfRelease();
            Record[x].getlabel();
            Record[x].printout();
            x = x+1; 
        }
    }
    
}
