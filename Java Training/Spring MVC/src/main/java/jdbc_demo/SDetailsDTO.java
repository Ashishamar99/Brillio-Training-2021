package com.brillio.jdbc_demo;

public class SDetailsDTO {
    private String sid, fname, lname, dob, address;

    public SDetailsDTO(String sid, String fname, String lname, String dob, String address){
        super();
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SDetailsDTO{" +
                "sid='" + sid + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
