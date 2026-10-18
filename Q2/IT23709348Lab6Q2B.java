import java.util.Scanner;

public class IT23709348Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            System.out.println(number);
            i++;
        }
    }
}
