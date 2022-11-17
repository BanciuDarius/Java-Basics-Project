public class Functions {
    public static void printGreeting() {
        System.out.println("Good morning! Welcome.");
    }
    // function = it's a logical delimitation which can be reused

    // a simple function which print something on desktop
    // doesn't have return
    // doesn't have parameters

    // a function that greets the client by his name
    // needs parameters
    public static void printGreetingByName(String name, String last_name) {
        System.out.println("Good morning " + name + " " + last_name);
    }

    // a function that calculate the average of 3 numbers

    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3;
        return media;
    }
public static double piValue() {
        double pi = 3.14;
        return 3.14;
}

    public static void main(String[] args) {

        // the function is called
        // first client is entering
        printGreeting(); // it's called

        // second client is entering
        printGreeting();

        // we call a function with parameters offering arguments
        printGreetingByName("Banciu", "Darius");
        printGreetingByName("Popescu", "Daniel");
        printGreetingByName("Dinescu", "Alina");

        System.out.println(mediaNr(3,3,3));
        double media1 = mediaNr(3132,32131,321321);
        double media2 = mediaNr(12321,32131,2132);
        double media3 = mediaNr(23123,45354,5533);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);
    }

}
