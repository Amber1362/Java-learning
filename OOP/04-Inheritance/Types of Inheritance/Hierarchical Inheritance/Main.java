public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Designer des = new Designer();

        dev.login();
        dev.writeCode();

        des.login();
        des.designUI();
    }
}
