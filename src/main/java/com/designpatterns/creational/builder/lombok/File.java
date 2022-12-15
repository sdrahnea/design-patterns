package com.designpatterns.creational.builder.lombok;

import lombok.Builder;

import java.util.Arrays;

@Builder
public class File {

    private String title;
    private String path;
    private byte[] content;

    @Override
    public String toString() {
        return "File{" +
                "title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }
}
