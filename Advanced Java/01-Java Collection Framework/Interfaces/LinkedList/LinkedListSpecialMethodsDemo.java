import java.util.LinkedList;

public class LinkedListSpecialMethodsDemo {
    public static void main(String[] args) {
        LinkedList<String> devices = new LinkedList<>();

        devices.add("Redmi");
        devices.add("iPhone");
        devices.add("Realme");
        devices.add("Iqoo");

        System.out.println("Initial Devices: ");
        for (String device : devices) {
            System.out.println(device);
        }

        System.out.println();

        devices.addFirst("Vivo");
        devices.addLast("Oppo");

        System.out.println("List after adding Vivo as a first node and Oppo as a last node: ");

        for (String device : devices) {
            System.out.println(device);
        }

        System.out.println();

        devices.removeFirst();
        devices.removeLast();

        System.out.println("List after removing the first and last node");
        for (String device : devices) {
            System.out.println(device);
        }
    }
}
