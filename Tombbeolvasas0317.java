/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombbeolvasas0317;
import java.io.*;

public class Tombbeolvasas0317 {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        
        try{
        raf = new RandomAccessFile("osztalynevsor.txt", "r");
        raf.close();}
        
        catch( IOException e){
            System.out.println("HIBA");}
    }
    
}
