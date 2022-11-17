/*
Operators:
arithmetic: +, -, * , /, %
to compare: <, >, ==, !=, >=, <=
logic: &&, ||

Flow control: if else
 */
public class Operators {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = b;
        System.out.println(a - b); // 5 - 5 = 0
        System.out.println(a + b); // 5 + 5 = 10
        System.out.println(a * b); // 5 * 5 = 25
        System.out.println(a / b); // 5 / 5 = 1
        System.out.println(a % b); // 5 % 5 = 0 (the rest)
        // arithmetical
        System.out.println(12 > b); // true 12 > 5
        System.out.println(12 < b); // false 12 < 5
        System.out.println(a == b); // true 5 == 5
        System.out.println(a != b); // false 5 != 5 (different)
        // compare
        System.out.println(7 > b && 8 > b); // 7 > 5 si 8 > 5? true
        System.out.println(7 > b && 3 > b); // 7 > 5 si 3 > 5? false, both need to be true
        System.out.println(7 > b || 3 > b); // 7 > 5 sau 3 > 5? true, just one need to be true
        // logic
    }
}
