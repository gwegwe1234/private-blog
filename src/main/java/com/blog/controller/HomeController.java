package com.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HomeController {

    @RequestMapping(value="/", method=GET)
    public String home() {
        return "home";
    }
}
