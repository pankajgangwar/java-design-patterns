package com.pkumar7.designpatterns.creational.abstractfactory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
abstract class Computer {
    abstract String getRAM();
    abstract String getHDD();
    abstract String getCPU();

    @Override
    public String toString() {
        return "(RAM:" + getRAM() + ", HDD:" + getHDD() + ", CPU:" + getCPU() + ")";
    }
}
