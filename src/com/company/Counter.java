package com.company;

import java.util.ArrayList;

public class Counter <T> {

    private ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        this.list.add(item);
    }

    int getCount(){
        return this.ist.size();
    }
}
