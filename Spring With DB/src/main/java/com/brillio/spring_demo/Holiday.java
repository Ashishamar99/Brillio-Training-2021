package com.brillio.spring_demo;

import com.brillio.jdbc_demo.SDetailsDTO;
import com.brillio.jdbc_demo.SchoolDAOB;

import java.util.Map;

//@Configuration
//@Component
public class Holiday {
    String holidayName, holidayDate;
    Map<String, SDetailsDTO> map;

    public Holiday(){
        try{
            map = new SchoolDAOB().getAllStudentsMap();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Holiday(String holidayName, String holidayDate) {

        try{
            map = new SchoolDAOB().getAllStudentsMap();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

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
