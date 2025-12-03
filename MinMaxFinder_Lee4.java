
/**
 * Write a description of class Lee4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MinMaxFinder_Lee4
{
    public static void main(String [] args){
        int[] numbers = {45, 12, 88, 99, 10, 72, 30};
        
        System.out.println("The array to be analyzed is:");
        for (int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            int currentNumber = numbers[i];
            if (currentNumber < smallest){
                smallest = currentNumber;
            }
            if (currentNumber > largest){
                largest = currentNumber;
            }
        }
        System.out.println("Analysis Complete (Single Loop Pass):");
        System.out.println("The SMALLEST number found is: " + smallest);
        System.out.println("The LARGEST number found is: " + largest);
    }
}