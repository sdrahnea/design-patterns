package com.designpatterns.structural.facade;

import java.io.File;

/**
 * buy from a site
 * call 112
 * create a company via an agency
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
