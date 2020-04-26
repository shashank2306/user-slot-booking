package com.example.slotBooking.bean;

import java.io.Serializable;

public class UserSlotBean {

    private Long id;

    private Long userId ;

    private Long allotedUserId;

    private String date;

    private String startTime;

    private String endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAllotedUserId() {
        return allotedUserId;
    }

    public void setAllotedUserId(Long allotedUserId) {
        this.allotedUserId = allotedUserId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
