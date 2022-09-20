package Day3;

import java.util.Scanner;

public class Prime {

    int n;
    public int findingPrime(int n){
    int i,count, j;
    Scanner scanner = new Scanner(System.in);
    System.out.print("The prime numbers are : ");
    //n = scanner.nextInt();
                for (j = 2; j <= n; j++) {
                    count = 0;
                    for (i = 1; i <= j; i++) {
                        if (j % i == 0) {
                            count++;
                        }
                    }
                    if (count == 2){
                        System.out.print(j + " ");
                }
    }
        return j;
    }
}
