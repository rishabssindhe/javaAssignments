import java.util.Scanner;

public class Factorial {

    int fact(int n) {
        if(n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        Factorial f=new Factorial();
        int res=f.fact(n);
        System.out.println("Factorial of "+n+" is: "+res);

        sc.close();
    }
}
