package menu;

public class Dish {

    private String type;
    private String description;
    private String addons;
    //keeping it as String to preserve €
    private String price;

    Dish(String type, String description, String addons, String price) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.addons = addons;
    }

    void printDish() {
        System.out.println("type: " + type);
        System.out.println("Desciprtion: " + description);
        System.out.println("addons: " + addons);
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

    public String getAddons() {
        return addons;
    }

    public void setAddons(String addons) {
        this.addons = addons;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
