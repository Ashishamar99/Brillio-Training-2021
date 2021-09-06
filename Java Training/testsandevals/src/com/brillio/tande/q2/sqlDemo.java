package com.brillio.tande.q2;

import java.util.ArrayList;
import java.util.Arrays;

public class sqlDemo {
    public static void main(String[] args) throws Exception {
        sqlQuery sq = new sqlQuery();

        //1) Testing getTables.
        String query = "Select * from table1, table2, table3 where table1.id = 1 order by table3.sid, table2.sid";
        Arrays.stream(sq.getTables(query)).forEach(System.out::println);

        //2) getConditions.
        query = "Select * from table1, table2 where table1.sid = table2.sid";
        Arrays.stream(sq.getConditions(query)).forEach(System.out::println);

        //3) Testing getColumns.
        query = "SELECT TITLE,RENTAL_RATE,REPLACEMENT_COST,RATING FROM FILM \n" +
                "WHERE REPLACEMENT_COST >= (SELECT AVG(REPLACEMENT_COST) FROM FILM);";

        //CSV Thing.
        CsvReader csvr = new CsvReader();
        csvr.readCSV();

    }
}
