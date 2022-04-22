package _6_restaurant_getters_setters;

public class RestaurantClient {

    public static void main(String[] args) {

        Restaurant nandos = new Restaurant();

        nandos.setChairs(100);
        nandos.setTables(35);
        nandos.setFoodServed("Cheeky Nandos!");
        nandos.setManagerName("Lewis");

        System.out.println("Hi I'm " + nandos.getManagerName() +". Come inside for a " + nandos.getFoodServed());
        System.out.println("We have " + nandos.getTables() + " tables and " + nandos.getChairs() + " chairs in our restaurant.");
    }

}
