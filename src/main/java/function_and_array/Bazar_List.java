package function_and_array;

//4. Create your todays bazar list/pocket expenditure which includes the item name and price.
//        Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
//        If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bazar_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your products name: ");

        String itemsName = input.nextLine();

        searchItem(itemsName);
        input.close();
    }

    public static void searchItem(String itemsName) {
        HashMap<String, Integer> itemsList = new HashMap<>();

        itemsList.put("Tomato", 35);
        itemsList.put("Fish", 250);
        itemsList.put("Moshla", 30);
        itemsList.put("Alu", 25);

        int result = 0;

        if (itemsList.containsKey(itemsName)) {
            result = itemsList.get(itemsName);
            System.out.println("Items price: " + result);
        } else {
            System.out.println("No items found");
        }
    }
}
