package com.demo;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection tool selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }
}
