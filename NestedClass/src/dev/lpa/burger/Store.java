package dev.lpa.burger;

public class Store {

    static void main() {

        Meal regularMeal = new Meal();
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);
    }
}
