package com.liza;

public class Card {
    public double activeBalance;

    public void increaseBalance(double moneyCount) {
        activeBalance += moneyCount;
    }

    public void decreaseBalance(double moneyCount) {
        activeBalance -= moneyCount;
    }
}
