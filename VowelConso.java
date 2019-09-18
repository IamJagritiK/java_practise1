import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
import java.lang.String;
   

class VowelConso{

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in); 
    String candidate = sc.nextLine();

    for (int i=0;i< candidate.length();i++)
    {
        char can = candidate.charAt(i);

        if(can =='a'||can =='e'|| can =='i'||can =='o'||can =='u'||can =='A'||can =='E'||can =='I'||can =='O'||can =='U')
          {
            System.out.println(can+"-"+" Vowel");
           
          }
        else if((can>='a'&& can<='z')||(can>='A'&&can<='Z'))
        {
        System.out.println(can+"-"+" Consonent");}
        else 
            System.out.println(can +"-"+"Not an alphabet");
        
      		

        }

   }
 
   






     
 }








