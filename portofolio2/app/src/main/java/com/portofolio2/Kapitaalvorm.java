package com.portofolio2;

public class Kapitaalvorm {
    protected String naam;
    protected Double prijs;
    protected int aantal;

    public Kapitaalvorm () {

    }

    public Kapitaalvorm (String naam, Double prijs, int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;

    }
    
    public double getPrijs() { return prijs; }
    public void setPrijs(double prijs) { this.prijs = prijs; }


    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public int getAantal() { return aantal; }
    public void setAantal(int aantal) { this.aantal = aantal; }

    public void toongegevens() {
        System.out.println("(Dit is een eigen kapitaalvorm)");
        System.out.println(naam +  ", $" + prijs + ", aantal: " + aantal);
    }

    
}
