package com.portofolio2;

public class Crypto extends Kapitaalvorm {
   
    public Crypto (String naam, double prijs, int aantal) {
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
