package ru.geekbrains.lesson6;

public class Test {

    public static void main(String[] args) {
        Dog dog1=new Dog(10,10,10);
        Dog dog2=new Dog(20,20,20);
        Dog dog3=new Dog(30,30,30);
        Cat cat1=new Cat(5,15);
        Cat cat2=new Cat(10,34);
        cat2.makeSound();
        cat1.jump(16);
        cat1.run(2);
        Cat.showCatCount();
        Animal.showAnimalCount();
        Dog.showDogCount();
        dog1.makeSound();
        dog1.swim(10);
        dog1.swim(11);


    }
}

