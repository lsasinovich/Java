package com.liza;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard1 = new DebitCard();
        DebitCard debitCard2 = new DebitCard(15);

        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard(150);

        Atm atm = new Atm();

        atm.insertCard(debitCard2);
        atm.increaseBalance(35);
        atm.decreaseBalance(5555);
        System.out.println("Debit Card 2 balance " + debitCard2.activeBalance + "\n");
        atm.takeOutCard();

        atm.insertCard(debitCard1);
        atm.increaseBalance(35);
        atm.decreaseBalance(20);
        System.out.println("Debit Card 1 balance " + debitCard1.activeBalance + "\n");
        atm.takeOutCard();

        atm.insertCard(creditCard2);
        atm.increaseBalance(35);
        atm.decreaseBalance(5555);
        System.out.println("Credit Card 2 balance " + creditCard2.activeBalance + "\n");
        atm.takeOutCard();

        atm.insertCard(creditCard1);
        atm.increaseBalance(35);
        atm.decreaseBalance(20);
        System.out.println("Credit Card 1 balance " + creditCard1.activeBalance + "\n");
        atm.takeOutCard();
    }
}
