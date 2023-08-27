package lesson2.classwork.work1;

import lesson2.classwork.work1.Cat;
import lesson2.classwork.work1.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Вызов методов makeSound()
        dog.makeSound(); // Выводит "Buddy barks."
        cat.makeSound(); // Выводит "Whiskers meows."
    }
}
