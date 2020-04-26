package com.example.slotBooking.validator;

import com.example.slotBooking.bean.UserSlotBean;
import com.example.slotBooking.entity.AuthUserEntity;
import com.example.slotBooking.services.AuthUserService;
import com.example.slotBooking.services.UserSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class UserSlotValidator {

    @Autowired
    AuthUserService service;

    public void validateOnSave(UserSlotBean bean, Errors errors) {
        if(service.findUser(bean.getAllotedUserId())==null && service.findUser(bean.getUserId())==null){
            errors.reject("PLEASE CHECK BOTH USER ID ENTERED");
        }
    }
}
