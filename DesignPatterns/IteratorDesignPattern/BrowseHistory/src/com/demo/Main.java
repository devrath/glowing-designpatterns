package com.demo;

public class Main {

    public static void main(String[] args) {
	    var history = new BrowseHistory();
	    history.push("www.Google.com");
        history.push("www.Yahoo.com");
        history.push("www.Bing.com");
        history.push("www.Facebook.com");


        var historyIterator = history.createIterator();

        while(historyIterator.hasNext()){
            var url = historyIterator.current();
            System.out.println(url);
            historyIterator.next();
        }

    }

}
