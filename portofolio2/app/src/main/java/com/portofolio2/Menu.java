package com.portofolio2;
import java.util.Scanner;
import com.opencsv.CSVWriter;

public class Menu {
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void printMenu () {
        System.out.println("InvestPro");
        System.out.println();
        System.out.println("1. Bekijk portofolio");
        System.out.println("2. Voeg aandeel toe");
        System.out.println("3. Verwijder aandeel");
        System.out.println("4. Voeg spaargeld toe");
        System.out.println("5. Bereken belasting");
        System.out.println();

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
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;

                case 5:
                    running = false;
                    System.out.println("Programma wordt afgesloten.");
                    break;
                case 9:
                    
                    break;
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

    private static void addStock() {
    
    
}

    private static void removeStock() {
    
    
}
    private static void calcBelasting() {
    
    
}



    
}
