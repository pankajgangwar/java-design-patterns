package com.pkumar7.designpatterns.creational.builder;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Main {

    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("8GB", "500GB");
        builder.setGraphicsCardEnabled(false);
        builder.setBluetoothEnabled(true);
        Computer computer = builder.build();
        System.out.println("Computer configuration = " + computer.toString());
    }
}
