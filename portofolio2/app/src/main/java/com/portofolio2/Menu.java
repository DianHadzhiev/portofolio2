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
        System.out.println("7. Voeg spaargeld toe");
        System.out.println("8. bewerk spaargeld");
        System.out.println("");
        System.out.println("9. bereken dividend belastingbedrag");
        System.out.println("");
        System.out.println("10. sluit af");

    }



    public void menuStart() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            clearScreen();
            printMenu();
            System.out.print("Voer uw keuze in: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    addAandeel();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;

                case 5:
                
                    break;
                
                case 6:

                    break;

                case 7:

                    break;
                case 8:

                    break;

                case 9:
                    
                    break;
                case 10:
                running = false;
                System.out.println("Het programma wordt afgesloten");
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

    private static void viewPortfolio() {
    
    
}

    private static void addAandeel() {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Welke aandeel wilt u toevoegen?");

        
        String naam = scanner.nextLine();

        System.out.println("Hoeveel aandelen wilt u toevoegen?");
        int aantal = scanner.nextInt();

        System.out.println("Hoeveel heeft u betaalt? 0.00");
        double prijs = scanner.nextDouble();
        Aandeel aandeel = new Aandeel(naam, prijs,aantal);
        
        gebruiker.addAandeel(aandeel);
        DataSeeder.writeAandeelToCSV(aandeel);

    
    
}

    private static void removeStock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke aandeel wilt u verwijderen?");
        ArrayList <Aandeel> aandelen = gebruiker.getAandelen();

        for (int i = 0; i < aandelen.size(); i++) {	  
            System.out.println(i + " ." + aandelen.get(i)); 
        }
        System.out.println("");

        System.out.println("Voer u keuze in: ");
        int keuze = scanner.nextInt();
        gebruiker.DelAandeel(keuze);


        


    
    
}
    private static void calcBelasting() {
    
    
}



    
}
