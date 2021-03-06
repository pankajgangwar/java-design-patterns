package com.pkumar7.designpatterns.creational.factory;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    String getRAM() {
        return ram;
    }

    @Override
    String getHDD() {
        return hdd;
    }

    @Override
    String getCPU() {
        return cpu;
    }
}
