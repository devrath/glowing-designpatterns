package com.demo;

public class SpreadSheet implements Observer{
    @Override
    public void update() {
        System.out.println("SpreadSheet class got notified");
    }
}
