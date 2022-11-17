import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // lists are not such strict as arrays because they have a dynamic dimension
        // how to declare an empty list
        List<String> fruits = new ArrayList<>();
        // add elements in list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // how to take elements from list
        fruits.get(0); // take by index, but we need to print it to see it
        System.out.println(fruits.get(0));
        // how to find the index of an element
        System.out.println(fruits.indexOf("Banana")); // printed 1
        // Is the list empty?
        System.out.println(fruits.isEmpty()); // printed false

        if (fruits.isEmpty()) {
            System.out.println("You forgot to buy fruits!!!!");
        } else {
            System.out.println("You bought fruits");
        }

        // we delete all the elements from the list

        // fruits.clear();
        // System.out.println(fruits); // printed [] empty list
        // how to remove an element
        fruits.remove("Apple");
        // to display the elements
        System.out.println(Arrays.toString(fruits.toArray())); // printed [Banana, Orange] because we just removed the Apple

        // we declare an immutable list with values

        List<Integer> numbers = Arrays.asList(new Integer[]{1,33,45,96});
        System.out.println(Arrays.toString(numbers.toArray())); // printed [1, 33, 45, 96]

        // to declare a list with dynamic size
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(Arrays.toString(flowerList.toArray())); // printed [Ageratum, Allium, Poppy, Catmint, Rose]
        System.out.println(flowerList); // it's the same as upper but just for this type of list
        // to find the index - where is Poppy?
        int poppy_index = flowerList.indexOf("Poppy");
        flowerList.remove(poppy_index);
        System.out.println(flowerList);// [Ageratum, Allium, Catmint, Rose]

    }
}
