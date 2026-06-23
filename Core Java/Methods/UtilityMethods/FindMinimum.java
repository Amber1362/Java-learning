public class FindMinimum {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;
        int c = 100;
        int d = 10;

        int minValue = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("Minimum value: " + minValue);
    }
}
