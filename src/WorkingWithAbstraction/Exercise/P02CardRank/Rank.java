package WorkingWithAbstraction.Exercise.P02CardRank;

public enum Rank {
    ACE (0),
    TWO (1),
    THREE (2),
    FOUR (3),
    FIVE (4),
    SIX (5),
    SEVEN (6),
    EIGHT (7),
    NINE (8),
    TEN (9),
    JACK (10),
    QUEEN (11),
    KING (12);

    private int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: "+ rank + "; Name value: ");
    }

    public static void printAll () {
        System.out.println("Card Ranks:");
        for (Rank card: Rank.values()) {
            System.out.println(card + card.name());
        }
    }
}
