package com.brillio.spring_demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
//@Component
public class Holiday {
    String holidayName, holidayDate;

    public Holiday() {
    }

    public Holiday(String holidayName, String holidayDate) {
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    void display(){
        System.out.println("\nHoliday Name = " + this.holidayName + "\nHoliday Date = " + this.holidayDate);
    }
}
