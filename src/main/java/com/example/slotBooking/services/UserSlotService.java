package com.example.slotBooking.services;

import com.example.slotBooking.bean.UserSlotBean;
import com.example.slotBooking.entity.UserSlotEntity;

import java.util.List;


public interface UserSlotService {


    UserSlotEntity save(UserSlotEntity entity);

    List<UserSlotEntity> findAll();

    UserSlotBean delete(UserSlotEntity entity);
}
