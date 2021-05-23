package com.demo;

public class ColorFilter implements Filter{
    @Override
    public void apply(String fileLocation) {
        System.out.println("For file at location: "+fileLocation+" black and white filter is applied");
    }
}
