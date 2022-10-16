package Hackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();
        String C = B.toString();
        if(A.equalsIgnoreCase(C)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
