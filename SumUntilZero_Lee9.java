
/**
 * Write a description of class Lee9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumUntilZero_Lee9
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        
        System.out.println(" Summation Program ");
        System.out.println("Enter numbers one by one. The program stops and calculates");
        System.out.println("the sum when you enter 0.");
        System.out.println(" ");
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            try {
                input = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine(); 
                input= -1;
                continue;
            }
            sum += input;
        } while (input != 0);
        scanner.close();
        int finalSum = sum - 0;
        System.out.println(" ");
        System.out.println("Stopping condition (0) received.");
        System.out.println("The total sum of all entered numbers is: " + finalSum);
    }
}