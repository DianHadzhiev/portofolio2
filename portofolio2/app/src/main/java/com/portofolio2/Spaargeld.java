package com.portofolio2;


public class Spaargeld {
    
    private double rentePerc =1.017;
    protected double aantal;
    protected String naam;

    public Spaargeld (double aantal, String naam) {
        this.aantal = aantal;
        this.naam = naam;
    }
    
    public double getRente() { return rentePerc; }

    public void setRente(double rente) { this.rentePerc = rente;}

    
    
    public double getAantal() { return aantal; }

    public void setAantal(double aantal) { this.aantal = aantal;}

    
    
    public String getNaam() { return naam; }

    public void setNaam(String naam) { this.naam = naam; }


    
    
    
    public double berekenRente(int jaar) {
        double rentebedrag = 0.0;
        
        if (aantal < 20000) {
            rentebedrag = aantal * Math.pow(rentePerc,jaar);
        } else if (aantal <=100000) {
            rentePerc = 1.016;
            rentebedrag = aantal * Math.pow(rentePerc,jaar);
        } else if (aantal <=5000000) {
            rentePerc = 1.015;
            rentebedrag = aantal * Math.pow(rentePerc,jaar);
        } 

        return rentebedrag;

    }




}
