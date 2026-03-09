package assignments.module6;

public class Kadane {
    public static void main(String[] args) {
        int[] x = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int m = x[0], c = x[0];
        for (int i = 1; i < x.length; i++) {
            c = Math.max(x[i], c + x[i]);
            m = Math.max(m, c);
        }
        System.out.println(m);
    }
}
