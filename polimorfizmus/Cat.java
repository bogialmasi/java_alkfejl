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
public class Cat extends Animal implements Pet{
    
    @Override
    public void makeSound(){
        System.out.println("Meow!");}

    @Override
    public void cuddle() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }
}
