package com.pkumar7.designpatterns.structural.bridge;

public class TVRemoteMute extends RemoteButton {

    EntertainmentDevice currentDevice;
    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
        currentDevice = newDevice;
    }

    @Override
    public void buttonNinePressed() {
        System.out.println( remoteName + " was muted ");
    }
}
