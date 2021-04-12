/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombbeolvasas0322;

/**
 *
 * @author Bogi
 */
public class Diakok {
    public String vezNEV;
    public String kerNEV;
    public String kerNEV2;
    
    public Diakok(String sor){
    String[] adatok = sor.split(" ");
    
    this.vezNEV = adatok[0];
    this.kerNEV = adatok[1];
    this.kerNEV2 = adatok[2];}
}
