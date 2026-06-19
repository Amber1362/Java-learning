import java.util.Scanner;

public class PositiveNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumber = 0;
        int sum = 0;

        while (positiveNumber != -1) {
            System.out.print("Enter Number: ");
            positiveNumber = sc.nextInt();

            if(positiveNumber != -1) {
                sum += positiveNumber;
            }
        }

        System.out.println("Total sum: " + sum);
        sc.close();
    }
}
