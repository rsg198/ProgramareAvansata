package com.company;

import java.time.LocalTime;

public class Museum extends Location implements Visitable, Payable {
    private LocalTime openingTime, closingTime;

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    private double ticketPrice;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }
    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;

    }
    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

}
