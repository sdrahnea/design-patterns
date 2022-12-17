package com.designpatterns.creational.builder.animal;

public class Animal {

    private String color;
    private Integer age;
    private String type;
    private String sizeFoot;
    private Integer length;

    public static Animal builder() {
        return new Animal();
    }

    public Animal build(){
        return this;
    }

    public Animal sizeFoot(String sizeFoot) {
        this.sizeFoot = sizeFoot;
        return this;
    }

    public Animal length(Integer length) {
        this.length = length;
        return this;
    }

    public Animal color(String color) {
        this.color = color;
        return this;
    }

    public Animal age(Integer age){
        this.age = age;
        return this;
    }

    public Animal type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", sizeFoot='" + sizeFoot + '\'' +
                ", length=" + length +
                '}';
    }

}
