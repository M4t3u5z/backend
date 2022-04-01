package com.zbackendu.main;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args){

        System.out.println( "wprowadź liczbę: " );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for( int i = 1 ; i < n + 1 ; i++ ) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println( i + ": Fizz Buzz");
            } else if ( i % 5 == 0 ) {
                System.out.println( i + ": Buzz");
            } else if ( i % 3 == 0 ) {
                System.out.println( i + ": Fizz");
            } else {
                System.out.println ( i );
            }
        }


    }
}
