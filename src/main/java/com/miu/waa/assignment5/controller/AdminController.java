package com.miu.waa.assignment5.controller;

import com.miu.waa.assignment5.domain.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping
    public String getAdmin(){
        return "This is admin";
    }
}
