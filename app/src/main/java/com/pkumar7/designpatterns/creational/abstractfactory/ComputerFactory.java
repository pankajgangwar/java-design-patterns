package com.pkumar7.designpatterns.creational.abstractfactory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
