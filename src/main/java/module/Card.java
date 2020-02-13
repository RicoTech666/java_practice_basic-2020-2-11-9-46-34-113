package module;

public class Card {
    private String cardName;

    public Card() {
    }

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void printCardName() {
        System.out.print(this.cardName + " ");
    }
}
