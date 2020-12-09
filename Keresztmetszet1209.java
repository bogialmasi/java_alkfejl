/*
1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
3. Az elemek a -100 és +100 értéktartományba essenek.
4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):
     1. számok: 98 + 65 + 34 = 197
6. Írasd ki a páros indexű tömbelemek legkisebb elemét.
    Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
 */
package keresztmetszet1209;

import java.util.Scanner;

public class Keresztmetszet1209 {

    public static void main(String[] args) {
        System.out.println("\nKERESZTMETSZET\nAB113C");
        Scanner sc;
        sc = new Scanner(System.in);
        char valasz;
        do { // tulajdonképpen ez a sor már a 9. része
            int darabszam = (int) (Math.random() * 5 + 5); // 2.

            int szamtomb1[] = new int[darabszam]; // 1.
            int szamtomb2[] = new int[darabszam];
            int szamtomb3[] = new int[darabszam];

            for (int i = 0; i < darabszam; i++) {
                szamtomb1[i] = (int) (Math.random() * 200) - 100; // 3.
                szamtomb2[i] = (int) (Math.random() * 200) - 100;
                szamtomb3[i] = (int) (Math.random() * 200) - 100;
            }

            System.out.println("\nA szamtomb1 elemei: "); // 4.
            for (int i = 0; i < szamtomb1.length; i++) {
                System.out.print(String.format("%,4d", szamtomb1[i]) + " ");
            }
            System.out.println("\nA szamtomb2 elemei: ");
            for (int i = 0; i < szamtomb2.length; i++) {
                System.out.print(String.format("%,4d", szamtomb2[i]) + " ");
            }
            System.out.println("\nA szamtomb3 elemei: ");
            for (int i = 0; i < szamtomb3.length; i++) {
                System.out.print(String.format("%,4d", szamtomb3[i]) + " ");
            }
            System.out.println("\n");
            for (int i = 0; i < szamtomb1.length; i++) { // 5.
                System.out.println("A(z) " + (i + 1) + ". számok összege: " + szamtomb1[i] + " + " + szamtomb2[i] + " + " + szamtomb3[i] + " = " + (szamtomb1[i] + szamtomb2[i] + szamtomb3[i]));
            }
            System.out.println("\n");
            for (int i = 0; i < szamtomb1.length; i++) { // 6.
                if (i % 2 == 0) {
                    System.out.println((i) + ". elemek közül a legkisebb: " + Math.min(szamtomb1[i], Math.min(szamtomb2[i], szamtomb3[i])));
                }
            }
            int teljesdarabszam = szamtomb1.length + szamtomb2.length + szamtomb3.length; // 7.
            int teljestomb[] = new int[teljesdarabszam];
            int szamol = 0;
            for (int i = 0; i < szamtomb1.length; i++) { // lopott megoldás, nem értem de működik
                teljestomb[i] = szamtomb1[i];
                szamol++;
            }
            for (int i = 0; i < szamtomb2.length; i++) {
                teljestomb[szamol] = szamtomb2[i];
                szamol++;
            }
            for (int i = 0; i < szamtomb3.length; i++) {
                teljestomb[szamol] = szamtomb3[i];
                szamol++;
            }
            System.out.println("\nA teljestomb elemei: ");
            for (int i = 0; i < teljestomb.length; i++) {
                System.out.print(String.format("%,4d", teljestomb[i]) + " ");
            }

            for (int i = 0; i < teljesdarabszam - 1; i++) { // 8.buborék
                for (int j = 0; j < teljesdarabszam - i - 1; j++) {
                    if (teljestomb[j] > teljestomb[j + 1]) {
                        int temp = teljestomb[j];
                        teljestomb[j] = teljestomb[j + 1];
                        teljestomb[j + 1] = temp;
                    }
                }
            }
            System.out.println("\nA teljestomb elemei rendezve: ");
            for (int j = 0; j < teljestomb.length; j++) {
                System.out.print(String.format("%,4d", teljestomb[j]) + " ");
            }

            System.out.print("\nMegegyező számok: "); // EZT A RÉSZÉT NEM ÉRTEM ÉS NEM TUDOM MEGOLDANI :(
            int ugyanaz[] = new int[teljesdarabszam];
            for (int i = 0; i < teljesdarabszam; i++) {
                if (teljestomb[i] == teljestomb[i + 1]) {
                    ugyanaz[i] = teljestomb[i];
                }
            }
            for (int i = 0; i < ugyanaz.length; i++) {
                System.out.println(String.format("%,4d", ugyanaz[i]) + " ");
            }

            System.out.print("\nÚJRA? i/n: "); // 9.
            valasz = (char) sc.next().toLowerCase().charAt(0);
        } while ((valasz == 'i'));
        sc.close();
    }
}
