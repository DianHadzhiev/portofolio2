package com.portofolio2;
import java.util.ArrayList;

class Gebruiker {
    private ArrayList<Aandeel> aandelen;
    private ArrayList<Crypto> crypto;
    private ArrayList<Obligatie> obligaties;
    private ArrayList<Kapitaalvorm> kapitaal;
    private Spaargeld spaargeld;
    private String naam;

    
    public Gebruiker(String naam) {
        this.naam = naam;
        this.aandelen = new ArrayList<>();
        this.crypto = new ArrayList<>();
        this.obligaties = new ArrayList<>();
    }
    public Gebruiker() {
        this.aandelen = new ArrayList<>();
        this.crypto = new ArrayList<>();
        this.obligaties = new ArrayList<>();

    }

    
    

    public void DelAandeel(int index) {
    aandelen.remove(index-1);
    }

    public double getTotaleWaarde() {
        double totaleWaarde = 0.0;
      
        return totaleWaarde;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Spaargeld getSpaarGeld() {
        
        return spaargeld;
    }

    public void setSpaarGeld(Spaargeld spaargeld) {
        this.spaargeld = spaargeld;
       
    }

    public ArrayList<Aandeel> getAandelen() {
        return aandelen;
    }

    public ArrayList<Obligatie> getObligaties() {
        return obligaties;
    }

    public ArrayList<Crypto> getCrypto() {
        return crypto;
    }

    public void addObligatie(Obligatie obligatie) {
        obligaties.add(obligatie);
    }

    public void addCrypto(Crypto crypto) {
        this.crypto.add(crypto);
    }

    public void addAandeel(Aandeel aandeel) {
        aandelen.add(aandeel);
        
    }
}
