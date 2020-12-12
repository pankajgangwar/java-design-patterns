package com.pkumar7.designpatterns.creational.builder;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class Computer {
    private String ram, hdd;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getRam() {
        return ram;
    }
    public String getHdd() {
        return hdd;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("RAM:").append(ram).append(",\t");
        out.append("HDD:").append(hdd).append(",\t");
        out.append("isBluetoothEnabled:").append(isBluetoothEnabled).append(",\t");
        out.append("isGraphicsCardEnabled:").append(isGraphicsCardEnabled).append(",\t");
        return out.toString();
    }

    private Computer(ComputerBuilder builder){
        hdd = builder.hdd;
        ram = builder.ram;
        isBluetoothEnabled = builder.isBluetoothEnabled;
        isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder {
        private String ram, hdd;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        public ComputerBuilder(String ram, String hdd){
            this.ram = ram;
            this.hdd = hdd;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
