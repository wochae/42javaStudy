package week2_1.singleton.domain;

public class Card {
    public static Integer amount = 10000;
    private Integer cardNumber;

    public Card() {
        this.cardNumber = ++amount;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }
}
