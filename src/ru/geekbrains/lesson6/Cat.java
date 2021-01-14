package ru.geekbrains.lesson6;

public class Cat extends Animal implements Animal.CanRun, Animal.CanJump {
    protected static int CatCount=0;
    private int runDistanceLimit;
    private int jumpHeightLimit;

    public Cat(int runDistanceLimit, int height)
    {
        this.runDistanceLimit=runDistanceLimit;
        this.jumpHeightLimit=height;
        CatCount++;
        animalsCounter++;
    }


    public static void showCatCount() {
        System.out.println("Всего кошек: "+CatCount);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу! ");
    }

    @Override
    public void run(int distance) {
        if(distance<=runDistanceLimit&&distance>0)
        System.out.println("кошка пробежала "+distance+" м");
        else if(distance>runDistanceLimit)
            System.out.println("слишком большая дистанция");
        else if(distance<0)
            System.out.println("дистанция не может быть отрицательной");
    }

    @Override
    public void jump(int height) {
        if(height<=jumpHeightLimit&&height>0)
            System.out.println("кошка прыгнула на "+height+" см");
        else if(height>jumpHeightLimit)
            System.out.println("слишком большая высота");
        else if (height<0)
            System.out.println("кошка спрыгнула с высоты "+height+" см");
    }

}
