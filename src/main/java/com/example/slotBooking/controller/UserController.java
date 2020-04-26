package com.example.slotBooking.controller;


import com.example.slotBooking.bean.AuthUserBean;
import com.example.slotBooking.bean.User;
import com.example.slotBooking.entity.AuthUserEntity;
import com.example.slotBooking.services.AuthUserService;
import com.example.slotBooking.validator.AuthUserValidator;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    AuthUserValidator validator;

    @Autowired
    AuthUserService authUserService;

    @PostMapping("user")
    public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {

        String token = getJWTToken(username);
        User user = new User();
        user.setUser(username);
        user.setToken(token);
        return user;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody AuthUserBean bean, Errors errors) {
        AuthUserEntity entity = new AuthUserEntity();
        BeanUtils.copyProperties(bean, entity);
        validator.validateOnSave(entity, errors);
        String token = getJWTToken(entity.getUsername());
        entity.setToken(token);
        authUserService.createUser(entity, entity.getPassword());
        return token;
    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }

}