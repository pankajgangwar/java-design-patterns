package com.pkumar7.designpatterns.creational.abstractfactory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "500GB", "2.4Ghz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("32GB", "4TB", "3.2Ghz"));
        System.out.println("Server = " + server.toString());
        System.out.println("PC = " + pc.toString());
    }
}
