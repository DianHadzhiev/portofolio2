package com.portofolio2;


public class Spaargeld {
    
    private double rentePerc =1.017;
    protected double aantal = 0.0;
    

    public Spaargeld (double aantal) {
        this.aantal = aantal;
        
    }

    public Spaargeld()  {
        
    }
    
    public double getRente() { return rentePerc; }

    public void setRente(double rente) { this.rentePerc = rente;}

    
    
    public double getAantal() { return aantal; }

    public void setAantal(double aantal) { this.aantal = aantal;}

    public void addAantal(double aantal) {
       this.aantal+=aantal;
    }


    
    
    
    public double berekenRente(int jaar, double aantal) {
        double rentebedrag = 0.0;
        
        if (aantal < 20000) {
            rentebedrag = (aantal * Math.pow(rentePerc,jaar)) - aantal;
        } else if (aantal <=100000) {
            rentePerc = 1.016;
            rentebedrag = (aantal * Math.pow(rentePerc,jaar))- aantal;
        } else if (aantal <=5000000) {
            rentePerc = 1.015;
            rentebedrag = (aantal * Math.pow(rentePerc,jaar)) - aantal;
        } 

        return rentebedrag;

    }
}
