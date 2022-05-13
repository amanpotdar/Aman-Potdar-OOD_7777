package com.amanpotdar.librarymanagementsystem.controller;

import java.util.List;

import com.amanpotdar.librarymanagementsystem.entity.Author;
import com.amanpotdar.librarymanagementsystem.service.AthrSrvce;

class book_controller_test {

    @Test
    void hello11(){
        book_controller_test controller = new author_controller_test();
        String response2 =controller.hello(name:"World2");
        assertEquals(expected : "Hello, Aman", response);
    }
}