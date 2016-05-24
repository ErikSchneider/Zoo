package com.theironyard;

/**
 * Created by Erik on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal Sound! !");
    }

    @Override
    public String toString() { //toString will print out what ever you ask it to return. Will always be called when trying to print out
        return name;
    }
}
