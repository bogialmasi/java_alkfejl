/*
1 tömbben 5 elem 1 - 100 között
véletlen szám generátorral másik tömb 5 elem (tomb2)
egymás mellé kiíratni a számokat párhuzamosan az értékeket

megvizsgálni a 2 tömb adott elemeit és megvizsgálni hogy melyik számjegy nagyobb melyiknél vagy egyenlő-e
 */
package kettomb;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("AB 113C\n");
        
        // első tömb
        int tombosszeg = 0;
        int tomb[] = {10, 22, 32, 45, 54};

        // második tömb
        int tomb2osszeg = 0;
        int tomb2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            tomb2[i] = (int) (Math.random() * 90);
            tomb2osszeg += tomb2[i];
        }
        
        // számok kiíratása 1. + 2. tömb
        for (int j = 0; j < 5; j++) {
            //System.out.println("Az első tömb " + (j+1) + ". száma: " + tomb[j] + ", a második tömb " + (j+1) + ". száma: " + tomb2[j]);
            System.out.print(String.format("%,2d", tomb2[j]) + " ");
        }
        System.out.println("\b");
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%,2d", tomb[i]) + " ");
        }
        
        // kisebb / nagyobb / egyeblő
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            if (tomb[i] < tomb2[i]) {
                System.out.println(tomb[i] + " kisebb, mint " + tomb2[i]);
            } else if (tomb[i] > tomb2[i]) {
                System.out.println(tomb[i] + " nagyobb, mint " + tomb2[i]);
            } else {
                System.out.println("A két szám egyenlő! ");
            }
        }
        
        // ÖSSZEGZÉS TÉTELE összeadtuk a tömb elemeit (tombosszeg, tomb2osszeg
        System.out.println("\nA 'tömb' elemeinek összege: " + tombosszeg + "\nÁtlaga: " + tombosszeg / tomb.length);
        System.out.println("\nA 'tömb2' elemeinek összege: " + tomb2osszeg + "\nÁtlaga: " + tomb2osszeg / tomb2.length);
        
        
        //System.out.println("Átlaga: " + tombosszeg / tomb.length);
        
        //System.out.println("\nA 'tömb2' elemeinek összege: " + tomb2osszeg);
        //System.out.println("Átlaga: " + tomb2osszeg / tomb2.length);

        /* KÉT SZÁMJEGY LESZ BELŐLE sout(String.format("%,2d", tomb[i]) + " ")
        d = int f = float s = string
        ha a számból csak egészet akarunk akkor %d*/
    }
}
