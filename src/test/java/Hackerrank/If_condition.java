package Hackerrank;

import java.util.Scanner;

public class If_condition {
    public static void main(String[] args) {
        Scanner scanner = null;
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (N % 2 != 0) {
            System. out. print("Weird");
        }
        else if((N % 2 == 0) && (!(N < 5))){
            System.out.println("Not Weird");

        }
        else if((N % 2 == 0) && (!(N > 6))&&(!(N <= 20))){
            System.out.println("Weird");

        }
        else {
            System.out.println("Not weird");
        }
    }
}
