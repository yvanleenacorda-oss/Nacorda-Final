
/**
 * Write a description of class Lee15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFilter_Lee15
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 5;
        final int THRESHOLD = 50;
        int[] numbers = new int[ARRAY_SIZE];
        
        System.out.println("Array Input and Filtering");
        System.out.println("Please enter " + ARRAY_SIZE + " whole numbers.");
        for (int i = 0; i < ARRAY_SIZE; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("  ");
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Filtering for numbers > " + THRESHOLD);
        System.out.print("Result: ");
        
        boolean found = false;
        for (int i = 0; i < numbers.length; i++){
            int currentNumber = numbers[i];
            if (currentNumber > THRESHOLD){
                System.out.print(currentNumber + " ");
                found = true;
            }
        }
        if (!found){
            System.out.print("None of the entered numbers were greater than " + THRESHOLD + ".");
        }
        System.out.println();
    }
}