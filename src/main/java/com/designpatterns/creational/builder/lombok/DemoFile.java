package com.designpatterns.creational.builder.lombok;

import java.nio.charset.StandardCharsets;

public class DemoFile {

    public static void main(String... args) {
        File file = File.builder()
                .title("File Title")
                .path("c:\\file.txt")
                .content("content".getBytes(StandardCharsets.UTF_8))
                .build();

        System.out.println("" + file);

        /**
        **   STANDARD WAY   **
        File file = new File();
        file.setTitle(...);
        file.setPath(...);
        file.setContent(...);
        */

    }

}
