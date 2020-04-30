import java.util.*;
import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int number = sc.nextInt();
        if(number % 15 == 0)
        {
            System.out.println("The number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("The number is not divisible by 3 and 5");
        }
    }
}
