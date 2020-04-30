import java.util.*;
import java.util.*;

public class InputFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the String as a String and number");
        String str = sc.next();
        int number = sc.nextInt();
        String no = null;
        if (number < 100 && number >= 10) {
            no = String.valueOf(number);
            no = "0" + no;


        } else if (number < 10 && number > 0) {
            no = String.valueOf(number);
            no = "00" + no;

        } else if (number >= 100 || number <= 0) {
            no = String.valueOf(number);
        }
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println(str + " " + " " + " " + " " + " " + " " + no);
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");


    }
}
