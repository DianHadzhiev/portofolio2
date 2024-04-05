package com.portofolio2;
import java.util.Scanner;
import com.opencsv.CSVWriter;

public class Menu {
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
                    optie1();
                    break;
                case 2:
                    optie2();
                    break;
                case 3:
                    optie3();
                    break;
                case 4:
                    optie4();
                    break;

                case 5:
                    running = false;
                    System.out.println("Programma wordt afgesloten.");
                    break;
                case 9:
                    optie9();
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

    
}
