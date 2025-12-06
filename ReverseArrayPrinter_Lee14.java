
/**
 * Write a description of class Lee14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ReverseArrayPrinter_Lee14
{
    public static void main(String [] args){
        int[] numbers = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.print("Array in Reverse Order: ");
        
        int lastIndex = numbers.length - 1;
        for (int i = lastIndex; i >= 0; i--){
            System.out.print(numbers[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println(); 
    }
}