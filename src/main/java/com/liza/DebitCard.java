package com.liza;

public class DebitCard extends Card {
    public DebitCard() {
        activeBalance = 0;
    }

    public DebitCard(double balance) {
        activeBalance = balance;
    }

    public void decreaseBalance(double moneyCount) {
        if (activeBalance - moneyCount >= 0) {
            activeBalance = activeBalance - moneyCount;
        } else {
            System.out.println("Not enough funds in the account");
        }
    }
}
