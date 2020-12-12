package com.pkumar7.designpatterns.creational.factory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        Computer computer = null;
        switch (type){
            case "PC":
                computer = new PC(ram, hdd, cpu);
                break;
            case "Server":
                computer = new Server(ram, hdd, cpu);
                break;
        }
        return computer;
    }
}
