
/**
 * Write a description of class Lee11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class SimpleEvenPinter_Lee11
{
    public static void main(String [] args){
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        System.out.println("Elements at even Indices");
        for (int i = 0; i < data.length; i += 2){
            System.out.println("Index " + i + ": " + data[i]);
            
        }
    }
}