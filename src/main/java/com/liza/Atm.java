package com.liza;

public class Atm {
    Card activeCard;

    public Atm() {
        activeCard = null;
    }

    public Atm(Card card) {
        activeCard = card;
    }

    public void insertCard(Card card) {
        activeCard = card;
    }

    public void takeOutCard() {
        activeCard = null;
    }

    public void increaseBalance(double moneyCount) {
        if (activeCard != null) {
            activeCard.increaseBalance(moneyCount);
        } else {
            System.out.println("Insert the card, please");
        }

    }

    public void decreaseBalance(double moneyCount) {
        if (activeCard != null) {
            activeCard.decreaseBalance(moneyCount);
        } else {
            System.out.println("Insert the card, please");
        }
    }
}