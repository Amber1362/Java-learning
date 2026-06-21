public class ReturnValueIgnored {

    public static int change(int num) {
        return 999;
    }

    public static void main(String[] args) {
        int num = 10;

        change(num);
        System.out.println(num);
    }
}
