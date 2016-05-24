package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Snake extends Reptile { // Once again  Animal is already contained in reptile.
    public Snake() {
        this.name = "Snake";
    }

    @Override
    public void makeSound() {
        System.out.println("Ssssssssssss...");
    }
}
