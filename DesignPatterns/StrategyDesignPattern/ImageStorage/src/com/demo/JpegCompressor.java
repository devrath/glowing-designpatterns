package com.demo;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println(fileName+" is compressed using Jpeg compression technology");
    }
}
