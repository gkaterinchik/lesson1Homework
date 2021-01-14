package ru.geekbrains.lesson6;

abstract public class Animal {
    protected static int animalsCounter=0;
    public abstract void makeSound();

    public static void showAnimalCount(){
        System.out.println("всего животных: "+ animalsCounter);
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    interface CanRun {
        void run(int distance);
    }
    interface CanSwim{
        void swim(int distance);
    }
    interface CanJump{
        void  jump(int height);
    }


}
