import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;

class checkSpecial{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
      
        char ch = sc.next().charAt(0);
        if (ch>=65 && ch<=90)
		System.out.print("Character is a capital letter");
        else if (ch>=97 && ch<=122)
        System.out.print("Character is a small letter");
        else if (ch>=48 && ch<=57)
        System.out.print("Character is a digit");
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
               (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
        System.out.print("Character is a special symbol");


    }

}