public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int length = numbers.length;
        average = (double) sum / length;

        System.out.println("Average: " + average);
    }
}
