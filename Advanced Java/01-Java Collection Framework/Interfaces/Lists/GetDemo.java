import java.util.ArrayList;

public class GetDemo {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();

        months.add("January");
        months.add("Febuary");
        months.add("March");
        months.add("April");
        months.add("May");

        System.out.println("First month: " + months.get(0));
        System.out.println("Third month: " + months.get(2));
        System.out.println("Fifth month: " + months.get(4));
    }
}
