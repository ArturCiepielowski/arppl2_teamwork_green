package com.sda.arppl2;

import java.util.Scanner;

public class MainOsoba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String nemeSC = scanner.next();

        System.out.println("Podaj wzrost: ");
        int heightSC = scanner.nextInt();

        Osoba firstPerson = new Osoba(nemeSC, heightSC);



    }



}
