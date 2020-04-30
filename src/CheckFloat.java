import java.util.*;
import java.util.Scanner;

public class CheckFloat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        float f = sc.nextFloat();
        if (f % 1 != 0) {
            System.out.println("the number is" + " " + f);
        } else {
            System.out.println("Not a floating point number. Enter an another input!");
        }

    }
}
