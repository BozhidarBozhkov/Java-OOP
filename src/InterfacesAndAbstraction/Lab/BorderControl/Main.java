package InterfacesAndAbstraction.Lab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            Identifiable identifiable = tokens.length == 2
                    ? new Robot(tokens[1], tokens[0])
                    : new Citizen(tokens[2], Integer.parseInt(tokens[1]), tokens[1]);

            identifiables.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIdPostFix = scanner.nextLine();

        identifiables.stream().map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdPostFix))
                .forEach(System.out::println);
    }

}
