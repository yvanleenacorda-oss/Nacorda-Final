
/**
 * Write a description of class Lee8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ArrayCopier_Lee8
{
    public static void main(String [] args){
        int[] arrayA = {10, 20, 30, 40, 50};
        int[] arrayB = new int[arrayA.length];
        
        System.out.println("   Array Copy Demonstration   ");
        System.out.println("Array A (Source): " + Arrays.toString(arrayA));
        System.out.println("Array B (Destination, initially empty/zeros); " + Arrays.toString(arrayB));
        System.out.println("-----------------------------------------");
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length);
        System.out.println(" Copy Completed using System.arraycopy() ");
        System.out.println("Array A (Source, unchaged); " + Arrays.toString(arrayA));
        System.out.println("Array B (Destination, now copied); " + Arrays.toString(arrayB));
        
        int[] arrayC = Arrays.copyOf(arrayA, arrayA.length);
        System.out.println(" Copy Completed using Arrays.copyOf() ");
        System.out.println("Array C (New array created): " + Arrays.toString(arrayC));
    }
}