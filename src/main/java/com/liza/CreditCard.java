package com.liza;

public class CreditCard extends Card {
    public CreditCard() {
        activeBalance = 0;
    }

    public CreditCard(double balance) {
        activeBalance = balance;
    }
}