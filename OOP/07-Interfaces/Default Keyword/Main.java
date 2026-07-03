public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();

        email.sendMessage();
        email.showStatus();

        System.out.println();

        sms.sendMessage();
        sms.showStatus();
    }
}
