public static void main(String[] args) {
    Car c1 = new Car();

    c1.brand = "BMW";
    c1.start();
    c1.drive();  

    Student s1 = new Student();

    s1.name = "Amber";
    s1.age = 20;
    s1.displayInfo();
    s1.study();

    Dog d1 = new Dog();
    d1.eat();
    d1.bark();
}