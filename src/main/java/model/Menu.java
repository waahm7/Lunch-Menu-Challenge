package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes=new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
}