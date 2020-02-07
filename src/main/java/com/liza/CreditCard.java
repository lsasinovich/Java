package com.liza;

public class CreditCard implements Card {
    public double activeBalance;

    public CreditCard() {
        activeBalance = 0;
    }

    public CreditCard(double balance) {
        activeBalance = balance;
    }

    @Override
    public void increaseBalance(double moneyCount) {
        activeBalance += moneyCount;
    }

    @Override
    public void decreaseBalance(double moneyCount) {
        activeBalance -= moneyCount;
    }
}