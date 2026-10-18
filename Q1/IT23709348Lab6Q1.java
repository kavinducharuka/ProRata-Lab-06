import java.util.Scanner;

public class IT23709348Lab6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        System.out.println("Square: " + (number * number));
        if (number < 0) {
            System.out.println("Square root: not a real number");
        } else {
            System.out.println("Square root: " + Math.sqrt(number));
        }
    }
}
