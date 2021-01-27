package methods0121;

import java.util.Scanner;

public class Methods0121 {

    static void elvalaszto() {
        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
    }

    static void teljesNev(String kereszt, String vezetek) {
        System.out.println(kereszt + " " + vezetek);
    }

    static int ujMetodus(int x, int y) {
        return y * x;
    }

/*    static void eletkor(int kor) {
        if (kor >= 18) {
            System.out.println("Felnőtt");
        } else {
            System.out.println("Gyermek");
        }
    }*/

    private static double szamitKerulet(double a, double b, double c) {
        return a + b + c;
    }

    private static double szamitTerulet(double a, double m) {
        return (a * m) / 2.0;
    }

    private static double szamitTerulet2(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s + (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);

        elvalaszto();
        System.out.println("AB 113C");
        elvalaszto();

        teljesNev("Mari", "Tóth");

        System.out.print("Keresztnév?: ");
        String keresztnev = bemenet.nextLine();

        System.out.print("Vezetéknév?: ");
        String vezeteknev = bemenet.nextLine();

        teljesNev(keresztnev, vezeteknev);

        System.out.println("Új metódus próba: " + ujMetodus(5, 5));

        System.out.println("\nHáromszög terület, kerület számító program");

        System.out.printf("Kerulet: %.2f\n", szamitKerulet(30, 35, 40));
        System.out.printf("Terulet: %.2f\n", szamitTerulet(30, 35));
        System.out.printf("Terulet: %.2f\n", szamitTerulet2(30, 35, 40));

        /*Vizsgáljuk, h a háromszög megszerkeszthető-e!
        Ha nem, kérjen be új adatokat!
        DE 3. próbálkozás után, az eredeti 30, 35, 40 bemeneti paramétereket használja a program!*/
        int probalkozas = 3;
        boolean szerkesztheto = false;
        Scanner sc = new Scanner(System.in);

        while (probalkozas > 0) {
            System.out.println("Adja meg az A oldal értékét!: ");
            int haromszogA = sc.nextInt();
            System.out.println("Adja meg a B oldal értékét!: ");
            int haromszogB = sc.nextInt();
            System.out.println("Adja meg a C oldal értékét!: ");
            int haromszogC = sc.nextInt();
            if ((haromszogA + haromszogB < haromszogC) || (haromszogA + haromszogC < haromszogB) || (haromszogB + haromszogC < haromszogA)) {
                while (probalkozas != 0) {
                    System.out.println("Ez a háromszög nem megszerkeszthető! ");
                    probalkozas -= 1;
                    if ((szerkesztheto = false) || (probalkozas <= 0)) {
                        System.out.println("Nincs több próbálozási lehetőség!");
                        break;
                    } else {
                        System.out.printf("Terulet: %.2f\n", szamitTerulet2(30, 35, 40));
                        break;
                    }
                    
                }

            }else if ((haromszogA + haromszogB > haromszogC) || (haromszogA + haromszogC > haromszogB) || (haromszogB + haromszogC > haromszogA)) {
                        szerkesztheto = true;
                        System.out.printf("Megszerkeszthető! Terulete: %.2f\n", szamitTerulet2(haromszogA, haromszogB, haromszogC));
                        break;
                    }

        }

    }
}
