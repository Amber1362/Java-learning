import java.util.ArrayList;
import java.util.Iterator;

public class ForEachBehindScenes {
    public static void main(String[] args) {
        
        ArrayList<String> students = new ArrayList<>();

        students.add("Amber");
        students.add("Aarav");
        students.add("Piyush");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
