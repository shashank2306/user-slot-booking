package com.example.slotBooking.controller;


import com.example.slotBooking.bean.UserSlotBean;
import com.example.slotBooking.entity.UserSlotEntity;
import com.example.slotBooking.services.UserSlotService;
import com.example.slotBooking.validator.UserSlotValidator;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;
import java.util.List;

@RestController
public class UserSlotController {

    @Autowired
    UserSlotValidator validator;

    @Autowired
    UserSlotService service;

    @PostMapping("/slot-book")
    public Long create(@RequestBody UserSlotBean bean, Errors errors) {
        validator.validateOnSave(bean,errors);
        if(errors.hasErrors()){
            throw new ValidationException((Throwable) errors.getAllErrors());
        }
        UserSlotEntity entity = new UserSlotEntity();
        BeanUtils.copyProperties(bean,entity);
        return service.save(entity).getId();
    }

    @PostMapping("/slot-book/reject?{id}")
    public Long reject(@RequestBody UserSlotBean bean) {
        UserSlotEntity entity = new UserSlotEntity();
        BeanUtils.copyProperties(bean,entity);
        return service.delete(entity).getId();
    }

    @PostMapping("slots")
    public List<UserSlotEntity> slots(){
        List<UserSlotEntity> beans = service.findAll();
        return beans;
    }

}