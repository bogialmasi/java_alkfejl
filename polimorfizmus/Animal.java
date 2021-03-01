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
public abstract class Animal {
    private String name;
    private int weight;
    
    protected void makeSound(){
        System.out.println("*******");}

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
