import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map - is a representation of dates in a key-value system
        // example: Jacob has 10 grade, Andrew has 9 grade

        // we declare a map
        Map<String, Integer> students_grades = new HashMap<>();
        // we add elements
        students_grades.put("Jacob", 10);
        students_grades.put("Andrew", 9);
        students_grades.put("Kevin", 7);

        // how we find the grades?
        System.out.println("Kevin has the grade " + students_grades.get("Kevin")); // Kevin has the grade 7

        // how we overwrite an element
        students_grades.replace("Kevin", 10);
        System.out.println("Kevin made some project and now his grade is " + students_grades.get("Kevin"));
        // Kevin made some project and now his grade is 10
        // the size of the map
        System.out.println(students_grades.size()); // 3

        // delete values

        students_grades.remove("Kevin");
        System.out.println(students_grades.size()); // 2

        //declare and initialize values
        Map<String, Integer> months = new HashMap<>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
            put("Apr", 4);
            put("May", 5);
            put("Jun", 6);
        }};
        System.out.println(months);
        // has a random order, it's not ordered --> {Feb=2, Apr=4, Jun=6, May=5, Jan=1, Mar=3}







    }
}
