package com.portofolio2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;






public class GebruikerTest {

        public Gebruiker gebruiker;
        
       
       
        @BeforeEach
        public void setUp() {
            gebruiker = new Gebruiker("eerste test");

        // Set spaargeld
        gebruiker.setSpaarGeld(10000);

        // Create some aandelen
        Aandeel aandeel1 = new Aandeel();
        Aandeel aandeel2 = new Aandeel();
        aandeel1.setNaam("AAPL");
        aandeel2.setNaam("GOOGL");
        aandeel1.setPrijs (100);
        aandeel2.setPrijs(100);

        // Voeg aandelen toe aan gebruiker
        gebruiker.voegAandeelToe (aandeel1);
        gebruiker.voegAandeelToe (aandeel2);
        }

        
        @Test
        public void testNaam () {

            assertEquals("eerste test", gebruiker.getNaam());
        }
        
        @Test
        public void testGetSpaarGeld() {
            assertEquals(10000, gebruiker.getSpaarGeld());
        }

        
    
    
    @Test
        public void testVoegEnVerwijderAandeel() {
            assertEquals(2, gebruiker.getAandelen().size());

            Aandeel aandeel3 = new Aandeel();
            aandeel3.setNaam("MSFT");
            aandeel3.setPrijs(400);
            
            gebruiker.voegAandeelToe(aandeel3);
            assertEquals(3, gebruiker.getAandelen().size());

            gebruiker.verwijderAandeel(aandeel3);
            assertEquals(2, gebruiker.getAandelen().size());
        }
    }
