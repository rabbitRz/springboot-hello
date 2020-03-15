package com.day01_demo.sbh.web.controller;

import com.day01_demo.sbh.bean.carton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String get(){
        return "helloworld";
    }
    @PostMapping("/kl")
    public String post(){
        return "post";
    }
    @GetMapping("/test1")
    public Map<String,String> test1(){
        Map<String,String> map=new HashMap<>();
        map.put("动漫","杀戮天使");
        map.put("特点","红秋裤");
        return map;
    }
    @GetMapping("/test2")
    public List<Map<String,String>> test2(){
        Map<String,String> map=new HashMap<>();
        Map<String,String> map1=new HashMap<>();
        map.put("动漫","杀戮天使");
        map.put("特点","红秋裤");
        map.put("动漫","弹丸论破");
        map1.put("特点","黑白熊");
        List<Map<String,String>> list=new ArrayList<>();
        list.add(map);
        list.add(map1);
        return list;
    }
    @GetMapping("/test3")
    public carton test3(){
        carton c=new carton();
        c.setName("狐妖小红娘");
        c.setDesc("东方月初");
        return c;
    }
    @GetMapping("/test4")
    public String test4(String name,int age){
        System.out.println("name:"+name+",age:"+age);
        return "打印成功！";
    }
    @GetMapping("/test5")
    public String test5(carton c){
        System.out.println(c);
        return "动漫集锦";
    }
}
