public class AutoBoxingDemo {
    public static void main(String[] args) {
        int score = 100;

        Integer num = score;

        int anotherNum = num;

        System.out.println(num);
        System.out.println(anotherNum);
    }
}
