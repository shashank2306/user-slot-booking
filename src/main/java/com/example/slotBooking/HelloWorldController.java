package com.example.slotBooking;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @PostMapping("hello")
    public String helloWorld(@RequestParam(value="name", defaultValue="World") String name, Authentication authentication) {
        System.out.println(authentication.getName());
        return "Hello "+name+"!!";
    }
}
