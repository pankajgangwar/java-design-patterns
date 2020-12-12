package com.pkumar7.designpatterns.creational.singleton;

/**
 * Created by Pankaj Kumar on 08/December/2020
 */
class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.printString("Pankaj");
    }
}
