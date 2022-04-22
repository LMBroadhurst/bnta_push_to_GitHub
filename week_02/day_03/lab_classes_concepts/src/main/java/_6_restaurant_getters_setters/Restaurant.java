package _6_restaurant_getters_setters;

public class Restaurant {

    private int tables;
    private int chairs;
    private String managerName;
    private String foodServed;

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getFoodServed() {
        return foodServed;
    }

    public void setFoodServed(String foodServed) {
        this.foodServed = foodServed;
    }
}
