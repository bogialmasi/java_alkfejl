/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiirasmetodussal0129;

/**
 *
 * @author Bogi
 */
public class Tombkiirasmetodussal0129 {

    public static void kiiratas(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d", tomb[i]) + " ");
        }
        System.out.println("");
    }

    private static void buborek(int tomb[]) {
        int n = tomb.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int temp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int elemszam = 10;
        int tomb1[] = new int[elemszam];
        int tomb2[] = new int[elemszam];
        int tomb3[] = new int[elemszam];

        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random() * 200) - 100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb2[i] = (int) (Math.random() * 200) - 100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb3[i] = (int) (Math.random() * 200) - 100;
        }

        System.out.println("\nAz első tömb elemei: ");
        kiiratas(tomb1);
        buborek(tomb1);
        kiiratas(tomb1);
        System.out.println("\nA második tömb elemei: ");
        kiiratas(tomb2);
        buborek(tomb2);
        kiiratas(tomb2);
        System.out.println("\nA harmadik tömb elemei: ");
        kiiratas(tomb3);
        buborek(tomb3);
        kiiratas(tomb3);

    }

}
