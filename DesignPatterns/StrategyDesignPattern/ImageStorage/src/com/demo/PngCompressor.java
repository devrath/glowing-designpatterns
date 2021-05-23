package com.demo;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println(fileName+" is compressed using Png compression technology");
    }
}
