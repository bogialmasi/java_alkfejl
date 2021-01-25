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

    static void eletkor(int kor) {
        if (kor >= 18) {
            System.out.println("Felnőtt");
        } else {
            System.out.println("Gyermek");
        }
    }

    private static double szamitKerulet(double a, double b, double c) {
        return a + b + c;
    }
    
    private static double szamitTerulet(double a, double m){
    return (a * m) / 2.0;}
    
    private static double szamitTerulet2(double a, double b, double c){
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s+(s-a)*(s-b)*(s-c));}

    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);

        elvalaszto();
        System.out.println("AB 113C");
        elvalaszto();

        teljesNev("Mari", "Tóth");

        System.out.println("Keresztnév?: ");
        String keresztnev = bemenet.nextLine();

        System.out.println("Vezetéknév?: ");
        String vezeteknev = bemenet.nextLine();

        teljesNev(keresztnev, vezeteknev);

        System.out.println("Új metódus próba: " + ujMetodus(5, 5));
        
        System.out.println("\nHáromszög terület, kerület számító program");
        
        System.out.printf("Kerulet: %.2f\n", szamitKerulet(30, 35, 40));
        System.out.printf("Terulet: %.2f\n", szamitTerulet(30, 35));
        System.out.printf("Terulet: %.2f\n", szamitTerulet2(30, 35, 40));

    }

}
