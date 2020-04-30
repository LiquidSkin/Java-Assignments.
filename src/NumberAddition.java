import java.util.Scanner;
import java.util.*;

public class NumberAddition {

    public static void addNumber(int a, int b) {
        int z = a + b;
        System.out.println("Initial value of Z after addition is" + " " + z);
        int results = z + 30;
        System.out.println("After adding 30 to the result, the final result is" + " " + results);
    }

    public static void main(String[] args) {

        NumberAddition n = new NumberAddition();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers between 2 and 10");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a >= 2 && a <= 10) && (b >= 2 && b <= 10)) {
            n.addNumber(a, b);
        } else {
            System.out.println("Invalid inputs, Please try again!");
        }
    }
}
