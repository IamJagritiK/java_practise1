import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
import java.lang.String;

class twoInput{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        String inputOne = sc.nextLine();
        int inputTwo = sc.nextInt();

        int l = inputOne.length();
        
        String ns =inputOne.substring(l-inputTwo);
        
        System.out.print(inputOne);

        for(int i=0;i<inputTwo;i++)
        {
            System.out.print(ns);

        }

        
           
        

    }
}