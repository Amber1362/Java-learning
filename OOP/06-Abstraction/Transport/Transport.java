public abstract class Transport {
    String company;

    Transport(String company) {
        this.company = company;
    }

    void displayCompany() {
        System.out.println("Company: " + company);
    }

    abstract void move();
}
