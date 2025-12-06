
/**
 * Write a description of class Lee12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ValueCounter_Lee12
{
    public static void main(String [] args){
        int[] numbers = {10, 5, 20, 5, 30, 5, 40, 5};
        int target = 5;
        int requiredCount = 3;
        int count = 0;
        
        for (int element : numbers){
            if (element == target){
                count++;
            }
        }
        if (count >= requiredCount){
            System.out.println("The value " + target + " appears " + count + " times (which is >= 3).");
        } else {
            System.out.println("The value " + target + " appears only " + count + " times (which is < 3).");
        }
    }
}