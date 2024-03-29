
package WorkingWithAbstraction.Exercise.P06GreedyTimes;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] vault = scanner.nextLine().split("\\s+");

        Map<String, TreeMap<String, Long>> bags = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long cash = 0;

        for (int i = 0; i < vault.length; i += 2) {
            String name = vault[i];
            long count = Long.parseLong(vault[i + 1]);

            String item = "";

            if (name.length() == 3) {
                item = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                item = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                item = "Gold";
            }

            if (item.equals("")) {
                continue;
            } else if (bagCapacity < bags.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (item) {
                case "Gem":
                    if (!bags.containsKey(item)) {
                        if (bags.containsKey("Gold")) {
                            if (count > bags.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bags.get(item).values().stream().mapToLong(e -> e).sum() + count > bags.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bags.containsKey(item)) {
                        if (bags.containsKey("Gem")) {
                            if (count > bags.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bags.get(item).values().stream().mapToLong(e -> e).sum() + count > bags.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bags.containsKey(item)) {
                bags.put((item), new TreeMap<String, Long>());
            }

            if (!bags.get(item).containsKey(name)) {
                bags.get(item).put(name, 0L);
            }


            bags.get(item).put(name, bags.get(item).get(name) + count);
            if (item.equals("Gold")) {
                gold += count;
            } else if (item.equals("Gem")) {
                gems += count;
            } else if (item.equals("Cash")) {
                cash += count;
            }
        }


        for (var bag : bags.entrySet()) {
            Long sumValues = bag.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", bag.getKey(), sumValues));

            bag.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}