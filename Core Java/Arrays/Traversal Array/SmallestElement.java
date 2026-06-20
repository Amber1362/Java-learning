public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 30, 40};
        int smallestNum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(smallestNum > numbers[i]) {
                smallestNum = numbers[i];
            }
        }

        System.out.println(smallestNum);
    }
}
