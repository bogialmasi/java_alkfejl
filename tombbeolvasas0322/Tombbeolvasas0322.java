/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombbeolvasas0322;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Bogi
 */
public class Tombbeolvasas0322 {

    public static ArrayList<Diakok> osztaly = new ArrayList<>();

    public static void beolvas() {
        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Bogi\\Desktop\\ALKFEJL\\tombbeolvasas0317\\rollcall.txt", "r");
            while (raf.getFilePointer() < raf.length()) {
                osztaly.add(new Diakok(raf.readLine()));
            }

            System.out.println("\nBeolvasva" + osztaly.size() + " !");
            raf.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Nem találja!");
        }

    }

    public static void main(String[] args) {
        beolvas();
    }

    /*class Diakok{
    
    public String vNEV;
    public String kNEV;
    public String kNEV2;
    
    public Diak(String row){
    }}*/
}
