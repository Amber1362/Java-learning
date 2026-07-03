public interface Notifier {

    void sendMessage();

    default void showStatus() {
        System.out.println("Notification Sent Successfully.");
    }
}
