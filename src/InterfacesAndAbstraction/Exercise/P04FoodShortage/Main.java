package InterfacesAndAbstraction.Exercise.P04FoodShortage;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokenParts = scanner.nextLine().split(" ");
            Buyer buyer;
            String name = tokenParts[0];
            if (tokenParts.length == 4) {
                buyer = new Citizen(name);
            } else {
                buyer = new Rebel(name);
            }
            buyers.put(name, buyer);
        }

        String buyerNames = scanner.nextLine();
        while (!"End".equals(buyerNames)) {
            Buyer buyer = buyers.get(buyerNames);
            if (buyer != null) {
                buyer.buyFood();
            }
            buyerNames = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);
    }
}
