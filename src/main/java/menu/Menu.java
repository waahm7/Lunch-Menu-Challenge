package menu;

import java.util.ArrayList;

public  class Menu {
    ArrayList<Dish> dishes;

    Menu() {
        dishes = new ArrayList<>();
    }

    void insertDish(Dish dish) {
        dishes.add(dish);
    }

    void printMenu() {
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