package com.pkumar7.designpatterns.behavioral.command;

/**
 * Created by Pankaj Kumar on 12/December/2020
 */
class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("osName = " + osName);
        if(osName.equals("Windows 10")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
