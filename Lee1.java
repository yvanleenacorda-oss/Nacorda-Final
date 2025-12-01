
/**
 * Write a description of class Lee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lee1
{
     public static void main(String [] args){
         Scanner scanner = new Scanner(System.in);
         int number;
         while(true){
             System.out.print("Enter a number between 1 and 100: ");
             number = scanner.nextInt();
             if (number >= 1 && number <= 100){
                 System.out.println("Valid number entered: " + number);
                 break;
             } else {
                 System.out.println("Error: " + number + " is out of range.");
             }
         }
         System.out.println("Error: Invalid input. Please use a whole number.");
         scanner.close();
    }
}