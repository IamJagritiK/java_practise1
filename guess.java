import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
   
   class guess{

        public static void main(String[] args) {
            
            int target=18;
            int temp=0;
         
            do {
                Scanner sc = new Scanner(System.in); 
                System.out.print("guess the target:");
                int num=sc.nextInt();
                temp=num;
              
                
                if(num>=1 && num<=50)
                    {
                        if(num>18){
                            System.out.println("Number guessed is more than original number.");
                        }
                        else if(num<18){
                            System.out.println("Number guessed is less than original number.");
                        }
                        else if(num==18){
                            System.out.println("Number guessed matches the original number.");
                        }
                        
                    }
            else
               System.out.println("Abort!You are far from original number.");

                
            } while (temp != target);
            

           
       }
   }