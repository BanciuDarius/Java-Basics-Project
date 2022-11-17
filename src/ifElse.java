import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        // Flow control - if else
        // evaluate conditions and fork the code by result
        System.out.println("We start the radio");
        // if I like the song, I will raise the volume
        boolean good_song = true;
        // I tell the PC if the song is good or not
        if (good_song == true) {
            System.out.println("I will raise the volume");
            System.out.println("I will sing the song");
        }
        System.out.println("We stop the radio");
        // if else
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
        int second_number = -4;
        if (second_number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
        // if, else if, else

        // How the robot  say Hi depending on the time?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the current hour: ");
        int hour = sc.nextInt();
        if (hour < 0) {
            System.out.println("The hour is not correct displayed");
        } else if (hour <= 11) {
            System.out.println("Good morning!");
        }
        else if (hour <= 18) {
            System.out.println("Hello!");
        }
        else if (hour <= 21) {
            System.out.println("Good evening!");
        }
        else if (hour <= 24) {
            System.out.println("Good night!");
        } else {
            System.out.println("The hour format is not valid!!!");
        }
        // Exercise by the upper model


        System.out.println("The car speed is....");
        int car_speed = sc.nextInt();
        if (car_speed < 0) {
            System.out.println("Invalid speed format");
        }
        else if (car_speed <= 50) {
            System.out.println("Legal speed in urban area!");
        }
        else if (car_speed <= 90) {
            System.out.println("Legal speed in extra urban area!");
        }
        else if (car_speed <= 130) {
            System.out.println("Legal speed on highways!");
        }
        else {
            System.out.println("Sir I need to take your driving license!");
        }
        // flow control - switch - it's used when we know the possible values

        // telephonic robot

        System.out.println("Chose one option....");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("You chose romanian");
        }
        else if (option == 2) {
            System.out.println("You chose english!");
        }
        else {
            System.out.println("Unknown option, please try again!");
        }
        // Now with switch
        System.out.println("Chose the language...");
        int language_option = sc.nextInt();
        switch (language_option) {
            case 0:
                System.out.println("Back to menu");
                break;
            case 1:
                System.out.println("Romanian");
                break;
            case 2:
                System.out.println("English");
                break;
            default:
                System.out.println("Invalid option");
        }
        }
}
