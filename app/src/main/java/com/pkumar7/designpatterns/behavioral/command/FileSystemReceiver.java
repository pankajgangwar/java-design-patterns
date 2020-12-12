package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
