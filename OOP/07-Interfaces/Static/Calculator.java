public class Calculator {
    String name = "Amber";

    void displayOwner() {
        System.out.println("Owner: " + name);
    }

    static void displayVersion() {
        System.out.println("Calculator Version 1.0");
    }

    public static void main(String[] args) {
        Calculator.displayVersion();
        
        Calculator calc = new Calculator();

        calc.displayOwner();
        calc.displayVersion();
    }
}
