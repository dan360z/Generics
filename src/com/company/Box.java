package com.company;

import java.util.ArrayList;

public class Box<T> implements Countable{

    private ArrayList<T> contents = new ArrayList<>();

    void add(T item){
        this.contents.add(item);
    }

    public int getCount(){
        return this.contents.size();
    }
}
