package model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishes;
    public sMenu() {

        dishes = new ArrayList<>();

    }

    public void insertDish(Dish dish) {
        dishes.add(dish);
    }

    public void printMenu() {
        for (Dish dish : dishes) {
            dish.printDish();
            System.out.println();
        }
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
}