import java.util.ArrayList;

public class AddDemo {
    public static void main(String[] args) {
        ArrayList<String> devices = new ArrayList<>();
        devices.add("iPhone");
        devices.add("Redmi");
        devices.add("Samsung");
        devices.add("Motorola");

        for (String device : devices) {
            System.out.println(device);
        }
    }
}
