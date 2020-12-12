package com.pkumar7.designpatterns.creational.singleton;

/**
 * Created by Pankaj Kumar on 08/December/2020
 */
class Singleton {
    private static final Object lock = new Object();
    private static Singleton mInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        synchronized (lock){
            if(mInstance == null){
                mInstance = new Singleton();
            }
            return mInstance;
        }
    }
    public void printString(String s){
        System.out.println(s);
    }
}
