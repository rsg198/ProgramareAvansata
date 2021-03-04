package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Hotel v1 = new Hotel();
        v1.setRank(5);
        Museum v2 = new Museum();
        v2.setName("Museum 1");
        v2.setOpeningTime(LocalTime.of(9, 30));
        v2.setClosingTime(LocalTime.parse("17:00"));
        v2.setTicketPrice(20);
        Museum v3 = new Museum();
        v3.setName("Museum 2");
        v3.setOpeningTime(LocalTime.of(10, 00));
        v3.setClosingTime(LocalTime.parse("19:00"));
        v3.setTicketPrice(15);
        Church v4 = new Church();
        v4.setName("Church 1");
        v4.setOpeningTime(LocalTime.of(7, 00));
        v4.setClosingTime(LocalTime.parse("21:00"));
        Church v5 = new Church();
        v5.setName("Church 2");
        v5.setOpeningTime(LocalTime.of(8, 00));
        v5.setClosingTime(LocalTime.parse("22:00"));
        Restaurant v6 = new Restaurant();
        v6.setRank(2);
        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v6, 20);
    }

}