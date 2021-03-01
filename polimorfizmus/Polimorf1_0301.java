/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf1_0301;

/**
 *
 * @author Bogi
 */
public class Polimorf1_0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat cicus = new Cat();
        cicus.makeSound();
        cicus.setName("Bubi");
        cicus.setWeight(5);
        System.out.println(cicus.getName() + " " + cicus.getWeight());
    }
    
}
