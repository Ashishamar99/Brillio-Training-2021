package com.brillio.tande.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class sqlQuery {
//    public String[] getTables(String qs) {
//        String sub[] = qs.split("from ");
//        String[] tables;
//
//        if(sub[1].contains(",")){
//            String[] interRes = sub[1].split(",");
//
//            if(sub[1].contains("orderby")){
//                int skipIndex = qs.indexOf("orderby");
//                int fi = qs.indexOf("from");
//
////                System.out.println("asfsdgsdgdsg" + qs.substring(fi + 4, skipIndex));
//                tables = qs.substring(fi + 4, skipIndex).split(",");
//            }
//            else{
//                tables = interRes;
//            }
//
//            if(sub[1].contains("where")){
//                int skipIndex = qs.indexOf("where");
//                int fi = qs.indexOf("from");
//
//                tables = qs.substring(fi + 4, skipIndex).split(",");
//            }
//            else if(!sub[1].contains("order by")){
//                tables = interRes;
//            }
//
//        }
//        else{
//            String tableName = sub[1].split(" ")[0];
//            tables = new String[] {tableName};
//        }
//        return tables;
//    }

    public String[] getTables(String qs) {
        int fi = qs.indexOf("from") + 4;
        int to;
        if(qs.contains("where")) {
            to = qs.indexOf("where");
        } else if(qs.contains("order by")) {
            to = qs.indexOf("order by");
        } else if(qs.contains("group by")) {
            to = qs.indexOf("group by");
        } else {
            to = qs.length();
        }
        return qs.substring(fi, to).split(",");
    }

    public Map<String, List> getColumns(String queryString){
        return null;
    }

    public String[] getConditions(String queryString) {

        String query, fromWhere, fromGroupBy, fromOderBy;
        if (queryString.contains("where")){
            fromWhere = queryString.split("where")[1].trim();
            fromGroupBy = fromWhere.split("group by")[0].trim();
            fromOderBy = fromGroupBy.split("order by")[0].trim();

            query = fromOderBy.toLowerCase().trim();

            return query.split(" and | or ");
        }
        return null;
    }
    
}
