import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if(!password.equals("java123")) {
                System.out.println("Wrong password");
            }
        }

        System.out.println("Access granted!");
        sc.close();
    }
}
