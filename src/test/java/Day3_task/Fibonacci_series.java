package Day3_task;

public class Fibonacci_series {
    public static void main(String[] args) {

        int n, n1, n2;
        n = 0;
        n1 = 1;
        System.out.print(n + " " + n1);
        for (int i = 2; i < 50; ++i) {
            n2 = n + n1;
            System.out.print(" " + n2);
            n = n1;
            n1 = n2;
        }

    }
}