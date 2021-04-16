package nfl0416;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Nfl0416 {

    public static ArrayList<NFL> Jatekos = new ArrayList<>();

    public static void beolvasas() {
        try {
            RandomAccessFile fajl = new RandomAccessFile("NFL_iranyitok.txt", "r");

            while (fajl.getFilePointer() < fajl.length()) {
                Jatekos.add(new NFL(fajl.readLine()));
            }
            fajl.close();
            System.out.println("\nBeolvasva " + Jatekos.size());
        } catch (IOException e) {
            System.out.println("Hiba történt!");
        }
    }

    public static void main(String[] args) {
        beolvasas();
    }

}

class NFL {

    public String nev;
    public int yard;
    public int kiserlet;
    public int sikeres;
    public int passz;
    public int eladott;
    public double iranyitomutato;
    public String egyetem;

    public NFL(String sor) {
        String[] adatok = sor.split(";");
        System.out.println(sor);
        this.nev = adatok[0];
        this.yard = Integer.parseInt(adatok[1]);
        this.kiserlet = Integer.parseInt(adatok[2]);
        this.sikeres = Integer.parseInt(adatok[3]);
        this.passz = Integer.parseInt(adatok[4]);
        this.eladott = Integer.parseInt(adatok[5]);
        String replaceString = adatok[6].replace(",",".");
        this.iranyitomutato = Double.parseDouble(replaceString);
        this.egyetem = adatok[7];
    }
}
