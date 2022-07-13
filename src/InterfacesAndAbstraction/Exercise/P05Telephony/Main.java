package InterfacesAndAbstraction.Exercise.P05Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersToCall = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> sites = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbersToCall, sites);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }

}
