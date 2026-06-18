import java.util.Scanner;

public class ExamResultChecker {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);

        System.out.print("Enter your result: ");

        int examResult = result.nextInt();

        if(examResult > 0 && examResult <= 100) {
            if(examResult >= 40) {
                System.out.println("You passed the exam.");
            } else {
                System.out.println("You failed the exam.");
            }
        } else {
            System.out.println("Invalid marks");
        }

        result.close();
    }
}
