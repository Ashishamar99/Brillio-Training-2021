package com.brillio.jdbc_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SchoolDAOB {

    public void  insertStudentDetailsRecord(String sid, String fname, String lname, String dob, String address) throws Exception{
        Connection co = DBConnectivity.getConnection();
        PreparedStatement ps = co.prepareStatement("Insert into sdetails VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, sid);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setString(4, dob);
        ps.setString(5, address);

        ps.execute();

    }

    public List<SDetailsDTO> getAllStudents() throws Exception{
        Connection co = DBConnectivity.getConnection();
        PreparedStatement ps = co.prepareStatement("Select * from sdetails");
        ResultSet rs = ps.executeQuery();

        List<SDetailsDTO> ls = new ArrayList<>();
        while(rs.next()){
            ls.add(new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }

        return ls;
    }

    public List<SDetailsDTO> getAnyStudent(String sid) throws Exception{
        Connection co = DBConnectivity.getConnection();

        PreparedStatement ps = co.prepareStatement("Select * from sdetails where sid=?");
        ps.setString(1, sid);

        ResultSet rs = ps.executeQuery();

        List<SDetailsDTO> ls = new ArrayList<>();
        if(rs.next()){
            ls.add(new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        else{
            throw new Exception("Does not Exist");
        }

        return ls;
    }

    public void DeleteAnyStudent(String sid) throws Exception{
        Connection co = DBConnectivity.getConnection();

        PreparedStatement ps = co.prepareStatement("Delete from sdetails where sid=?");
        ps.setString(1, sid);
        ps.executeUpdate();
    }

    public void UpdateAnyStudent(String newSid, String newFname, String newLname, String newDob, String newAddress, String Oldsid) throws Exception{
        Connection co = DBConnectivity.getConnection();

        PreparedStatement ps = co.prepareStatement("Update sdetails set sid=?, fname=?, lname=?, dob=?, address=? where sid=?");

        ps.setString(1, newSid);
        ps.setString(2, newFname);
        ps.setString(3, newLname);
        ps.setString(4, newDob);
        ps.setString(5, newAddress);
        ps.setString(6, Oldsid);
        ps.executeUpdate();
    }

}
