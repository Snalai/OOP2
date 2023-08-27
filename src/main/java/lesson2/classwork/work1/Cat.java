package lesson2.classwork.work1;

import lesson2.classwork.work1.SoundMaker;

class Cat implements SoundMaker {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
