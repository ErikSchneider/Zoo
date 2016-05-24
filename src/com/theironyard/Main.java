package com.theironyard;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        // Dog d = new Dog();
        Animal s = createAnimal("Snake");
        //Snake s = new Snake();
        Animal h = createAnimal("Hawk");
        //Hawk h = new Hawk();

        d.makeSound();
        s.makeSound();
        h.makeSound();

        System.out.println(d);
        System.out.println(s);
        System.out.println(h);

    }

    // Creating Factory Method

    public static Animal createAnimal(String name) {
        switch (name) {
            case "Dog":
                return new Dog();

            case "Snake":
                return new Snake();

            case "Hawk":
                return new Hawk();

        }
        // return null; With new animal it will not throw an error instead it will give you default animal sound and null name
        return new Animal();
    }
}
