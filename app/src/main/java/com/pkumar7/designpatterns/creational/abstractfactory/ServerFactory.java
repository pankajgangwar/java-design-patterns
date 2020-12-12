package com.pkumar7.designpatterns.creational.abstractfactory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class ServerFactory implements ComputerAbstractFactory {
    String ram, hdd, cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
