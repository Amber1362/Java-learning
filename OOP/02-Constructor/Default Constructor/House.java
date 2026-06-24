public class House {
    String color;
    int rooms;

    House() {
        System.out.println("House object created.");
    }

    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Rooms: " + rooms);
    }

    public static void main(String[] args) {
        House h1 = new House();

        h1.color = "White";
        h1.rooms = 3;

        h1.displayInfo();
    }
}
