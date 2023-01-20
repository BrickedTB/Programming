package gfglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GFGList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        GFGList obj = new GFGList();
        
        int numberOfElements = 3;
        
        System.out.println(obj.getRandomElement(list,numberOfElements));
        
    }
    
     public List<Integer> getRandomElement(List<Integer> list, int totalItems)
    
    {
        Random rand = new Random();
        
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i<totalItems; i++)
        {
            int randomIndex = rand.nextInt(list.size());
            
            newList.add(list.get(randomIndex));
            
            list.remove(randomIndex);
        }
        
        return newList;
        
    }
    
}
