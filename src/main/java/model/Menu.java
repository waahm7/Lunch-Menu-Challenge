package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String date;
    private List<Dish> dishes;
    public Menu(String date){
        this.date=date;
        dishes=new ArrayList<>();
    }
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}