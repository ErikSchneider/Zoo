package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Dog extends Mammal { // can only extend one class. Animal class is already in Mammal class.
    public Dog() {
        this.name = "Dog";
    }

    //@Override help fix errors in methods

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }


}
