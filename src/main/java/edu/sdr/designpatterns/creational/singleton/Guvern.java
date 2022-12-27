package edu.sdr.designpatterns.creational.singleton;

public class Guvern {

    private static Guvern instance;

    public String value;

    private Guvern(String value) {
        this.value = value;
    }

    public static Guvern getInstance(String value) {
        if (instance == null) {
            instance = new Guvern(value);
        }
        return instance;
    }

}
