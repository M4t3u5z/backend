package Builder.com;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Input_1 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("\t#### Witam w kreatorze CV, wpisz dane o które poprosi program #### ");

        System.out.println("Imię: ");
        String name = input.nextLine();

        System.out.println("Nazwisko: ");
        String surName = input.nextLine();

        System.out.println("Wiek: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();





        CvMakerData input1 = new CvMakerData.Builder()
                .name(name)
                .surName(surName)
                .age(age)
                .email(email)
                .build();
        System.out.println(input1);
    }
}
