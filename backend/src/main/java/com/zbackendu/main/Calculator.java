package com.zbackendu.main;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, power1, d = 0.0;

        System.out.print("Wybierz operację: " +
                "\n1.Dodawanie" +
                "\n2.Odejmowanie" +
                "\n3.Mnożenie" +
                "\n4.Dzielenie" +
                "\n5.Potęgowanie" +
                "\n#Wpisz numer operacji by zacząć operację  \n");
        double somethin = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;
        double power = 5;

        if (somethin == addition) {
            System.out.print("Wybierz pierwszą liczbę: \n");
            a = in.nextDouble();
            System.out.print("Wpisz drugą liczbę:  \n");
            b = in.nextDouble();
            System.out.println("Wpisz trzecią liczbę: \n");
            c = in.nextDouble();

            d = a + b + c;
            System.out.println(a + " + " + b + " + " + c +" = " + d);  }
        else if (somethin == subtraction)  {
            System.out.print("Wybierz pierwszą liczbę: \n");
            a = in.nextDouble();
            System.out.print("Wpisz drugą liczbę:  \n");
            b = in.nextDouble();
            System.out.println("Wpisz trzecią liczbę: \n");
            c = in.nextDouble();

            d = a - b - c;
            System.out.println(a + " - " + b + " - " + c +" = " + d);	}
        else if (somethin == multiplication)	{
            System.out.print("Wybierz pierwszą liczbę: \n");
            a = in.nextDouble();
            System.out.print("Wpisz drugą liczbę:  \n");
            b = in.nextDouble();
            System.out.println("Wpisz trzecią liczbę: \n");
            c = in.nextDouble();

            d = a * b * c;
            System.out.println(a + " * " + b + " * " + c +" = " + d);	}
        else if (somethin == division)   {
            System.out.print("Wybierz pierwszą liczbę: \n");
            a = in.nextDouble();
            System.out.print("Wpisz drugą liczbę:  \n");
            b = in.nextDouble();
            System.out.println("Wpisz trzecią liczbę: \n");
            c = in.nextDouble();
            d = a / b / c;
            System.out.println(a + " / " + b + " / " + c +" = " + d);	}
        else if (somethin == power)	{
            System.out.println("Wybrałeś opcję potengi, wpisz liczbę na której chcesz wykonać operację: ");
            power1 = in.nextDouble();
            System.out.println("Wprowadź potęgę: ");
            double second = in.nextDouble();
                System.out.println(Math.pow(power1, second)); }

        }
    }

