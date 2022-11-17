public class Array {
    public static void main(String[] args) {
        // declare and initialize
        String[] students = {"Mark", "Jacob", "Andrew", "Kevin", "Georgia"};
        int[] numbers = {1, 33, 81, 99, 201};
        // it contains several elements of the same type
        // we access elements by index, witch starts from 0
        // always has a fix length
        // has the propriety length, how give us the length of the array

        System.out.println(students[0]); // printed Mark
        System.out.println(students[3]); // printed Kevin
        System.out.println(students.length); // printed 5 elements
        System.out.println(students[2]); // printed Andrew
        students[2] = "Tyson"; // over writing
        System.out.println(students[2]); // printed Tyson
        // concatenation
        System.out.println(students[0] + " " + "is a good friend of " + students[4]);
        // we add two array elements in one sentence - Mark is a good friend of Georgia
        // how to print always the last element of the array no matter the length of the array
        System.out.println("Last place is: " + students[students.length-1]); // the result - Last place is: Georgia
        // just declare and allocate the memory
        int[] grades = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(grades[1]); // the result is 0
        // when we don't have the data in the beginning
        grades[0] = 10;
        grades[1] = 9;



    }

}
