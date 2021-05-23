package com.demo;

public class ImageStorage {

    private String fileLocation;
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(String fileLocation,Compressor compressor,Filter filter) {
        this.fileLocation = fileLocation;
        this.compressor = compressor;
        this.filter = filter;
    }

    public void storeImage() {
        compressor.compress(fileLocation);
        filter.apply(fileLocation);
    }

}
