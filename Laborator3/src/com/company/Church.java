package com.company;

import java.time.LocalTime;

public class Church extends Location implements Visitable {
    private LocalTime openingTime;
    private LocalTime closingTime;

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }
    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }


}
