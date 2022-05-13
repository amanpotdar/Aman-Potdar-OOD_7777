package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Author;
import com.amanpotdar.librarymanagementsystem.service.AthrSrvce;

class author_controller_test {

    @Test
    void hello11(){
        author_controller_test controller = new author_controller_test();
        String response1 =controller.hello(name:"World1");
        assertEquals(expected : "Hello, Aman", response);
    }
}