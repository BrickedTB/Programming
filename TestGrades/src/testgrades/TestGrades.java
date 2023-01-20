package testgrades;

import javax.swing.JOptionPane;

public class TestGrades 
{
    public static void main(String[] args) 
    {   
        String size,students,test,tests;
        int cs,ts;
        double Tscores;

        size = JOptionPane.showInputDialog(null,"Input the size of the class");
        cs = Integer.parseInt(size); 
        test = JOptionPane.showInputDialog(null,"Input the amount of tests");
        ts = Integer.parseInt(test);    

        String[] Sarray = new String[cs];

        for (int y = 0; y<ts; y++)
        {
            students = JOptionPane.showInputDialog(null,"Input the student names");
                Sarray[y] = students;
        }

        double[][] Tarray = new double[cs][ts];
        double[] avg = new double[cs];
        double sum = 0;

        for (int i = 0; i < cs; i++) 
        {
            JOptionPane.showInputDialog(null,"Enter " + Sarray[i] + "'s test grades:");
            for (int c = 0; c < ts; c++)
            {
                tests = JOptionPane.showInputDialog(null,"Test " + (c+1) + ": ");
                Tscores = Integer.parseInt(tests);
                Tarray[i][c] = Tscores;   
                sum = sum + Tarray[i][c];
            }
            avg[i] = (sum / ts);
            sum = 0;
        }

            for (int x = 0; x < cs; x++)
            {
               System.out.println("Student Name: " + Sarray[x]);
               System.out.printf("2%f" + "Average: " + avg[x]);
               for (int z = 0; z<cs; z++)
               {
                   System.out.println("Test #" + (z+1) + " = " + Tarray[x][z]);
               } 
            }

            double totalAvg = 0;

            for (int a = 0; a < ts; a++)
            {
                for (int u = 0; u < cs; u++)
                {
                    totalAvg = totalAvg + Tarray[u][a];
                }
                System.out.printf("2%f" + "Average for test " + (a + 1) + ": " + (totalAvg/cs));
                totalAvg = 0;
            }
        }
}

    
