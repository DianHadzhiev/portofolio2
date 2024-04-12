package com.portofolio2;
import java.util.ArrayList;

class Gebruiker {
    private ArrayList<Aandeel> aandelen;
    private ArrayList<Crypto> crypto;
    private ArrayList<Obligatie> obligaties;
    private ArrayList<Kapitaalvorm> kapitaal;
    private Spaargeld spaargeld;
    private String naam;

    DataSeeder seeder = new DataSeeder();

    
    public Gebruiker(String naam) {
        this.naam = naam;
        this.aandelen = seeder.readAandeelFromCSV();
        this.crypto = seeder.readCryptoFromCSV();
        this.obligaties = seeder.readObligatieFromCSV();
        this.kapitaal = seeder.readKapitaalFromCSV();
    }

    public Gebruiker() {
        this.aandelen = seeder.readAandeelFromCSV();
        this.crypto = seeder.readCryptoFromCSV();
        this.obligaties = seeder.readObligatieFromCSV();
        this.kapitaal = seeder.readKapitaalFromCSV();
    }

    
    

    public void DelAandeel(int index, String naam) {
    
    seeder.verwijder(index, naam);
    }
    public void Delcrypto(int index,String naam) {
    
    seeder.verwijder(index, naam);
    }
    
    public void Delobligatie(int index, String naam) {

    seeder.verwijder(index, naam);
    }

    public void Delkapitaal(int index, String naam) {
    
    seeder.verwijder(index, naam);
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

    public ArrayList<Kapitaalvorm> getKapitaalvorms() { return kapitaal; }

    public void addObligatie(Obligatie obligatie) {
    
        seeder.writeObligatieToCSV(obligatie);
    }

    public void addCrypto(Crypto crypto) {

        seeder.writeCryptoToCSV(crypto);
    }

    public void addAandeel(Aandeel aandeel) {
        
        seeder.writeAandeelToCSV(aandeel);
        
    }

    public void addkapitaalvorm(Kapitaalvorm kapitaalvorm) {
    
        seeder.writeKapitaalToCSV(kapitaalvorm);
    }

    
}
