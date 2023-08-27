package lesson2.classwork.work3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Использование методов из интерфейсов
        dog.makeSound(); // Вывод: The dog barks.
        dog.play();      // Вывод: The dog plays fetch.

        cat.makeSound(); // Вывод: The cat meows.
    }
}