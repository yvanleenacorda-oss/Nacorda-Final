
/**
 * Write a description of class Lee10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lee10
{
     public static void main(String [] args){
         int[] arr = {3, 5, 7, 8, 9};
         int index = -1;
         
         for (int i = 0; i < arr.length; i++){
             if (arr[i] % 2 == 0){
                 index = i;
                 break;
             }
         }
         
         System.out.println("First even index: " + index);
}
}
     
     
     