package kivalogatas;

import java.util.Scanner;

public class Kivalogatas {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n KIVÁLOGATÁS TÉTELE\n");
        
        
        System.out.print("Hány db jegy?: ");
            int db = sc.nextInt();
            sc.close();     // többször már nem kell a scanner
            
        int jegyek[]= new int [db];        // hány db jegy lesz

        for (int i = 0; i < db; i++) {      // kisorsolja a jegyeket
            jegyek[i]=(int)(Math.random()*5)+1;
        }
        System.out.print("\nA jegyek: ");     // kiírja a jegyeket
        for (int i = 0; i < db; i++) {
            System.out.print(jegyek[i]+" ");
        }
        
        int egyesDb = 0;        // JEGYEK SZÁMA
        int kettesDb = 0;
        int harmasDb = 0;
        int negyesDb = 0;
        int otosDb = 0;
        
        int egyesek[] = new int [db];      // JEGYEK TÖMBJEI
        int kettesek[] = new int [db];
        int harmasok[] = new int [db];
        int negyesek[] = new int [db];
        int otosok[] = new int [db];
        
        for (int i = 0; i < db; i++) {      
            if (jegyek[i] == 1) {
                egyesek[egyesDb++] = jegyek[i];
            }
            if (jegyek[i] == 2) {
                kettesek[kettesDb++] = jegyek[i];
            }
            if (jegyek[i] == 3) {
                harmasok[harmasDb++] = jegyek[i];
            }
            if (jegyek[i] == 4) {
                negyesek[negyesDb++] = jegyek[i];
            }
            if (jegyek[i] == 5) {
                otosok[otosDb++] = jegyek[i];
            }
        }
        System.out.println("\n\nEgyesek tömb elemei:");
        for (int i = 0; i < egyesDb; i++) {
            System.out.print(egyesek[i] + " ");
        }
        
        System.out.println("\nEgyesek száma: " + egyesDb);
        
        System.out.println("\nKettesek tömb elemei:");
        for (int i = 0; i < kettesDb; i++) {
            System.out.print(kettesek[i] + " ");
        }
        
        System.out.println("\nKettesek száma: " + kettesDb);

        System.out.println("\nHármasok tömb elemei:");
        for (int i = 0; i < harmasDb; i++) {
            System.out.print(harmasok[i] + " ");
        }
        
        System.out.println("\nHármasok száma: " + harmasDb);
        
        System.out.println("\nNégyesek tömb elemei:");
        for (int i = 0; i < negyesDb; i++) {
            System.out.print(negyesek[i] + " ");
        }
        
        System.out.println("\nNégyesek száma: " + negyesDb);
        
        System.out.println("\nÖtösök tömb elemei:");
        for (int i = 0; i < otosDb; i++) {
            System.out.print(otosok[i] + " ");
        }
        
        System.out.println("\nÖtösök száma: " + otosDb);
    }
    
}