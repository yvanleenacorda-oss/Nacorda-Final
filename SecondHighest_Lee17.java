
/**
 * Write a description of class Lee17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondHighest_Lee17
{
    public static void main(String [] args){
        int[] numbers = {10, 5, 20, 8, 15};
        if (numbers.length <2){
            System.out.println("Array must contain at least two numbers.");
            return;
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int number : numbers){
            if (number > highest){
                secondHighest = highest;
                highest = number;
            }
            else if (number > secondHighest && number != highest){
                secondHighest = number;
            }
        }
        System.out.println("The array is: " + java.util.Arrays.toString(numbers));
        System.out.println("The second highest number is: " + secondHighest);
    }
}