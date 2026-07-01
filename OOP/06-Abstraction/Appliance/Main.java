public class Main {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine("LG");
        Appliance tv = new Television("Sony");

        wm.displayBrand();
        wm.turnOn();

        System.out.println();

        tv.displayBrand();
        tv.turnOn();
    }
}
