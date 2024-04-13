package com.portofolio2;

public class Crypto extends Kapitaalvorm {
   
    public Crypto (String naam, double waarde, int aantal) {
        super();
        this.naam = naam;
        this.waarde = waarde;
        this.aantal = aantal;
    }
    @Override
    public void toongegevens() {
        System.out.println(naam +  ", $" + waarde + ", aantal: " + aantal);
    }
    
    public double getwaarde() { return waarde; }
    public void setwaarde(double waarde) { this.waarde = waarde; }


    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public int getAantal() { return aantal; }
    public void setAantal(int aantal) { this.aantal = aantal; }
}
