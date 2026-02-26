public class SumEven {
    public static void main(String[] args) {
        int s = 0;
        int i = 2;
        while (i <= 100) {
            s += i;
            i += 2;
        }
        System.out.println("Sum of even numbers"+s);
    }
}