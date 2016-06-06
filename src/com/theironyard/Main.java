package com.theironyard;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        // Dog d = new Dog();
        Animal s = createAnimal("Snake");
        //Snake s = new Snake();
        Animal h = createAnimal("Hawk");
        //Hawk h = new Hawk();

        // anonymous class
        Animal a = new Reptile() {
            @Override
            public void makeSound() {
                System.out.println("Croak!");
            }
        };

        a.name = "Alligator";

        // anonymous function a.k.a lambda
        Runnable r = () -> {
            System.out.println("Hello from lambda");
        };
        sayHello(r);


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

    public static void sayHello(Runnable runnable) {
        System.out.println("Hello!");
        runnable.run();

    }
}
