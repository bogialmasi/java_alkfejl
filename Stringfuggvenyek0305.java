/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfuggvenyek0305;

//import java.nio.charset.StandardCharsets;
import java.util.Locale;
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
        
        
        String teljes = tNev + " " + kNev;
        
        int szokozindex1 = teljes.indexOf(' ') +1;
        int szokozindex2 = teljes.lastIndexOf(' ') +1;
        
        String[] parts = tNev.split(" ");
        String tvNev = parts[0];
        String tkNev = parts[1];
        char tvMono = tvNev.charAt(0);
        char tkMono = tkNev.charAt(0);
        
        System.out.println("Nagybetűs: " + tNev.toUpperCase());
        System.out.println("Szókezdők nagybetűsek: ");
        System.out.println("Kisbetűs: " + tNev.toLowerCase());
        System.out.println("Karakterszám: " + tNev.length());
        System.out.println("A névben az 1.  szóköz helye: " + szokozindex1);
        System.out.println("A névben a 2. szóköz helye:" + szokozindex2);
        System.out.println("1. keresztnév kezdő pozíciója:" + (teljes.indexOf(tkNev) +1) );
        System.out.println("2. keresztnév kezdő pozíciója:" + (teljes.indexOf(kNev) +1) );
        System.out.println("Vezetéknév: " + tvNev);
        System.out.println("Keresztnév: " + tkNev);
        System.out.println("Vezetéknév hossza: " + tvNev.length());
        System.out.println("Keresztnév hossza: " + tkNev.length());
        System.out.println("Monogram: " + tvMono + " " + tkMono);
        System.out.println("Névegyesítés (vezetéknév + keresztnév): " + tvNev + tkNev );
        System.out.println("Új név: " + tNev.replace(tkNev, kNev));
    }
    
}
