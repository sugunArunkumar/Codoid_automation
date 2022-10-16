package Hackerrank;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Loop_2 {
    public static void main(String[] args) {
//        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//        System.out.println(us);
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int calc = a;
//            for(int j=0;j<n;j++)
//            {
//                calc+=(Math.pow(2,j)*b);
//                System.out.print(calc+" ");
//            }
//            System.out.println();
//        }
//        in.close();
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();
        String C = B.toString();
        System.out.println(C);
        if(A.equalsIgnoreCase(C)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
