package com.designpatterns.creational.singleton;

public enum SingletonEnum {
    INSTANCE;

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
