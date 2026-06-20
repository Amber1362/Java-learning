public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}
