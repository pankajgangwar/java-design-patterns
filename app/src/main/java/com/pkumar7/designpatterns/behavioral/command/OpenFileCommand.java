package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;
    public OpenFileCommand(FileSystemReceiver receiver){
        fileSystemReceiver = receiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}
