
/**
 * Write a description of class Lee6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddAverageLee6
{
     public static void main(String [] args){
         int[] data = {10, 7, 4, 13, 2, 1, 19, 5};
         double sumOfOdds = 0.0;
         int countOfOdds = 0;
         
         System.out.println("Array to analyze: [10, 7, 4, 13, 2, 1, 19, 5]");
         System.out.println("-------------------------------------------");
         for (int number : data){
             if (number % 2 != 0){
                 sumOfOdds += number;
                 countOfOdds++;
             }
         }
         System.out.println("Processing complete.");
         System.out.println("-------------------------------------------");
         if (countOfOdds > 0){
             double average = sumOfOdds / countOfOdds;
             
             System.out.println("Total Sum of Odds Numbers: " + (int)sumOfOdds);
             System.out.println("Total Count of Odd NUmbers: " + countOfOdds);
             System.out.printf("Average of Od NUmbers: % 2f ", average);
         } else {
             System.out.println("No odd numbers were found in the array. Cannot compute the average.");
         }
     }
}