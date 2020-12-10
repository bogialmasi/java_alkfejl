package kivalasztas1210;

import java.util.Scanner;

public class Kivalasztas1210 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int darabszam = 20;

        int tomb[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            tomb[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.print("\nElemek:");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(tomb[i] + " ");
        }

        System.out.println("\nMinden harmadik elem: ");
        for (int i = 3; i < darabszam; i += 3) {
            System.out.print(tomb[i] + " ");
        }

        System.out.print("\nMelyik elem?: ");
        int keresett = sc.nextInt();

        System.out.println("\n");
        int j = 0;
        for (int i = 0; i < darabszam; i++) {
            if (tomb[i] == keresett) {
                System.out.print("A keresett szám indexe: " + (i + 1));
                break;
            }
            j++;
        }

        if (darabszam == j) {
            System.out.println("Nem volt benne.");
        }

        System.out.println("\n");
        int i = 0;
        while (tomb[i] != keresett) {
            i++;
        }

        System.out.print("A keresett szám indexe: " + (i + 1));
        sc.close();
    }

}
