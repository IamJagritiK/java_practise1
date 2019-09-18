//import java.io.*; 
//import java.util.*; 
import java.util.Scanner;
//import java.lang.Long;
   
public class Palindrome { 
   
 
   
    public static void main(String args[]) { 
        long sEven=0;
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number:");
        long n = sc.nextLong(); 
            long temp;
            temp=n;    
            long r;
            long sum=0;
          
            while(n>0){    
                r=n%10;  

                if(r % 2 == 0)
                    {
                        sEven= sEven + r;
                    }
                else{
                    sEven=sEven;
                }

                sum=(sum*10)+r;    
                n=n/10;    
            }    
            if(temp==sum)    
            {      
                System.out.print("palindrome.");
                if(sEven > 25){
                    System.out.print("sum of even no. is greater than 25.");
                }
                else{
                    System.out.print("sum of even no. is less than 25.");
                }
    
             }  
            else    
            System.out.println("not palindrome");    
        }  


    } 
 