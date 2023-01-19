package com.example.TestProj1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestProj1Controller {

    @GetMapping("/value/{num}")
    public Integer valueForPrimeNo(@PathVariable("num") Integer num) {
        if(num.equals(11))
            return num;
        throw new RuntimeException();
    }

}
