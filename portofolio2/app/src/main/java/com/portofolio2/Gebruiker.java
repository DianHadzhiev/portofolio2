import java.util.ArrayList;

class Gebruiker {
    private ArrayList<Aandeel> aandelen;
    private ArrayList<Crypto> crypto;
    private ArrayList<Obligatie> obligaties;
    private ArrayList<Spaargeld> spaargeld;
    private String naam;

    // Constructor
    public Gebruiker(String naam) {
        this.naam = naam;
        this.aandelen = new ArrayList<>();
        this.crypto = new ArrayList<>();
        this.obligaties = new ArrayList<>();
        this.spaargeld = new ArrayList<>();
    }

    // Methods
    public void AddAandeel(Aandeel aandeel) {
        aandelen.add(aandeel);
    }

    public void DelAandeel() {
        // Implement deletion logic here if needed
    }

    public double getTotaleWaarde() {
        double totaleWaarde = 0.0;
        // Calculate total value including aandelen, crypto, obligaties, spaargeld
        // Implement calculation logic here
        return totaleWaarde;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getSpaarGeld() {
        // Implement logic to calculate total spaargeld
        return 0.0; // placeholder value
    }

    public void setSpaarGeld(double spaargeld) {
        // Implement logic to set spaargeld
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
}
