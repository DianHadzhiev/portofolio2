package com.portofolio2;

public class GuestGebruiker extends Gebruiker {
    public GuestGebruiker() {
        super();
    }

    public GuestGebruiker(String naam) {
        super(naam);
    }

    
    @Override
    public void voegAandeelToe(Aandeel aandeel) {
        System.out.println("Sorry, as a guest user, you cannot add stocks.");
    }

    @Override
    public void verwijderAandeel(Aandeel aandeel) {
        System.out.println("Sorry, as a guest user, you cannot remove stocks.");
    }
}