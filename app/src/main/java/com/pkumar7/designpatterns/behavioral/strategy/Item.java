package com.pkumar7.designpatterns.behavioral.strategy;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Item {
    private String itemCode;
    private int price;
    public Item(String code, int cost){
        this.itemCode = code;
        this.price = cost;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getPrice() {
        return price;
    }
}
