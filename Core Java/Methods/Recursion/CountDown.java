public class CountDown {

    public static void count(int n) {
        System.out.println(n);

        if (n > 1) {
            count(n - 1);
        }
    }

    public static void main(String[] args) {
        count(5);
    }
}
