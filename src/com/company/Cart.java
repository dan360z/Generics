package com.company;

import java.util.ArrayList;

public class Cart<Box> implements Countable{

    private ArrayList<Box> cartContents = new ArrayList<>();


    public int getCount() {

        return this.cartContents.size();
    }

    public ArrayList<Box> getList() {
        return this.cartContents;
    }
}
