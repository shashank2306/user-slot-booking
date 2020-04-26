package com.example.slotBooking.validator;

import com.example.slotBooking.entity.AuthUserEntity;
import com.example.slotBooking.services.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class AuthUserValidator {

    @Autowired
    AuthUserService service;

    public void validateOnSave(AuthUserEntity entity, Errors errors) {
        if(!errors.hasErrors()){

        }
    }
}
