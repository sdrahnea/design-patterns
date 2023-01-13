package edu.sdr.design_patterns.creational.singleton;

public class DoubleCheckedSingleton {
    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile DoubleCheckedSingleton instance;

    public String value;

    private DoubleCheckedSingleton(String value) {
        this.value = value;
    }

    public static DoubleCheckedSingleton getInstance(String value) {
        DoubleCheckedSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(DoubleCheckedSingleton.class) {
            if (instance == null) {
                instance = new DoubleCheckedSingleton(value);
            }
            return instance;
        }
    }
}
