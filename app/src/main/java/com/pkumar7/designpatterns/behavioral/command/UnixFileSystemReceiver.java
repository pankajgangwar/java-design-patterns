package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println(" Opening a file in Unix OS ");
    }

    @Override
    public void writeFile() {
        System.out.println(" Writing to a file in Unix OS ");
    }

    @Override
    public void closeFile() {
        System.out.println(" Closing a file in Unix OS ");
    }
}
