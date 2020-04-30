import java.util.Scanner;

public class SwapNumbers {

    public void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the variables are");
        System.out.println("a =" + " " + a);
        System.out.println("b =" + " " + b);

    }

    public void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without using a temporary variable, the variables are");
        System.out.println("a =" + " " + a);
        System.out.println("b =" + " " + b);


    }

    public static void main(String[] args) {

        SwapNumbers s = new SwapNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Swapping using temporary variable");
        s.swapWithTemp(a, b);
        System.out.println("Swapping without temporary variable");
        s.swapWithoutTemp(a, b);

    }


}


