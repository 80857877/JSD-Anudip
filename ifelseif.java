
import java.util.Scanner; // Needed for the Scanner class

public class gra {
    public static void main(String[] args) {
        int score;
        char grade;

        Scanner obj = new Scanner(System.in);

        // Get the test score.
        System.out.print("Enter your numeric test score : ");
        score = obj.nextInt();

        // Calculate the grade.
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the grade.
        System.out.println("Your grade is " + grade);
    }
}
