package com.sda.arppl2;

public class Piesek {

    private String imie;
    private int wiek;
    private String kolor;

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getKolor() {
        return kolor;
    }


    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }


    public Piesek(String imie, int wiek, String kolor) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolor = kolor;
    }


}



