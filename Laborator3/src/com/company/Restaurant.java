package com.company;

public class Restaurant extends Location implements Classifiable{
    private int rank;

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return rank;
    }


}
