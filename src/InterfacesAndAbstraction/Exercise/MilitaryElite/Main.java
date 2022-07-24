package InterfacesAndAbstraction.Exercise.MilitaryElite;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Soldier> soldiers = new LinkedHashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String soldierType = tokens[0];
            int soldierId = Integer.parseInt(tokens[1]);
            String soldierFirstName = tokens[2];
            String soldierLastName = tokens[3];

            switch (soldierType) {
                case "Private":
                    createPrivate(tokens, soldierId, soldierFirstName, soldierLastName);
                    break;
                case "LieutenantGeneral":
                    createLieutenantGeneral(tokens, soldierId, soldierFirstName, soldierLastName);
                    break;
                case "Engineer":
                    createEngineer(tokens, soldierId, soldierFirstName, soldierLastName);
                    break;
                case "Commando":
                    createCommando(tokens, soldierId, soldierFirstName, soldierLastName);
                    break;
                case "Spy":
                    createSpy(tokens, soldierId, soldierFirstName, soldierLastName);
                    break;

            }

            input = scanner.nextLine();
        }

        soldiers.values().forEach(System.out::println);
    }

    private static void createPrivate(String[] tokens, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(tokens[4]);

        PrivateImpl priv = new PrivateImpl(id, firstName, lastName, salary);
        soldiers.put(id, priv);
    }

    public static void createLieutenantGeneral(String[] tokens, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(tokens[4]);

        LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
        for (int i = 5; i < tokens.length; i++) {
            lieutenantGeneral.addPrivate((Private) soldiers.get(Integer.parseInt(tokens[i])));
        }
        soldiers.put(id, lieutenantGeneral);
    }

    public static void createEngineer(String[] tokens, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(tokens[4]);

        try {
            Corps corps = Corps.valueOf(tokens[5]);

            EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps);

            for (int i = 6; i < tokens.length; i+= 2) {
                String partName = tokens[i];
                int repairHours = Integer.parseInt(tokens[i + 1]);

                engineer.addRepair(new Repair(partName, repairHours));
            }
            soldiers.put(id, engineer);
        } catch (IllegalArgumentException ignored) {
        }
    }


    public static void createCommando(String[] tokens, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(tokens[4]);

        try {
            Corps corps = Corps.valueOf(tokens[5]);

            CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corps);

            for (int i = 6; i < tokens.length; i+= 2) {
                String codeName = tokens[i];
                try {
                    MissionState state = MissionState.valueOf(tokens[i + 1]);
                    commando.addMission(new Mission(codeName, state));
                } catch (IllegalArgumentException ignored) {

                }
            }
            soldiers.put(id, commando);
        } catch (IllegalArgumentException ignored) {
        }
    }

    public static void createSpy(String[] tokens, int id, String firstName, String lastName) {
        String codeNumber = tokens[4];

        SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
        soldiers.put(id, spy);
    }
}
