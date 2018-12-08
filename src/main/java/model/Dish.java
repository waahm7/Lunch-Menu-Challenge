package model;

public class Dish {

    private String type;
    private String description;
    private String allergies;
    //keeping it as String to preserve €
    private String price;

    public Dish(String type, String description, String allergies, String price) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.allergies = allergies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
