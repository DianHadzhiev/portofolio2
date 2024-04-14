package com.portofolio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.io.*;

public class DataSeederTest {
    private DataSeeder dataSeeder;
    private Menu menu;
    private Gebruiker gebruiker;


    @BeforeEach
    public void setUp() {
        dataSeeder = new DataSeeder();
        menu = new Menu();
        gebruiker = new Gebruiker();

    }





    @Test
    public void WriteAndReadCrypto() {
        Crypto crypto = new Crypto("Bitcoin", 63000.0, 1);
        dataSeeder.writeCryptoToCSV(crypto);
        ArrayList<Crypto> cryptoList = dataSeeder.readCryptoFromCSV();

        Crypto cryptomunt= cryptoList.get(0);

        assertEquals("Bitcoin", cryptomunt.getNaam());
        assertEquals(63000.0, cryptomunt.getwaarde(), 0.001);
        assertEquals(1, cryptomunt.getAantal());
    }


    @Test
    public void testWriteAndReadAandeel() {
        Aandeel aandeel = new Aandeel("Apple", 150.0, 10);
        dataSeeder.writeAandeelToCSV(aandeel);
        ArrayList<Aandeel> aandeelList = dataSeeder.readAandeelFromCSV();
        assertEquals(1, aandeelList.size());
        Aandeel readAandeel = aandeelList.get(0);
        assertEquals("Apple", readAandeel.getNaam());
        assertEquals(150.0, readAandeel.getwaarde(), 0.001);
        assertEquals(10, readAandeel.getAantal());
    }

    public void testWriteAndReadObligatie() {
        Obligatie obligatie = new Obligatie("Aegon", 9.64, 200);
        Obligatie obligatie2 = new Obligatie("Aegon", 9.66, 100);
        dataSeeder.writeObligatieToCSV(obligatie);
        dataSeeder.writeObligatieToCSV(obligatie2);
        ArrayList <Obligatie> obligaties = dataSeeder.readObligatieFromCSV();

        Obligatie obliGatie = obligaties.get(1);
        assertEquals(9.66,obliGatie.getwaarde(), 0.001);

    }

    @Test
    public void testdividendbelasting() {
        
        double verwacht1 = 17;
        double dividend1 = 1000;
        double werkelijk = menu.berekendividend(dividend1);

        assertEquals(verwacht1, werkelijk, 0.001);
    }


    @Test
    public void testRente() {
        Spaargeld spaargeld = new Spaargeld(1337.00);
        gebruiker.setSpaarGeld(spaargeld);
        int jaarsparen  = 6;


        gebruiker.berekenrente(jaarsparen);
        
        
    }
    
}
