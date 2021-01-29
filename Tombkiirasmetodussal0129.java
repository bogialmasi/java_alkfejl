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

    private static void kiiratas(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d", tomb[i]) + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int elemszam = 10;
        int tomb1[] = new int[elemszam];
        int tomb2[] = new int[elemszam];
        int tomb3[] = new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*200)-100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb2[i] = (int) (Math.random()*200)-100;
        }
        for (int i = 0; i < elemszam; i++) {
            tomb3[i] = (int) (Math.random()*200)-100;
        }

        System.out.println("Az első tömb elemei: ");
        kiiratas(tomb1);
        System.out.println("A második tömb elemei: ");
        kiiratas(tomb2);
        System.out.println("A harmadik tömb elemei: ");
        kiiratas(tomb3);

    }

}