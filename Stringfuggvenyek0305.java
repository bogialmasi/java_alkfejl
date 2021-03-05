/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfuggvenyek0305;

//import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Bogi
 */
public class Stringfuggvenyek0305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Saját név: ");
        String tNev = sc.nextLine();
        /*byte[] bytes = tNev.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        assertEquals(tNev, utf8EncodedString);          NEM MEGY AZ ASSERTEQUALS*/
        System.out.print("Keresztnev: ");
        String kNev = sc.nextLine();
        sc.close();
        
        System.out.println("Nagybetűs: " + tNev.toUpperCase());
        System.out.println("Szókezdők nagybetűsek: ");
        System.out.println("Kisbetűs: " + tNev.toLowerCase());
        System.out.println("Karakterszám: " + tNev.length());
        int szokozindex1 = tNev.indexOf(' ');
        System.out.println("A névben az 1.  szóköz helye: " + szokozindex1);
        int szokozindex2 = tNev.lastIndexOf(' ');
        System.out.println("A névben a 2. szóköz helye:" + szokozindex2);
        
        String[] parts = tNev.split(" ");
        String kvNev = parts[0];
        String kkNev = parts[1];
        System.out.println("1. keresztnév kezdő pozíciója:");
        System.out.println("2. keresztnév kezdő pozíciója:");
        System.out.println("Vezetéknév: " + kvNev);
        System.out.println("Keresztnév: " + kkNev);
        System.out.println("Vezetéknév hossza: " + kvNev.length());
        System.out.println("Keresztnév hossza: " + kkNev.length());
        System.out.println("Monogram: ");
        System.out.println("Névegyesítés (vezetéknév + keresztnév): ");
        System.out.println("Új név: ");
    }
    
}
