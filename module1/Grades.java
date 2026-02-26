import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int m = sc.nextInt();
            switch (m) {
                case 100:
                case 90:
                    System.out.println("Grade: A");
                    break;
                case 80:
                    System.out.println("Grade: B");
                    break;
                case 70:
                    System.out.println("Grade: C");
                    break;
                case 60:
                    System.out.println("Grade: D");
                    break;
                default:
                    System.out.println("Grade: F");
                    break;
            }
        }
        sc.close();
    }
}
