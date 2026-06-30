public class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(20, 10);
        calc.add(20.0, 10.5);
        calc.add(40, 10, 10);
    }
}
