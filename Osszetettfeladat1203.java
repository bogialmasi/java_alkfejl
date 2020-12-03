/*
1. Hozz létre két tömböt: szamok1, szamok2 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
3. Az elemek a -50 és +50 értéktartományba essenek.
4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
 */
package osszetettfeladat1203;
import java.util.Scanner;
public class Osszetettfeladat1203 {

    public static void main(String[] args) {
        System.out.println("\n ÖSSZETETT FELADATSOR\nAB 113C");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
            int darabszam = (int) (Math.random() * 10) + 30;
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -50) + 50;
            szamok2[i] = (int) (Math.random() * -50) + 50;
        }
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
            }
        }
        int legnagyobb = szamok1[0];
        int legkisebb = szamok1[0];
        for (int i = 0; i < darabszam; i++) {
            if (ujTomb[i] > legnagyobb) {
                legnagyobb = szamok1[i];
            }
        }
        for (int i = 0; i < darabszam; i++) {
            if (ujTomb[i] < legkisebb) {
                legkisebb = szamok1[i];
            }
        }
        
            System.out.println("\nA legnagyobb elem: " + legnagyobb + ", a legkisebb elem: " + legkisebb);
        
        if (legnagyobb % legkisebb == 0) {
            System.out.println("\nAz ujTomb tömb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\nA ujTomb tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        System.out.println("Újra lefuttatja a programot? i/n: ");
        valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}

