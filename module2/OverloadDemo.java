import java.util.Scanner;

public class OverloadDemo {

    static int add(int a,int b) {
        return a+b;
    }

    static double add(double a,double b) {
        return a+b;
    }

    static int add(int a,int b,int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter two integers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Sum of integers: "+add(n1,n2));

        System.out.print("Enter two doubles: ");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        System.out.println("Sum of doubles: "+add(d1,d2));

        System.out.print("Enter three integers: ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        System.out.println("Sum of three: "+add(x1,x2,x3));

        sc.close();
    }

}
