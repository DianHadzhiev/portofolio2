package com.portofolio2;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class DataSeeder {

    
    
    public void writeCryptoToCSV(Crypto crypto) {
        try {
            String filePath = "crypto.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(crypto.naam), String.valueOf(crypto.waarde), String.valueOf(crypto.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw crypto is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan ");
        }
    }



    public ArrayList <Crypto> readCryptoFromCSV() {
        String filePath = "crypto.csv";
        BufferedReader reader = null;
        String line ="";
        ArrayList<Crypto> list = new ArrayList<Crypto>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double prijs = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Crypto crypto = new Crypto(naam, prijs, aantal);

                    list.add(crypto);   
                }
            }
            reader.close();
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan " + e.getMessage());
        }

        return list;
    }
    
    

    public void writeAandeelToCSV(Aandeel aandeel) {
        try {
            String filePath = "aandeel.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(aandeel.naam), String.valueOf(aandeel.waarde), String.valueOf(aandeel.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw Aandeel is opgelslagen ");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan ");
        }
    }
    
    public void writeObligatieToCSV(Obligatie obligatie) {
        try {
            String filePath = "obligatie.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(obligatie.naam), String.valueOf(obligatie.waarde), String.valueOf(obligatie.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw obligatie is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan ");
        }
    }

    



    public ArrayList<Aandeel> readAandeelFromCSV() {
        String filePath = "aandeel.csv";
        BufferedReader reader = null;
        String line ="";
        ArrayList<Aandeel> lines = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double waarde = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Aandeel aandeel = new Aandeel(naam, waarde, aantal);
                    lines.add(aandeel);
                    
                }
                

            }
            reader.close();
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan " + e.getMessage());
        }
        return lines;
    } 





    public ArrayList<Obligatie> readObligatieFromCSV() {
        String filePath = "obligatie.csv";
        BufferedReader reader = null;
        String line ="";
        ArrayList<Obligatie> lines = new ArrayList<Obligatie>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double waarde = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Obligatie obligatie = new Obligatie(naam, waarde, aantal);
                    lines.add(obligatie);
                   
                    
                }
            }
            reader.close();
            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan " + e.getMessage());
        }
        return lines;

    } 





    public void writeSpaargeldToCSV(Spaargeld spaargeld) {
        try {
            String filePath = "spaargeld.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,false)));
            String [] data ={ String.valueOf(spaargeld.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw spaargeld is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan ");
        }
    }
    
    public Spaargeld readSpaargeldFromCSV() {
        String filePath = "spaargeld.csv";
        BufferedReader reader = null;
        String line ="";
        Spaargeld spaargeld = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 1) {
                    double aantal = Double.parseDouble(data[0].replaceAll("\"", ""));
                    
                    spaargeld = new Spaargeld(aantal);                  
                }
            } 
            reader.close();
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan " + e.getMessage());
        }
        return spaargeld;
    }





    
    public ArrayList<Kapitaalvorm> readKapitaalFromCSV() {
        String filePath = "kapitaalvorm.csv";
        BufferedReader reader = null;
        String line ="";
        ArrayList<Kapitaalvorm> lines = new ArrayList<Kapitaalvorm>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String naam = data[0].replaceAll("\"", "");
                    double waarde = Double.parseDouble(data[1].replaceAll("\"", ""));
                    int aantal = Integer.parseInt(data[2].replaceAll("\"", ""));

                    Kapitaalvorm kapitaalvorm = new Kapitaalvorm(naam, waarde, aantal);
                    lines.add(kapitaalvorm);
                   
                    
                }
            }
            reader.close();
             
            
        } catch (IOException e) {
        System.out.println("Er is iets misgegaan " + e.getMessage());
        }
        return lines;
    }


    public void writeKapitaalToCSV(Kapitaalvorm kapitaal) {
        try {
            String filePath = "kapitaalvorm.csv";
            CSVWriter csvWriter = new CSVWriter((new FileWriter(filePath,true)));
            String [] data ={ String.valueOf(kapitaal.naam), String.valueOf(kapitaal.waarde), String.valueOf(kapitaal.aantal)};
        
            csvWriter.writeNext(data);
            System.out.println();
            System.out.println("Uw kapitaal is opgelslagen");
            csvWriter.close();
            

        } catch (IOException e) {
            System.out.println("Er is iets missgegaan ");
        }
    }
 








    
    
    public void verwijderAandeel(int Index) { 
        String temp = "temp.csv";
        String filepath = "aandeel.csv";
        File oldfile = new File(filepath);
        File newfile = new File(temp);
    
        int line = 0;
        String currentLine;
    
        try (FileWriter fw = new FileWriter(temp);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw);
             FileReader fr = new FileReader(filepath);
             BufferedReader br = new BufferedReader(fr)) {
    
            while ((currentLine = br.readLine()) != null) {
                line++;
    
                if (Index != line) {
                    pw.println(currentLine);
                }
            }
    
           try {pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close(); 
            } catch (IOException e) {
                e.printStackTrace();
            }
           
            
    
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                
                // Delete the old file and rename the new file
                if (!oldfile.delete()) {
                    System.out.println("Failed to delete the old file.");
                    return;
                }
                File dump = new File(filepath);
                if (!newfile.renameTo(dump)) {
                    System.out.println("Failed to rename the new file.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    


    public void verwijderCrypto(int Index) {
        
        String temp = "temp.csv";
        String filepath = "crypto.csv";
        File oldfile = new File(filepath);
        File newfile = new File(temp);
    
        int line = 0;
        String currentLine;
    
        try {
            FileWriter fw = new FileWriter(temp);
    
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
    
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
    
            while ((currentLine = br.readLine()) != null) {
                line++;
    
                if (Index != line) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            
    
            if (!oldfile.delete()) {
                System.out.println("Failed to delete the old file.");
                return;
            }
            File dump = new File(filepath);
            if (!newfile.renameTo(dump)) {
                System.out.println("Failed to rename the new file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void verwijderObligaties(int Index) {
        
        String temp = "temp.csv";
        String filepath =  "obligatie.csv";
        File oldfile = new File(filepath);
        File newfile = new File(temp);
    
        int line = 0;
        String currentLine;
    
        try {
            FileWriter fw = new FileWriter(temp);
    
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
    
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
    
            while ((currentLine = br.readLine()) != null) {
                line++;
    
                if (Index != line) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            
    
            if (!oldfile.delete()) {
                System.out.println("Failed to delete the old file.");
                return;
            }
            File dump = new File(filepath);
            if (!newfile.renameTo(dump)) {
                System.out.println("Failed to rename the new file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void verwijderKapitaalvorm(int Index) {
        
        String temp = "temp.csv";
        String filepath = "kapitaalvorm.csv";
        File oldfile = new File(filepath);
        File newfile = new File(temp);
    
        int line = 0;
        String currentLine;
    
        try {
            FileWriter fw = new FileWriter(temp);
    
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
    
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
    
            while ((currentLine = br.readLine()) != null) {
                line++;
    
                if (Index != line) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            
    
            if (!oldfile.delete()) {
                System.out.println("Failed to delete the old file.");
                return;
            }
            File dump = new File(filepath);
            if (!newfile.renameTo(dump)) {
                System.out.println("Failed to rename the new file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    
}