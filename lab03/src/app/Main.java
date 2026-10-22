package app;
import animals.Cat;
import animals.Dog;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog("scoobert", 4);
        Cat cat = new Cat("gato", 7);

        cat.makeSound();
        dog.makeSound();
    }
}
