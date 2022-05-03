package week2_1.singleton.domain;

public class CardCompany {
    private static CardCompany uniqueInstance;

    private CardCompany() {}

    public Card createCard(){

        return new Card();
    }

    public static CardCompany getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CardCompany();
        }
        return uniqueInstance;
    }
}
