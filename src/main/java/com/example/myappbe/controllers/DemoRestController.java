package com.example.myappbe.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public")
@CrossOrigin(origins = "*")
public class DemoRestController {
    @GetMapping("demo")
    public ResponseEntity<?> HelloYou() {
        return new ResponseEntity<>("Xin chào bạn tới với ứng dụng của tôi!", HttpStatus.OK);
    }
}
