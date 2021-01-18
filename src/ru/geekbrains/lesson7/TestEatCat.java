package ru.geekbrains.lesson7;

public class TestEatCat {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Vaska", 4);
        cat[2] = new Cat("Murzik", 1);
        cat[3] = new Cat("Murka", 6);
        cat[4] = new Cat("Kot", 2);
        Plate plate = new Plate(15);
        plate.info();

        for (Cat cats : cat
        ) {
            cats.eat(plate);
            cats.showCatInfo();
            plate.info();
        }
        plate.addFoodToPlate(3);

        for (Cat cats : cat
        ) {
            cats.eat(plate);
            cats.showCatInfo();
            plate.info();
        }

    }

}
