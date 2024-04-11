package com.portofolio2;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class DataSeeder {

    
    
    public static void writeCryptoToCSV(Crypto crypto) {
        try {
            String filePath = "crypto.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(crypto.naam), String.valueOf(crypto.prijs), String.valueOf(crypto.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw crypto is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan");
        }
    }

    public static void readCryptoFromCSV(Gebruiker gebruiker) {
        String filePath = "crypto.csv";
        BufferedReader reader = null;
        String line ="";

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double prijs = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Crypto crypto = new Crypto(naam, prijs, aantal);
                    gebruiker.addCrypto(crypto);
                    
                }
            }
    
        
        

            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan" + e.getMessage());
        }
    }  
    public static void writeAandeelToCSV(Aandeel aandeel) {
        try {
            String filePath = "aandeel.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(aandeel.naam), String.valueOf(aandeel.prijs), String.valueOf(aandeel.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw Aandeel is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan");
        }
    }

    public static void readAandeelFromCSV(Gebruiker gebruiker) {
        String filePath = "aandeel.csv";
        BufferedReader reader = null;
        String line ="";

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double prijs = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Aandeel aandeel = new Aandeel(naam, prijs, aantal);
                    gebruiker.addAandeel(aandeel);
                    
                }
            }
    
        
        

            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan" + e.getMessage());
        }
    } 
    public static void writeObligatieToCSV(Obligatie obligatie) {
        try {
            String filePath = "obligatie.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(obligatie.naam), String.valueOf(obligatie.prijs), String.valueOf(obligatie.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw obligatie is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan");
        }
    }

    public static void readObligatieFromCSV(Gebruiker gebruiker) {
        String filePath = "obligatie.csv";
        BufferedReader reader = null;
        String line ="";

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double prijs = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Obligatie obligatie = new Obligatie(naam, prijs, aantal);
                    gebruiker.addObligatie(obligatie);
                    
                }
            }
    
        
        

            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan" + e.getMessage());
        }
    } 

    public static void writeSpaargeldToCSV(Spaargeld spaargeld) {
        try {
            String filePath = "obligatie.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(spaargeld.naam), String.valueOf(spaargeld.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw spaargeld is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan");
        }
    }
    
    public static void readSpaargeldFromCSV(Gebruiker gebruiker) {
        String filePath = "spaargeld.csv";
        BufferedReader reader = null;
        String line ="";

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String naam = data[0].replaceAll("\"", "");
                    
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Spaargeld spaargeld = new Spaargeld(aantal, naam);
                    gebruiker.setSpaarGeld(spaargeld);
                    
                }
            }
    
        
        

            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan" + e.getMessage());
        }
    }   
    public static void removeLineFromCSV(String filePath, int lineNumberToRemove) {
        ArrayList<String> lines = new ArrayList<String>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber != lineNumberToRemove) {
                    lines.add(line);
                }
                File file = new File(filePath);
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        for (String overigelijnen : lines) {
            wr

        

        
    }
     


   
}
