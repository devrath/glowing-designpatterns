package com.demo;

public class Main {

    public static void main(String[] args) {
	    var imageStorage = new ImageStorage("C:file/Sdcard",
                                            new JpegCompressor(),new ColorFilter());
	    imageStorage.storeImage();
    }
}
