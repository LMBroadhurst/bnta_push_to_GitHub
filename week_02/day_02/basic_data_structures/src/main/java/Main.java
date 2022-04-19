import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void mainAM1(String[] args) {

        String item1 = "milk";
        String item2 = "bread";
        String item3 = "coffee";
        String item4 = "toothpaste";

//        Wouldn't it be better to turn this into an array?!

//        ARRAYS! Fundamental part of data structures. Data structures typically store related data.

//        The "new" keyword will be implemented when we are creating an array.

//        The ordering of an array is maintained. This gives an index to each value.

        String[] shoppingList = new String[5];

//        Inserting into an array...
        shoppingList[0] = "Milk";
        shoppingList[1] = "Bread";

        System.out.println(shoppingList[0]);
        System.out.println(shoppingList[1]);
        System.out.println(shoppingList[2]);
//        Index 2 gives us "null" - it is an undefined/non-declared value.


    }

    public static void mainAM2(String[] args) {

//        ARRAY LIST
//        Massive pro is that it is as long or as short as we want it to be.

        ArrayList<String> betterShoppingList = new ArrayList();

        betterShoppingList.add("Milk");
        betterShoppingList.add("Eggs");
        betterShoppingList.add("Cucumbers");
        betterShoppingList.add("Wraps");
        betterShoppingList.add("Lettuce");

        System.out.println(betterShoppingList);

//        Search for an item
        System.out.println(betterShoppingList.indexOf("Milk"));

//        Remove item by index number
        System.out.println(betterShoppingList.size());

//        Display item at a specific index

        System.out.println(betterShoppingList.get(2));

//        Remove item by index number
        betterShoppingList.remove(0);

//        Check if item is present
        System.out.println(betterShoppingList.contains("Milk"));

//        Other useful functions...
        betterShoppingList.clear();
        System.out.println(betterShoppingList.isEmpty());

    }

    public static void mainAM3(String[] args) {

//        Map: Non-ordered data structure

//        HashMap...
//        Consists of key-value pairs

        HashMap<String, Integer> mappedShoppingList = new HashMap();

//        Adding a value

        mappedShoppingList.put("Eggs", 1);
        mappedShoppingList.put("Bacon", 4);
        mappedShoppingList.put("Beans", 150);

        System.out.println(mappedShoppingList);

//        Accessing a value

        System.out.println(mappedShoppingList.get("Eggs"));

//        Updating a value

        mappedShoppingList.replace("Beans", 200);
        System.out.println(mappedShoppingList.get("Beans"));

//        Deleting a value

        mappedShoppingList.remove("Bacon");

    }

    public static void main(String[] args) {

    }

}
