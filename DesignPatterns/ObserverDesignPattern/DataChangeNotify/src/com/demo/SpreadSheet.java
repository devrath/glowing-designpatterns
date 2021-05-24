package com.demo;

public class SpreadSheet implements Observer{

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet class got notified "+dataSource.getValue());
    }
}
