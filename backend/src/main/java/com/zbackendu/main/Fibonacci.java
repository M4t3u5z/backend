package com.zbackendu.main;

import java.util.Scanner;

public class Fibonacci {

    static int n1 = 1, n2 = 1, n3 = 0;
    static void printFibonacci(int count) {

        if (count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print( n3 + " ");
            printFibonacci(count - 1);//?
        }
    }
    public static void main(String[] args){
        System.out.println("podaj 2 liczby: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int count = 10;

        System.out.print(n1+ " " + n2 + " " );
        printFibonacci(count);

    }
}
