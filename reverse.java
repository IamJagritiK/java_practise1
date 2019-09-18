import java.io.*; 
import java.util.*; 
import java.util.Scanner;
import java.lang.Long;
import java.lang.String;

class reverse{
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();

    int len = str.length();

    char[] a = new char[len];
    int i=-1;
    
    for(int j=(len-1);j>=0;j--)
    {
        i++;
        char can = str.charAt(i);//candidate ko string le liye auur charAt har char ko index se llega
        a[j] = can ;
    }
           
    for (int k = 0;k <=(len - 1); k++) 

    {

        System.out.print( a[k]);

    }
}
}