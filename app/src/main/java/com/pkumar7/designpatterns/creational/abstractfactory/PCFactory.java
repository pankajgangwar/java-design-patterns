package com.pkumar7.designpatterns.creational.abstractfactory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class PCFactory implements ComputerAbstractFactory {
    String ram, hdd, cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
