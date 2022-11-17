import java.security.KeyStore;

public class DataTypes {
    public static void main(String[] args) {
        // Most used data types
        // String = characters letters between " "
        String brand = "Dacia";
        String model = "1300";
        String a = "3";
        String b = "4";
        System.out.println(a + b); // the result is 34 because they are string variables
        int x = 3;
        int y = 4;
        System.out.println(x + y); // the result is 7 because they are integer type
        // integer = whole number
        int fabricationYear = 1989;
        // double = zecimal number
        double price = 2359.99;
        // boolean/bool = true or false
        boolean signedUp = true;
        // char = a single character from keyboard
        char grade = 'A';
        System.out.println(brand.toUpperCase()); // printed DACIA
        // upper letters
        System.out.println(brand.toLowerCase()); // printed dacia
        // lower letters
        System.out.println(brand.length()); // printed 5, means 5 letters
        // to find the length of a string

    }
}
