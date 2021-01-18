package ru.geekbrains.lesson7;

public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        System.out.println("Cat is eating...");
        if (!satiety) {
            if (this.getAppetite() <= plate.getFood()) {
                plate.decreaseFood(getAppetite());
                appetite = 0;
                satiety = true;
            }
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void showCatInfo() {
        String satietyStatus;
        if (this.getSatiety())
            satietyStatus = "сытый";
        else satietyStatus = "голодный";

        System.out.println("Кот " + this.name + " - " + satietyStatus);
    }

}

