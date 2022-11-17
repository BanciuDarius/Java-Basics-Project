public class While {
    public static void main(String[] args) {
        // while - loop, repetitive structure

        // problem: A car runs while it has gas

        int gas_liters = 10;
        while (gas_liters > 0) {
            // accelerate
            System.out.println("Vruum vruum!");
            // we subtract gas liters
            gas_liters = gas_liters-1;
            // when we have just 3 liters, the gas indicator light appears
            if (gas_liters <= 3) {
                System.out.println("Gas indicator light appeared. You have a limited range");
            }
        }
        System.out.println("STOP! You ran out of gas!!!");
    }
}
