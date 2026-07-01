public class Main {
    public static void main(String[] args) {
        Transport transports[] = {
            new Bus("Mercedes"),
            new Train("Indian Railways"),
            new Airplane("Boeing")
        };

        for (Transport t : transports) {

            t.displayCompany();
            t.move();

            System.out.println();
        }
    }
}
