
/**
 * Write a description of class Lee5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EarlyLoopStoper_Lee5
{
    public static void main(String [] args){
     int[] data = {10, 50, 75, 20, 90, 15, 60, 85};
     int TARGET_VALUE = 20;
     boolean found = false;
     
     System.out.println("Searching array for the value: " + 20);
     System.out.print("Array: ");
     for (int num : data){
         System.out.println(" ");
         for (int i = 0; i < data.length; i++){
             System.out.println("Checking index [" + i + "] which holds value: " + data[i]);
             if (data[i] == 20){
                 System.out.println("SUCCESS! Target value " + 20 + " found at index " + i + " ");
             }
         }
      }
     System.out.println("Search finished. Target value was not found in the array.");  
    }
}