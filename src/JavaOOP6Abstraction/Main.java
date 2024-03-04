package JavaOOP6Abstraction;

import JavaOOP6Abstraction.abstraction.Animal;
import JavaOOP6Abstraction.abstraction.Cat;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal() // enggak bisa instance abstrack, bisanya implementasi

        Animal cat = new Cat("Roger");
        cat.makeSound();
        cat.eat();
        // cat.climb(); // enggak bisa/ error

        Cat ncat = new Cat("Regor");
        ncat.makeSound();
        ncat.eat();
        ncat.climb();

    }
}
