package Day8.Assigment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Que2 {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Laptop", 999.99);
        productPrices.put("Mouse", 25.50);
        productPrices.put("Keyboard", 45.00);

        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Mouse");

        double total = 0;
        System.out.println("Items in your cart:");
        for (String item : cart) {
            Double price = productPrices.get(item);
            if (price != null) {
                System.out.println("- " + item + ": RS" + price);
                total += price;
            }
        }

        System.out.printf("Total Bill: RS%.2f%n", total);
    }
}
