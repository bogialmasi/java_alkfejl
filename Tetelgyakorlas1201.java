/*
BUBORÉKOS MÓDSZER
 */
package tetelgyakorlas1201;

import java.util.Scanner;

/**
 *
 * @author Bogi
 */
public class Tetelgyakorlas1201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("\nSORBARENDEZÉS TÉTELE\nBuborékos módszer AB_113C\n\n");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni?: ");
        Scanner bemenet = new Scanner(System.in);
        int elemszam = bemenet.nextInt();
        int szamok[] = new int [elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            szamok[i] = (int) (Math.random()*100)-50;
        }
        System.out.print("\nTömb elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(elemszam + "  ");
        }
        
        // BUBORÉKOS RENDEZÉS
        for (int i = 0; i < elemszam-1; i++) {
            for (int j = 0; j < elemszam-i-1; j++) {
                if (szamok[j] > szamok [j+1]) {
                    int temp = szamok[j];
                    szamok[j] = szamok[j+1];
                    szamok[j+1] = temp;
                }
            }
        }
        
        System.out.print("\nRendezett tömb:");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(szamok[i] + "  ");
        }
    }
    
}
