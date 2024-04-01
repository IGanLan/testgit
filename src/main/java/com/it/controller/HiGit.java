package com.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiGit {

    @GetMapping("/cc")
    public void git(){
        System.out.println(1);
    }
}
