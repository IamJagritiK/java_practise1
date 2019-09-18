import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
   
 class ConditionalCheck{

    public static int isOdd(int n){
         int r=0;
         r=n%10;
          if(r % 2 == 0){
              return 1;
           }
          
          else
              return 0;

    }



    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int res= isOdd(num);

        if(res == 0){
         //  isOdd(num);
         
           if((num>=20 && num<=30))
           {
            System.out.print("Tom");
           }
           
        }
        else if((res == 1) & (num>=20 && num<=30)){
            System.out.print("Jerry");

        }
        else{
            System.out.print("nothing!");
        }
          



    }

}
 