public class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    @Override
    public boolean equals(Object obj) {

        Student other = (Student) obj;

        return this.name.equals(other.name)
                && this.rollNo == other.rollNo;
    }
}
