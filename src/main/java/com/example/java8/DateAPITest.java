package com.example.java8;

import java.time.ZoneId;

public class DateAPITest {

    public static void main(String[] args) {
        /*
         * Local
         * Zone
         * */
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneId id = zoneId.systemDefault();
        System.out.println(id);
    }

}
