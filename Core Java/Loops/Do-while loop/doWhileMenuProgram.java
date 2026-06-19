import java.util.Scanner;

public class doWhileMenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Start Game");
            System.out.println("2. View Profile");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Starting Game...");
            } else if(choice == 2) {
                System.out.println("Viewing Profile...");
            } else if(choice == 3) {
                System.out.println("Exiting Program...");
            } else {
                System.out.println("Invalid Choice!");
            }

        } while(choice != 3);

        sc.close();
    }
}
