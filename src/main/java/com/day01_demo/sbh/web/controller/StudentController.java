package com.day01_demo.sbh.web.controller;

import com.day01_demo.sbh.util.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("/add")
    public String add(){

        return "添加成功！";
    }
}
