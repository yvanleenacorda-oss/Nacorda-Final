
/**
 * Write a description of class Lee16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DigitCounter_Lee16
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        long number = scanner.nextLong(); 
        scanner.close();
        
        long originalNumber = number;
        int count = 0;
        if (number == 0){
            count = 1;
        } else {
            number = Math.abs(number);
            while (number > 0){
                number = number / 10;
                count++;
            }
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}