package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_I {
    public static void main(String[] args) throws IOException {


    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i = 1;i<=10;i++){
        int a =N*i;
        System.out.println(N+ " x " +i+" = "+a);
    }
}}
