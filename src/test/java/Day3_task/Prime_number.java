package Day3_task;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int i, n, count, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        n = scanner.nextInt();
        for (j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + " ");
        }

    }
}


