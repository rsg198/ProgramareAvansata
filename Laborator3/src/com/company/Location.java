package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private String name;
    protected Map<Location, Integer> cost = new HashMap<>();
    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

