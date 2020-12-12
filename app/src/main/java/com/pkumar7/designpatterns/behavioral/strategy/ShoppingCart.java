package com.pkumar7.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class ShoppingCart {
    List<Item> items;
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public boolean removeItem(Item item){
        return items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
