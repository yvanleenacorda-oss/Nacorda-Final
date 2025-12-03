
/**
 * Write a description of class Lee3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarTriangle_Lee3
{
     public static void main(String [] args){
         int TRIANGLE_HEIGHT = 5;
         
         System.out.println("Generating a triangle pattern of " + TRIANGLE_HEIGHT + " rows: ");
         for (int i = 1; i <= TRIANGLE_HEIGHT; i++){
             for(int j = 1; j <= i; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println("Pattern generation complete.");
     }
}