package com.portofolio2;

public class Kapitaalvorm {
    protected String naam;
    protected Double waarde;
    protected int aantal;

    public Kapitaalvorm () {

    }

    public Kapitaalvorm (String naam, Double waarde, int aantal) {
        this.naam = naam;
        this.waarde = waarde;
        this.aantal = aantal;

    }
    
    public double getwaarde() { return waarde; }
    public void setwaarde(double waarde) { this.waarde = waarde; }


    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public int getAantal() { return aantal; }
    public void setAantal(int aantal) { this.aantal = aantal; }

    public void toongegevens() {
        System.out.println("(Dit is een eigen kapitaalvorm)");
        System.out.println(naam +  ", $" + waarde + ", aantal: " + aantal);
        System.out.println("");
    }

    
}
