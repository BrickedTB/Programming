package binarysearch;

public class BinarySearch {

    public static int binarysearch(int[] sortedArray, int start, int end, int key)
    {
        if (start < end)
        {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid])
            {
                return binarysearch(sortedArray, start, mid, key);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {

     }
    
}
