package com.pkumar7.designpatterns.behavioral.strategy;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("amount = " + amount + " paid with Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
