import java.util.Objects;

public class Student {
    
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) 
            return true;

        if(this.getClass() != obj.getClass() || obj == null) {
            return false;
        }

        Student other = (Student) obj;

        return this.name.equals(other.name) &&
               this.rollNo == other.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
