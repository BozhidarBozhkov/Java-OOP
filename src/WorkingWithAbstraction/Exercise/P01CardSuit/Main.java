package WorkingWithAbstraction.Exercise.P01CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        CardSuit[] cardSuit = CardSuit.values();
        for (CardSuit card : cardSuit) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.ordinal(), card.name());
        }

    }

}
