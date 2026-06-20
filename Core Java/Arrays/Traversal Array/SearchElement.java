public class SearchElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]) {
                System.out.print("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.print("Element not found");
        }
    }
}
