package com.company.;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Location> nodes = new ArrayList<Location>();

    public void addLocation(Location node) {
        nodes.add(node);
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "City [nodes=" + nodes + "]";
    }


}