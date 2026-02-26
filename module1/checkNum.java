import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number.");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number.");
        } else {
            System.out.println("The number is ZERO.");
        }
        sc.close();
    }
}