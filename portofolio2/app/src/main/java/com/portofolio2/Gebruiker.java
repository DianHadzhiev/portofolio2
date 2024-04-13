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

   
    public Gebruiker() {
    }

    
    

    public void DelAandeel(int index) {
    
    seeder.verwijderAandeel(index);
    }
    public void Delcrypto(int index) {
    
    seeder.verwijderCrypto(index);
    }
    
    public void Delobligatie(int index) {

    seeder.verwijderObligaties(index);
    }

    public void Delkapitaal(int index) {
    
    seeder.verwijderKapitaalvorm(index);
    }




    public double getTotaleWaarde() {
       double totalewaarde = getWaardeAandelen() + getWaardeCrypto() + getWaardeObligatie() +getWaardekapitaalvormen();


      return totalewaarde;
       
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

    public void addSpaarGeld(double bedrag) {
        
        double newbedrag = spaargeld.getAantal() + bedrag;
        Spaargeld newsSpaargeld = new Spaargeld(newbedrag);
        seeder.writeSpaargeldToCSV(newsSpaargeld);
        
    }

    public void setSpaarGeld(Spaargeld spaargeld) {
        seeder.writeSpaargeldToCSV(spaargeld);
       
    }

    public ArrayList<Aandeel> getAandelen() {
        this.aandelen = seeder.readAandeelFromCSV();
        return aandelen;
    }

    public ArrayList<Obligatie> getObligaties() {
        this.obligaties = seeder.readObligatieFromCSV();
        return obligaties;
    }

    public ArrayList<Crypto> getCrypto() {
        this.crypto = seeder.readCryptoFromCSV();
        return crypto;
    }

    public ArrayList<Kapitaalvorm> getKapitaalvorms() { 
        this.kapitaal = seeder.readKapitaalFromCSV();
        return kapitaal; }

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



    public double getWaardeAandelen() {
        double totalewaarde = 0.0;
        for (Aandeel aandeel : getAandelen())  {
            int aantal = aandeel.getAantal();
            double waarde = aandeel.getwaarde();
            totalewaarde += aantal * waarde; 
        }
        return totalewaarde;
    }

    public double getWaardeCrypto() {
        double totalewaarde = 0.0;
        for (Crypto cryptos : getCrypto())  {
            int aantal = cryptos.getAantal();
            double waarde = cryptos.getwaarde();
            totalewaarde += aantal * waarde; 
        }
        return totalewaarde;
    }
    public double getWaardeObligatie() {
        double totalewaarde = 0.0;
        for (Obligatie obligatie : getObligaties()){
            int aantal = obligatie.getAantal();
            double waarde = obligatie.getwaarde();
            totalewaarde += aantal * waarde; 
        }
        return totalewaarde;
    }

    public double getWaardekapitaalvormen() {
        double totalewaarde = 0.0;
        for (Kapitaalvorm kapitaalvormen : getKapitaalvorms()){
            int aantal = kapitaalvormen.getAantal();
            double waarde = kapitaalvormen.getwaarde();
            totalewaarde += aantal * waarde; 
        }
        return totalewaarde;
    }

    





    
}
