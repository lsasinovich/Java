package com.liza;

public class DebitCard implements Card {
    public double activeBalance;

    public DebitCard() {
        activeBalance = 0;
    }

    public DebitCard(double balance) {
        activeBalance = balance;
    }

    @Override
    public void increaseBalance(double moneyCount) {
        activeBalance += moneyCount;
    }

    @Override
    public void decreaseBalance(double moneyCount) {
        if (activeBalance - moneyCount >= 0) {
            activeBalance = activeBalance - moneyCount;
        } else {
            System.out.println("Not enough funds in the account");
        }
    }
}
