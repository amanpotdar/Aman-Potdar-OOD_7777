package com.amanpotdar.librarymanagementsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")  //http:
public class test_controller {

    @GetMapping("/ping")
    public String ping(){
        return new String("ping status success  whatever this might be there");
    }
}