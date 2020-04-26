package com.example.slotBooking.entity;

import com.example.slotBooking.constants.UserSlotConstants;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = UserSlotConstants.TABLE_NAME)
public class UserSlotEntity implements Serializable, UserSlotConstants {

    private static final long serialVersionUID = 1425225950358080744L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ID, nullable = false)
    private Long id;

    @Column(name = USER_ID)
    private Long userId ;

    @Column(name = ALLOTED_USER_ID)
    private Long allotedUserId;

    @Column(name = DATE)
    private String date;

    @Column(name = START_TIME)
    private String startTime;

    @Column(name = END_TIME)
    private String endTime;

    @Column(name =STATUS)
    private Integer status = 1;

    @Column(name = FLAG)
    private Integer flag = 1;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
