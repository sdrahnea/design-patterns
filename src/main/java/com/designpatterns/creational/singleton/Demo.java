package com.designpatterns.creational.singleton;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Demo {

    public static void main(String... arg) {
        Singleton singleton = Singleton.getInstance("TEST");
        System.out.println(singleton.value);

        System.out.println("Al doilea obiect!!!");
        Singleton.getInstance("TEST2");
        System.out.println(singleton.value);

        System.out.println("Al 3 obiect!!!");
        Singleton.getInstance("TEST3");
        System.out.println(singleton.value);

        System.out.println("Al 4 obiect!!!");
        Singleton.getInstance("TEST4");
        System.out.println(singleton.value);

    }

}
