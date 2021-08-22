package com.tang.controller;

import java.util.HashMap;

public class Hello01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("dada","yaya");

        System.out.println(map.get("dada"));
    }
}
