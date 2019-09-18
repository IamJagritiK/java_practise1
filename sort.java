import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
   
  
public class sort
{ 
    public static void main(String[] args) 
    { 
                
                Scanner sc = new Scanner(System.in); 
                int num=sc.nextInt();
                int len = String.valueOf(num).length();//finding the length of int by converting it to string
                int[] a = new int[len];

                for(int k = (len-1); k>0; k--)

                {
                int p=0;
                p=num%10;
                    a[k] = p;
                    num=num/10;

                }

                int temp=0;
                for (int i = 0; i < len; i++) 

                {

                    for (int j = i + 1; j < len; j++) 

                    {

                        if (a[i] < a[j]) 

                        {

                            temp = a[i];

                            a[i] = a[j];

                            a[j] = temp;

                        }

                    }

                }

                System.out.print("Descending Order:");

                for (int i = 0; i < (len - 1); i++) 

                {

                    System.out.print(a[i] + ",");

                }

                System.out.print(a[len - 1]);

                int sEven=0;

                for(int i = 0; i < (len-1); i++)
                {
                    if(a[i] % 2 == 0)
                    {
                      sEven= sEven + a[i];
                    }
                }

                System.out.println("Sum of even number: "+ sEven);


                if (sEven>15)
                {
                    System.out.println("True");

                }
                else
                System.out.println("False");



    } 
} 