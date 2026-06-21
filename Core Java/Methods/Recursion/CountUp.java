public class CountUp {
    
    public static void count(int n) {
        System.out.println(n);

        if(n < 5) {
            count(n + 1);
        }

        System.out.println("Returning: " + n);
    }

    public static void main(String[] args) {
        count(1);
    }
}
