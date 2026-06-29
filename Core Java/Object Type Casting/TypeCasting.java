class A {
    public void showOne() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void showTwo() {
        System.out.println("In B Show");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        A obj = new B();
        obj.showOne();

        B obj2 = (B) obj;
        obj2.showOne();
        obj2.showTwo();
    }
}
