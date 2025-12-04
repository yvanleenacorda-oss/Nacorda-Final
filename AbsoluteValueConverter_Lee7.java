
/**
 * Write a description of class Lee7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class AbsoluteValueConverter_Lee7
{
     public static void main(String [] args){
         int[] numbers = {10, -5, 2, -15, 8, -1, 20};
        
         System.out.println("Original Array:");
         System.out.println(Arrays.toString(numbers));
         System.out.print("-----------------------------------------");
         for (int i = 0; i < numbers.length; i++){
             int originalValue = numbers[i];
             numbers[i] = Math.abs(numbers[i]);
             
             System.out.printf("Index [%d]: Converted %d to %d ", i, originalValue, numbers[i]);
         }
         System.out.println("---------------------------------------");
         System.out.println("Final Array (All Positive Values):");
         System.out.println(Arrays.toString(numbers));
     }
}