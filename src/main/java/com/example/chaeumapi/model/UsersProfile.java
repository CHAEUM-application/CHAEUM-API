package com.example.chaeumapi.model;

import java.sql.Date;

public class UsersProfile {
    private String c_name;
    private String c_id;
    private String c_pw;
    private Date c_date;

    public UsersProfile(String c_name, String c_id, String c_pw, Date c_date) {
        super();
        this.c_name = c_name;
        this.c_id = c_id;
        this.c_pw = c_pw;
        this.c_date = c_date;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_pw() {
        return c_pw;
    }

    public void setC_pw(String c_pw) {
        this.c_pw = c_pw;
    }

    public Date getC_date() {
        return c_date;
    }

    public void setC_date(Date c_date) {
        this.c_date = c_date;
    }
}
