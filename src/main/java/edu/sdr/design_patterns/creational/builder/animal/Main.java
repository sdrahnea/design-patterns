package edu.sdr.design_patterns.creational.builder.animal;

public class Main {

    public static void main(String... arg) {
        Animal animal = Animal.builder()
                .type("Type 1")
                .age(123)
                .color("RED")
                .build();
        System.out.println(animal.toString());

        Animal animal2 = Animal.builder()
                .type("Type 2")
                .age(123)
                .build();
        System.out.println(animal2.toString());
    }

}
