public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 30, 40};
        int largestNum = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(largestNum < numbers[i]) {
                largestNum = numbers[i];
            }
        }

        System.out.println("largest number: " + largestNum);
    }
}
