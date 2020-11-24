package tombmuveletek;

/**
 *
 * @author Bogi
 */
import java.util.Scanner;

public class tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n KIVÁLOGATÁS TÉTELE\n");
        int db;
        
        System.out.print("Hány jegyet írjon ki? ");
            db = sc.nextInt();
            
        int erdemjegyek[]= new int [db];        // "mennyi" db jegy lesz
        int masolat [] = new int [db];      // "másolat"-ba is bekerül minden
        
        for (int i = 0; i < db; i++) {      //
            erdemjegyek[i]= (int)(Math.random()*4)+1;
        }
        System.out.print("\nA jegyek: ");     // kiírja a jegyeket
        for (int i = 0; i < db; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        
        int kettesekDb=0;       // ketteseket számolja
        for (int i = 0; i < db; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("\nA másolat tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.println("nincs 2-es");
            }
        
        System.out.println("\nKettesek száma: " + (kettesekDb));

    }

}
