/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamlalas;

public class Szamlalas {

    public static void main(String[] args) {
        // SZÁMLÁLÁS
        System.out.println("\n\tAB 113c\nSzámlálás: ");
        int szamlalo = 0; // darabszám
        int parosSzamlalo = 0;// páros számok
        
        int tomb[] = new int[5]; // 5 új elem a tömbben
        for (int i = 0; i < 5; i++) {
            tomb[i] = (int) ((Math.random() * 99) + 1);
            szamlalo++; // hozzáadja a számlálóhoz
            if (tomb[i] % 2 == 0) {
                parosSzamlalo++; // összegyűjti a páros számokat
            }
        }
        // elemenként kiírja a tömb elemeit
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < 5; i++) {

            System.out.println(i + 1 + ". elem" + " ");
            System.out.println(String.format("%,2d", tomb[i]) + " \n");
        }
        System.out.println(szamlalo + " elemű tömb.\n");
        System.out.println(parosSzamlalo + " számú tömb páros.");
    }

}
