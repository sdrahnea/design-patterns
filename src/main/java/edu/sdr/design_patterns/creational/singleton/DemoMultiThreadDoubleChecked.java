package edu.sdr.design_patterns.creational.singleton;

public class DemoMultiThreadDoubleChecked {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        Thread threadBar3 = new Thread(new ThreadBar3());
        threadFoo.start();
        threadBar.start();
        threadBar3.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            DoubleCheckedSingleton singleton = DoubleCheckedSingleton.getInstance("thread-1");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            DoubleCheckedSingleton singleton = DoubleCheckedSingleton.getInstance("thread-2");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar3 implements Runnable {
        @Override
        public void run() {
            DoubleCheckedSingleton singleton = DoubleCheckedSingleton.getInstance("thread-3");
            System.out.println(singleton.value);
        }
    }


}
