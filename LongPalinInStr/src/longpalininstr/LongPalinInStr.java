package longpalininstr;

public class LongPalinInStr {

    public static void main(String[] args) {
          String str,longest = " ";
          
           str = "Racecar Anna Civic Kayak Level Madam";
           
           String arr[] = new String[5];
           arr[0] = "Civic";
           arr[1] = "Anna";
           arr[2] = "Racecar";
           arr[3] = "Kayak";
           arr[4] = "Level";
          
           System.out.println(str);
           System.out.println("The longest palindrome in the string is: ");
           
           
           for(int i = 0; i < 4; i++)
           {
               if (arr[i].length() > arr[i+1].length())
               {
                   longest = arr[i];
               }
             
           }
           
            System.out.println(longest);
          
    }
    
}