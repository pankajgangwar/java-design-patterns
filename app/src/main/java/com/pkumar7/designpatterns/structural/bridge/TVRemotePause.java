package com.pkumar7.designpatterns.structural.bridge;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println(remoteName + " was Paused ");
    }
}
