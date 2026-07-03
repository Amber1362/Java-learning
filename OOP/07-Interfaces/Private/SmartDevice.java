public interface SmartDevice {

    private void checkPower() {
        System.out.println("Checking Power Supply...");
    }

    default void turnOn() {
        checkPower();
        System.out.println("Device turned ON.");
    }

    static void companyInfo() {
        System.out.println("SmartDevice Inc.");
    }
}