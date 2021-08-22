package com.tang.controller;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component
@RequestMapping("/hello")
public class Hello{
    @GetMapping("/h1")
    @ResponseBody
    public String hello(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        return "哒哒哒";
    }


}
