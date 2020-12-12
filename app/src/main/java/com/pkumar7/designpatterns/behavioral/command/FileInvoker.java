package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class FileInvoker {
    public Command command;
    public FileInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
