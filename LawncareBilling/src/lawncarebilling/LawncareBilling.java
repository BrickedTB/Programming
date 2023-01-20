package lawncarebilling;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class LawncareBilling {

    public static void main(String[] args) throws IOException{
        
        String inputFileName;
        String outputFileName;
        Scanner in = new Scanner(System.in);
        Client client;
        int clientCount = 0;
        Time monthlyTime = new Time();
        double monthlyCharges = 0.0;
        System.out.print("Enter input file name: ");
        inputFileName = in.nextLine();
        Scanner inFile = new Scanner(new FileReader(inputFileName));
        System.out.print("Enter output file name: ");
        outputFileName = in.nextLine();
        PrintWriter outFile = new PrintWriter(new FileWriter(outputFileName));
        System.out.print("Enter hourly rate");
        Client.setRate(in.nextDouble());
        while (inFile.hasNextLine())
        {
            client = new Client(inFile);
            client.printBill(outFile);
            monthlyTime = monthlyTime.plus(client.getTotalTime());
            monthlyCharges = monthlyCharges + client.getTotalCharges();
            clientCount++;
        }
        
        System.out.println("Total time for month:    " + monthlyTime.getHours()
                + ":" + monthlyTime.getMinutes());
        Time avgTime = new Time(monthlyTime.getTime()/(double)clientCount);
        System.out.println("Average time for month:     " + avgTime.getHours() +
                ":" + avgTime.getMinutes());
        System.out.println("Total charges for month:  $" + monthlyCharges);
        System.out.println("Average charge for month: $" + 
                monthlyCharges/(double)clientCount);
        inFile.close();
        outFile.close();
        
    }
    
}
