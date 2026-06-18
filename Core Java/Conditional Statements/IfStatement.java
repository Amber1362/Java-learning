import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanAge = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanAge.nextInt();

        if(age > 18) {
            System.out.println("You are eligible for the vote.");
        } else {
            System.out.println("You are not eligible for the vote.");
        };

        scanAge.close();
    }
}
