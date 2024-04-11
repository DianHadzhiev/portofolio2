package com.portofolio2;

public class Obligatie extends Kapitaalvorm{
    public Obligatie (String naam, double prijs, int aantal) {
        super();
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;
    }

    @Override
    public void toongegevens() {
        System.out.println(naam +  ", $" + prijs + ", aantal: " + aantal);
       

    }
    
}
