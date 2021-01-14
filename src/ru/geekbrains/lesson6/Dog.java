package ru.geekbrains.lesson6;

public class Dog extends Animal implements Animal.CanRun, Animal.CanJump, Animal.CanSwim {
    protected static int DogCount=0;
    private int runDistanceLimit;
    private int jumpHeightLimit;
    private int swimDistanceLimit;

    public Dog(int runDistanceLimit, int jumpHeightLimit, int swimDistanceLimit) {
        this.runDistanceLimit=runDistanceLimit;
        this.jumpHeightLimit=jumpHeightLimit;
        this.swimDistanceLimit=swimDistanceLimit;
        DogCount++;
        animalsCounter++;
    }


    public static void showDogCount() {
        System.out.println("Всего собак: "+DogCount);
    }

@Override
    public void makeSound(){
    System.out.println("Гав-Гав!");
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

    @Override
    public void run(int distance) {
        if(distance<=runDistanceLimit&&distance>0)
            System.out.println("собака пробежала "+distance+" м");
        else if(distance>runDistanceLimit)
            System.out.println("слишком большая дистанция");
        else if(distance<0)
            System.out.println("дистанция не может быть отрицательной");
        }


    @Override
    public void swim(int distance) {
        if(distance<=jumpHeightLimit&&swimDistanceLimit>0)
            System.out.println("собака проплыла  "+swimDistanceLimit+" м");
        else if(distance>jumpHeightLimit)
            System.out.println("слишком большая дистанция");
        else if (distance<0)
            System.out.println("дистанция не может быть отрицательной");
    }
}
