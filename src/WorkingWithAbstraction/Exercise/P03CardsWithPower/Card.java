package WorkingWithAbstraction.Exercise.P03CardsWithPower;

public class Card {
    private CardSuits cardSuit;
    private CardRanks cardRanks;

    public Card(CardSuits cardSuit, CardRanks cardRanks) {
        this.cardSuit = cardSuit;
        this.cardRanks = cardRanks;
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }

    public int getPower() {
        return cardRanks.getRankPower() + cardSuit.getPower();
    }
}
