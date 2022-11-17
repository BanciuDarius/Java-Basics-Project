public class Variables {
    public static void main(String[] args) {
        String carBrand = "Volvo";
        String carModel = "XC 90";
        // strongly typed - must specify the type of variables
        System.out.println("I just bought a new car from brand: " + carBrand);
        System.out.println("The care model is: " + carModel);
        // over writing
        carModel = "XC 90 2022";
        // declare
        String owner;
        // initialize
        owner = "Darius";
        // declare
        String firstName;
        String lastName;
        // initialize
        firstName = "Banciu";
        lastName = "Darius";
        int age = 23;
        // concatenation
        System.out.println(firstName + " " + lastName + " has " + age + " years");
    }
}
