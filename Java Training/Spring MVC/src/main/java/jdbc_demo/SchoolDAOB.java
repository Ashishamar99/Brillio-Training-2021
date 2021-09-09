package jdbc_demo;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolDAOB {

    public void  insertStudentDetailsRecord(SDetailsDTO dtoAdd) throws Exception{
        Connection co = jdbc_demo.DBConnectivity.getConnection();

        PreparedStatement ps = co.prepareStatement("Insert into sdetails (sid, fname, lname, dob, address) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, dtoAdd.getSid());
        ps.setString(2, dtoAdd.getFname());
        ps.setString(3, dtoAdd.getLname());
        ps.setString(4, dtoAdd.getDob());
        ps.setString(5, dtoAdd.getAddress());

        ps.executeUpdate();

    }
//
//    public List<SDetailsDTO> getAllStudents() throws Exception{
//        Connection co = jdbc_demo.DBConnectivity.getConnection();
//        PreparedStatement ps = co.prepareStatement("Select * from sdetails");
//        ResultSet rs = ps.executeQuery();
//
//        List<SDetailsDTO> ls = new ArrayList<>();
//        while(rs.next()){
//            ls.add(new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
//        }
//
//        return ls;
//    }

    public static SDetailsDTO getAnyStudent(String sid) throws Exception{
        Connection co = jdbc_demo.DBConnectivity.getConnection();

        PreparedStatement ps = co.prepareStatement("Select * from sdetails where sid=?");
        ps.setString(1, sid);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            return new SDetailsDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
        }
        else{
            throw new Exception("Does not Exist");
        }
    }
//
//    public void DeleteAnyStudent(String sid) throws Exception{
//        Connection co = jdbc_demo.DBConnectivity.getConnection();
//
//        PreparedStatement ps = co.prepareStatement("Delete from sdetails where sid=?");
//        ps.setString(1, sid);
//        ps.executeUpdate();
//    }
//
//    public void UpdateAnyStudent(String newSid, String newFname, String newLname, String newDob, String newAddress, String Oldsid) throws Exception{
//        Connection co = jdbc_demo.DBConnectivity.getConnection();
//
//        PreparedStatement ps = co.prepareStatement("Update sdetails set sid=?, fname=?, lname=?, dob=?, address=? where sid=?");
//
//        ps.setString(1, newSid);
//        ps.setString(2, newFname);
//        ps.setString(3, newLname);
//        ps.setString(4, newDob);
//        ps.setString(5, newAddress);
//        ps.setString(6, Oldsid);
//        ps.executeUpdate();
//    }

}
