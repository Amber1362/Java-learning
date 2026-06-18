import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter Placement ready: ");
        boolean isPlacementReady = sc.nextBoolean();

        System.out.println("Your form has been submitted successfully:)");

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Placement ready: " + isPlacementReady);

        sc.close();

    }
}
