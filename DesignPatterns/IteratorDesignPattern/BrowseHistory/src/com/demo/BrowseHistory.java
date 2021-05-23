package com.demo;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    /**
     * Add a new url into the collection
     * @param url
     */
    public void push(String url) {
        urls.add(url);
    }

    /**
     * Remove the element from the collection
     * First store the element in a local variable that can be returned and then remove from the collection
     * @return
     */
    public String pop(){
        int lastIndex = urls.size()-1;
        String elementToBeRemoved = urls.get(lastIndex);
        urls.remove(elementToBeRemoved);
        return elementToBeRemoved;
    }

    public Iterator createIterator(){
        return  new HistoryIterator(this);
    }

    public class HistoryIterator implements Iterator {

        // This is the history object that the iterator will iterate
        private BrowseHistory history;
        // There should be a index to keep track of the url's we are iterating
        private int index;

        public HistoryIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
