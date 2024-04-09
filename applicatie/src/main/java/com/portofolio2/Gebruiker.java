package com.portofolio2;

import java.util.ArrayList;


public class Gebruiker {
    private String naam;
    private double spaargeld;
    private ArrayList<Aandeel> aandelen ;

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

    //public double getTotalewaarde() {
        //hier wordt portofolio waarde berekent
      //  return
   // }

}



