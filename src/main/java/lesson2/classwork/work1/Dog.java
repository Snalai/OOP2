package lesson2.classwork.work1;


import lesson2.classwork.work1.SoundMaker;

class Dog implements SoundMaker {
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

