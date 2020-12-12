package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class WriteFileCommand implements Command {

    FileSystemReceiver receiver;
    public WriteFileCommand(FileSystemReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.writeFile();
    }
}
