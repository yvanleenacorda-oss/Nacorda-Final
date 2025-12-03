
/**
 * Write a description of class Lee2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SevenCounter_Lee2
{
    public static void main(String [] args){
        int[] arrayOfNumbers = {15, 7, 22, 1, 7, 99, 4, 7, 10, 7};
        int number = 7;
        int countOfSevens = 0;
        
        System.out.println("The array being searched is: ");
        for (int num: arrayOfNumbers){
            System.out.print(num + " ");
        }
        System.out.println("\n");
        for (int numbeer : arrayOfNumbers){
            if (number == 7){
                countOfSevens++;
            }
            System.out.println("Search complete.");
            System.out.println("The number " + 7 + " was found " + countOfSevens + " times.");
        }
    }
}