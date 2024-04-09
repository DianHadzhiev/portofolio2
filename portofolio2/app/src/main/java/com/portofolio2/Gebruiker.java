package com.portofolio2;

import java.util.ArrayList;


public class Gebruiker {
    private String naam;
    private double spaargeld;
    private ArrayList<Aandeel> aandelen = new ArrayList<>();

    public Gebruiker () {
        

    }
    public Gebruiker (String naam) {
        this.naam = naam;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    
    
    public double getSpaarGeld() {
        return spaargeld ;
    }
    public void setSpaarGeld(double spaargeld) {
        this.spaargeld = spaargeld;
    }

    
    
    
    
    public void voegAandeelToe (Aandeel aandeel) {
        aandelen.add(aandeel);
    }
    public void verwijderAandeel(Aandeel aandeel) {
        aandelen.remove(aandeel);
    }
    public ArrayList<Aandeel> getAandelen() {
        return aandelen;
    }

    public double getTotaleWaarde() {
        double totalValue = 0;
        for (Aandeel aandeel : aandelen) {
            totalValue += aandeel.getPrijs();
        }
        return totalValue;
    }
}





