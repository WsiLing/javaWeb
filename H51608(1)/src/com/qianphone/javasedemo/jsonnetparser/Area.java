package com.qianphone.javasedemo.jsonnetparser;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/1/6.
 */
public class Area {

    private int category;
    private ArrayList<Country> destinations;

    public Area() {
    }

    public Area(int category, ArrayList<Country> destinations) {
        this.category = category;
        this.destinations = destinations;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public ArrayList<Country> getDestinations() {
        return destinations;
    }

    public void setDestinations(ArrayList<Country> destinations) {
        this.destinations = destinations;
    }
}
