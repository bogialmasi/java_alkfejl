package osszegzes;

public class Osszegzes {

    public static void main(String[] args) {
        System.out.println("AB 113C\n");

        // ÖSSZEGZÉS
        System.out.println("\nÖsszegzés: ");
        int[] tomb1 = new int[5];

        tomb1[0] = 32;
        tomb1[1] = 41;
        tomb1[2] = 75;
        tomb1[3] = 77;
        tomb1[4] = 85;

        int tomb2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            tomb2[i] = (int) (Math.random() * 99) + 1;
        }
        // tömb 1 kiíratása + összeg
        int tombosszeg1 = 0;
        System.out.print("A tomb1 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + i + ". elem: " + String.format("%,2d", tomb1[i]));
            tombosszeg1 = tombosszeg1 + tomb1[i];
        }
        // tömb2 kiíratása + összeg
        int tombosszeg2 = 0;
        System.out.print("\nA tomb2 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + i + ". elem: " + String.format("%,2d", tomb2[i]));
            tombosszeg2 = tombosszeg2 + tomb2[i];
        }
        System.out.println("\n\nA tömb1 elmeinek összege: " + tombosszeg1);
        System.out.println("A tömb1 elemeinek átlaga: " + tombosszeg1 / tomb1.length);
        System.out.println("A tömb2 elemeinek összege: " + tombosszeg2);
        System.out.println("A tömb2 elemeinek átlaga: " + tombosszeg2 / tomb2.length);

        // SZÁMLÁLÁS
        System.out.println("\nSzámlálás:\n");
        int db = 0; // darabszám
        int parosSzamlalo = 0; // páros számok
        int paratlanSzamlalo = 0; // pratlan számok
        int tomb3[] = new int[5];
        for (int i = 0; i < 5; i++) {
            tomb3[i] = (int) (Math.random() * 99) + 1;
            db++;
            if (tomb3[i] % 2 == 0) {
                parosSzamlalo++; // összegyűjti a páros számokat
            } else if (tomb3[i] % 2 == 1) {
                paratlanSzamlalo++; // összegyűjti a páratlanokat
            }
        }
        // elemenként kiírja a tömb elemeit
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ". elem: ");
            System.out.print(String.format("%,6d", tomb3[i]) +"\n");
            if (tomb3[i] %2 != 0) {
                System.out.print(i + 1 + ". elem páratlan\n");
            }
        }
        System.out.println("\n" + db + " elemű tömb\n");
        System.out.println(parosSzamlalo + " számú elem páros.");
        System.out.println(paratlanSzamlalo + " számú elem páratlan");
        /*AZ 'i' ÉRTÉKE kiíratáskor eggyel többet ír mert a for cikluson kívűl az i értéke 1-el nő
        csak akkor lehet iíratni az 'i'-t a for cikluson kívűl ha a for cikluson kívül van deklarálva
         */
    }

}
