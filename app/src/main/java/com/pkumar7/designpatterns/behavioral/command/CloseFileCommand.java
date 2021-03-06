package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class CloseFileCommand implements Command {
    private FileSystemReceiver receiver;
    public CloseFileCommand(FileSystemReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.closeFile();
    }
}
