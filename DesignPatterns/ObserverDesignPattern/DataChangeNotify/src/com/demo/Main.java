package com.demo;

public class Main {

    public static void main(String[] args) {

        var dataSource = new DataSource();
        var sheet = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet);
        dataSource.addObserver(chart);

        dataSource.setValue(10);
    }
}
