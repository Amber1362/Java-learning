import java.util.ArrayList;

public class IntegerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;

        System.out.println("Numbers: ");

        for (Integer num : numbers) {
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
