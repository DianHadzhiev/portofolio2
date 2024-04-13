package com.portofolio2;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    static Gebruiker gebruiker = new Gebruiker();
    static Kapitaalvorm kapitaal;
    static DataSeeder seeder = new DataSeeder();
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void printMenu () {
        System.out.println("InvestPro");
        System.out.println();
        System.out.println("1. Bekijk portofolio");
        System.out.println("");
        System.out.println("2. Voeg aandeel toe");
        System.out.println("3. Verwijder aandeel");
        System.out.println("");
        System.out.println("4. Voeg crypto toe");
        System.out.println("5. Verwijder crypto");
        System.out.println("");
        System.out.println("6. Voeg obligatie toe");
        System.out.println("7. Verwijder obligatie");
        System.out.println("");
        System.out.println("8. Voeg spaargeld toe");
        System.out.println("9. bewerk spaargeld");
        System.out.println("");
        System.out.println("10. bereken dividend belastingbedrag");
        System.out.println("11. bereken rente uit spaargeld");
        System.out.println("");
        System.out.println("12. Voeg eigen kapitaalvorm toe");
        System.out.println("13. verwijder eigen kapitaalvorm");
        System.out.println("");
        System.out.println("15. sluit af");
        
    }



    public void menuStart() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            
            printMenu();
            System.out.print("Voer uw keuze in: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewPortfolio(scanner);
                    break;
                case 2:
                clearScreen();
                    addAandeel(scanner);
                    break;
                case 3:
                clearScreen();
                    verwijderAandeel(scanner);
                    
                    break;
                case 4:
                clearScreen();
                    addCrypto(scanner);
                    
                    break;

                case 5:
                clearScreen();
                    verwijderCrypto(scanner);
                
                    break;
                
                case 6:
                clearScreen();
                    addObligatie(scanner);

                    break;

                case 7:
                clearScreen();
                    verwijderobligatie(scanner);

                    break;
                case 8:
                clearScreen();
                addspaargeld(scanner);

                    break;

                case 9:
                clearScreen();
                setSpaargeld(scanner);
                    
                    break;

                case 10:
                clearScreen();

                    break;

                case 11:

                    break;
                
                case 12:
                    addkapitaalvorm(scanner);
                    
                case 13:
                    clearScreen();
                    verwijderKapitaal(scanner);
                    break;
                
                
          
        
                case 14:
                clearScreen();
                System.out.println("Het programma wordt afgesloten");
                running = false;
                
                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
            }
        }

        scanner.close();
    }
    private static void terugNaarHoofdmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druk op Enter om terug te gaan naar het hoofdmenu.");
        scanner.nextLine();
        
    }

    private static void viewPortfolio(Scanner scanner) {
        clearScreen();
        System.out.println("totaal portofeuille: " + gebruiker.getTotaleWaarde());
        System.out.println();
        terugNaarHoofdmenu();
        
    }
    
    


    private static void addAandeel(Scanner scanner) {
        
        

        System.out.println("Welke aandeel wilt u toevoegen?");

        
        String naam = scanner.nextLine();

        System.out.println("Hoeveel aandelen wilt u toevoegen?");
        int aantal = scanner.nextInt();

        System.out.println("wat was de waarde?");;
        double prijs = scanner.nextDouble();
        Aandeel aandeel = new Aandeel(naam, prijs,aantal);
        
        gebruiker.addAandeel(aandeel);
        
    }
    
    private static void addCrypto(Scanner scanner) {
        
        

        System.out.println("Welke crypto wilt u toevoegen?");

        
        String naam = scanner.nextLine();

        System.out.println("Hoeveel wilt u toevoegen?");
        int aantal = scanner.nextInt();

        System.out.println("wat was de waarde?");
        double waarde = scanner.nextDouble();
        Crypto crypto = new Crypto(naam,waarde,aantal);
        
        gebruiker.addCrypto(crypto); // hier dubbel in gedaan misschine later weg
        
    }
    private static void addObligatie(Scanner scanner) {
        
        

        System.out.println("Welke obligatie wilt u toevoegen?");

        
        String naam = scanner.nextLine();

        System.out.println("Hoeveel obligaties wilt u toevoegen?");
        int aantal = scanner.nextInt();

        System.out.println("wat was de waarde?");
        double prijs = scanner.nextDouble();
        Obligatie obligatie = new Obligatie(naam, prijs, aantal);
        
        gebruiker.addObligatie(obligatie);
        terugNaarHoofdmenu();
        
    }
    private static void addkapitaalvorm(Scanner scanner) {
        
        

        System.out.println("Welke kapitaalvorm wilt u toevoegen?");

        
        String naam = scanner.nextLine();

        System.out.println("Hoeveel stuks wilt u toevoegen?");
        int aantal = scanner.nextInt();

        System.out.println("wat was de waarde?");
        double prijs = scanner.nextDouble();
        Kapitaalvorm kapitaal = new Kapitaalvorm(naam, prijs,aantal);
        
        gebruiker.addkapitaalvorm(kapitaal);

        terugNaarHoofdmenu();
        
    }





    private static void verwijderAandeel(Scanner scanner) {
        
        System.out.println("Welke aandeel wilt u verwijderen?");
        ArrayList <Aandeel> aandelen = gebruiker.getAandelen();
        int i = 1;
        for (Aandeel aandeel : aandelen) {
            System.out.println(i + " " + aandeel.getNaam());
            i++;
        }

        System.out.println("Voer u keuze in: ");
        int keuze = scanner.nextInt();
        gebruiker.DelAandeel(keuze);  
}


    private static void verwijderCrypto(Scanner scanner) {
        System.out.println("Welke crypto wilt u verwijderen?");
        ArrayList <Aandeel> aandelen = gebruiker.getAandelen();
        int i = 1;
        for (Aandeel aandeel : aandelen) {
            System.out.println(i + " " + aandeel.getNaam());
            i++;
        }

        System.out.println("Voer u keuze in: ");
        int keuze = scanner.nextInt();
        gebruiker.Delcrypto(keuze); 

    }

    private static void verwijderobligatie (Scanner scanner) {
        System.out.println("Welke obligatie wilt u verwijderen?");
        ArrayList <Obligatie> obligaties = gebruiker.getObligaties();
        int i = 1;
        for (Obligatie obli : obligaties) {
            System.out.println(i + " " + obli.getNaam());
            i++;
        }

        System.out.println("Voer u keuze in: ");
        int keuze = scanner.nextInt();
        gebruiker.Delobligatie(keuze); 

    }
    private static void verwijderKapitaal (Scanner scanner) {
        System.out.println("Welke Kapitaalvorm wilt u verwijderen?");
        ArrayList<Kapitaalvorm> kapitaal = new ArrayList<>();
        int i = 1;
        for (Kapitaalvorm kapitaalvorm : kapitaal) {
            System.out.println(i + " " + kapitaalvorm.getNaam());
            i++;
        }

        System.out.println("Voer u keuze in: ");
        int keuze = scanner.nextInt();
        gebruiker.Delkapitaal(keuze); 

    }


    private static void addspaargeld(Scanner scanner) {
        
        System.out.println("Hoeveel Euro  wilt u toevoegen?");
        double aantal = scanner.nextDouble();
        System.out.println("Succesvol toegevoegd");
        
        gebruiker.addSpaarGeld(aantal);
    }

    private static void setSpaargeld (Scanner scanner) {
    System.out.println("Voer uw nieuw spaargeld bedrag: (0.00)");
    double bedrag = scanner.nextDouble();
    Spaargeld spaargeld = new Spaargeld(bedrag);

    gebruiker.setSpaarGeld(spaargeld);
    System.out.println("Succecvol bewerkt");
        
    }



    
    




    
}
