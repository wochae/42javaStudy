package week2_1.singleton;

import week2_1.singleton.domain.Card;
import week2_1.singleton.domain.CardCompany;

public class CardCompanyTest {
    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());
    }
}
