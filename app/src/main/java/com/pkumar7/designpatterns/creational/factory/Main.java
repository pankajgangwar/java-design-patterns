package com.pkumar7.designpatterns.creational.factory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","8GB","500GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server","24GB","4TB","3.2 GHz");

        System.out.println("Server = " + server.toString());
        System.out.println("PC = " + pc.toString());
    }
}
