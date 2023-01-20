package lawncarebilling;

import java.util.Scanner;
import java.io.*;

public class Address {
    String street;
    String city;
    String state;
    int zipCode;
 
    public Address()
    {
        street = "";
        city = "";
        state = "";
        zipCode = 0;    
    }
    
    public String getStreet() {return street;}
    public String getCity() {return city;}
    public String getState() {return state;}
    public int getZipCode() {return zipCode;}
    
    public String toString()
    {
        return street + '\n' + city + ", " + state + " " + zipCode;
    }
    
    public Address(Scanner in)
    {
        street = in.nextLine();
        city = in.next();
        state = in.next();
        zipCode = in.nextInt();
        String separator = in.nextLine();
    }   
    
    
}
