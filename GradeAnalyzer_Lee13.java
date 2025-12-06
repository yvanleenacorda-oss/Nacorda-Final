
/**
 * Write a description of class Lee13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeAnalyzer_Lee13
{
    public static void main(String [] args){
        int[] grades = {68, 85, 70, 45, 100, 74, 88};
        final int PASS_THRESHOLD = 75;
        
        int studentsPassed = 0;
        int studentsFailed = 0;
        
        System.out.println("Grade Analysis");
        System.out.println("Passing Grade (Threshold); " + PASS_THRESHOLD);
        for (int grade : grades){
            if (grade >= PASS_THRESHOLD){
                studentsPassed++;
            } else {
                studentsFailed++;
            }
        }
        System.out.println("Total Students Passed (>= 75): " + studentsPassed);
        System.out.println("Total Students Failed (< 75): " + studentsFailed);
        System.out.println("Total Grades Analyzed: " + grades.length);
    }
}