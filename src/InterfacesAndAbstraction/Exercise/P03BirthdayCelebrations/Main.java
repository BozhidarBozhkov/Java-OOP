package InterfacesAndAbstraction.Exercise.P03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Birthable> subjectsWithBirthday = new ArrayList<>();


        while (!"End".equals(command)) {
            String[] commandParts = command.split(" ");
            String typeToCreate = commandParts[0];

            switch (typeToCreate) {
                case "Citizen":
                    String citizenName = commandParts[1];
                    int citizenAge = Integer.parseInt(commandParts[2]);
                    String citizenId = commandParts[3];
                    String citizenBirthdate = commandParts[4];

                    Birthable citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthdate);
                    subjectsWithBirthday.add(citizen);
                    break;
                case "Pet":
                    String petName = commandParts[1];
                    String petBirthDate = commandParts[2];

                    Birthable pet = new Pet(petName, petBirthDate);

                    subjectsWithBirthday.add(pet);
                    break;
                case "Robot":
                    String id = commandParts[1];
                    String model = commandParts[2];
                    Robot robot = new Robot(id, model);
                    break;
            }

            command = scanner.nextLine();
        }

        String yearToCheck = scanner.nextLine();

        for (Birthable birthable : subjectsWithBirthday) {
            if (birthable.getBirthDate().endsWith(yearToCheck)) {
                System.out.println(birthable.getBirthDate());
            }
        }

    }

}
