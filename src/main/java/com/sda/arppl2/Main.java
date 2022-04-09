package com.sda.arppl2;

public class Main {
    public static void main(String[] args) {

        Kotek kotek1 = new Kotek("Zawisza", "Czarny");
        Kotek kotek2 = new Kotek("Rydz", "Rudy");

        System.out.println("Zadanie 1 wykonane!");


        Osoba firstPerson = new Osoba("Agnieszka", 165);
        Osoba secondPerson = new Osoba("Gniewko", 186);
        Osoba thirdPerson = new Osoba("Patrycjusz", 205);


        Komputer komputer1 = new Komputer("Asus", "LG", "razer", "steelseries");
        Komputer komputer2 = new Komputer("Gigabyte", "sony", "microsoft", "razer");
    }
}
