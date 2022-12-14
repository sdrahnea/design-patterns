package com.designpatterns.creational.singleton;

public class DemoSingletonEnum {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue("SingletonEnum");
        System.out.println(singleton.getValue());
    }

}
