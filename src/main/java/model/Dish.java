package model;

public class Dish {

    private String type;
    private String description;
    private String alergies;
    //keeping it as String to preserve €
    private String price;

    public Dish(String type, String description, String alergies, String price) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.alergies = alergies;
    }

    public void printDish() {
        System.out.println("type: " + type);
        System.out.println("Desciprtion: " + description);
        System.out.println("alergies: " + alergies);
        System.out.println("price: " + price);
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

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
