public class FindMaximum {
    public static void main(String[] args) {
        int a = 45;
        int b = 90;
        int c = 75;

        int maxValue = Math.max(Math.max(a, b), c);

        System.out.println("Maximum value: " + maxValue);
    }
}
