import java.util.Arrays;
import java.util.List;

public class For {
    public static void main(String[] args) {
         // for - loop, repetitive str.
         // from where to when and pacing
         // Problem: Print the 101 dalmatians
        for (int i = 1; i <= 101; i++) {
            System.out.println("The dog with number " + i);
        }
        // it helps to go through an array with the help of index
        int[] numbers = {3, 7, 10, 54};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The element has the index " + i + " and the value " + numbers[i]);
        }
        // for each - it goes through the array's elements and goes directly to the value
        for (int number : numbers) {
            System.out.println("Current number is " + number);
        }
        // go through an array with colors
        String[] colors = {"white", "blue", "orange", "red"};
        for (String color : colors) {
            System.out.println("The current color is " + color);
        }
        // the sum of numbers in array
        int s = 0;
        for (int number : numbers) {
            s = s + number;
    }
//        System.out.println(s); // out of for to show the final value of for, this is for each

        // Problem: How many times 3 appears in the following list {3,4,56,3,58,67,3,3,46}
        int[] elements = {3,4,56,3,58,67,3,3,46};
        int total = 0;
        for (int element : elements) {
            if (element == 3) {
                total += 1;
            }
        }
        System.out.println("The number 3 is displayed in that list for " + total + " times");


        int[] players = {1,7,21,4,7,5,32,7,31,5,7,43,7,7,23};
        int appears = 0;
        for (int player : players) {
            if (player == 7) {
                appears += 1;
            }
        }
        System.out.println("The player with number 7 appears for " + appears + " times");


    }
}