public class SmsNotifier implements Notifier {
    public void sendMessage() {
        System.out.println("SMS sent.");
    }

    public void showStatus() {
        System.out.println("SMS Delivered Successfully.");
    }
}