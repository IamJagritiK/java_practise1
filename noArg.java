import java.util.Scanner;

public class noArg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0, negative = 0, total = 0, count = 0;

        double average;

        System.out.println("Enter the number: ");
        int number;
try{
    if (input.hasNextInt()) {

        while ((number = input.nextInt()) != 0) {

            total += number;
            count++;
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        
        }
System.out.println("The number of positives is " + positive);
System.out.println("The number of negatives is " + negative);
System.out.println("total no. of arguments is " + (positive+negative));

System.out.println("The total is " + total);
}
       
  //      System.out.printf("The average is: " + average);
            }
         catch(Exception e){
            System.out.println("The input is not an integer");
        }   
}
}
