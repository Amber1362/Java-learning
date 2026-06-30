public class Printer {
    void print(String a) {
        System.out.println(a);
    }

    void print(int a) {
        System.out.println(a);
    }

    void print(double a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello");
        printer.print(100);
        printer.print(99.99);
    }
}
