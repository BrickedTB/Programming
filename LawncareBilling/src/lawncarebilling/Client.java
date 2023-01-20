package lawncarebilling;

import java.util.Scanner;
import java.io.*;

public class Client {
Name name;
Address address;
String billing;
Time totalTime;
double totalCharges;
static double rate = 0.0;



public Client()
{
 name = new Name();
 address = new Address();
 billing = "";
 totalTime = new Time();
 totalCharges = 0.0;
}

public Time getTotalTime() {return totalTime;}
public double getTotalCharges() {return totalCharges;}
public static void setRate(double newRate) {rate = newRate;}

    
public Client(Scanner in) throws IOException
{
    Time time;
    int hours;
    int minutes;
    double charge;

    String last = in.next();
    String first = in.next();
    String middle = in.next();
    name = new Name(first, last, middle);
    String seperator = in.nextLine();
    address = new Address(in);
    int numberOfJobs = in.nextInt();
    
    int count = 1;
    billing = "";
    totalTime = new Time();
    totalCharges = 0.0;
    while (count <= numberOfJobs)
    {
    hours = in.nextInt();
    minutes = in.nextInt();
    time = new Time(hours, minutes, 0);
    charge = time.getTime()/3600.0 * rate;
    billing = billing + " " + hours + ":" + minutes + "    $" + charge + '\n';
    totalTime = totalTime.plus(time);
    totalCharges = totalCharges + charge;
    count++;
    }
       seperator = in.nextLine();
}


    public void printBill(PrintWriter out)
    {
        out.println(name);
        out.println(address);
        out.println();
        out.println("Job Time     Charge");
        out.println(billing);
        out.println("Total time: " + totalTime.getHours() + ":" +
                totalTime.getMinutes());
        out.println("Total charges: $" + totalCharges);
        out.println();
    }

}

