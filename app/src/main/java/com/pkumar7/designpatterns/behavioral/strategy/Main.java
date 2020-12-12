package com.pkumar7.designpatterns.behavioral.strategy;

/**
 * Created by Pankaj Kumar on 12/December/2020
 * Strategy pattern is also known as Policy Pattern.
 * We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
 * Ex: Collections.sort();
 * Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.
 */
class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("121", 100);
        Item item2 = new Item("132", 150);
        Item item3 = new Item("133", 250);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.pay(new DebitCardStrategy("Pankaj Kumar","0012115533664487","069","12/23"));
        cart.pay(new CreditCardStrategy("Pankaj Kumar","5426005689451211","023","10/22"));

    }
}
