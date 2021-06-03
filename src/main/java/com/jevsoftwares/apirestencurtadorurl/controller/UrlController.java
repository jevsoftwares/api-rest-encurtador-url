package com.jevsoftwares.apirestencurtadorurl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    @GetMapping(path = "api/status")
    public String status(){

        return "online";

    }


    @PostMapping("api/request/{url}")
    public String updateUser(@PathVariable String url) {

        if (url != null){

        }

    return "ret";
    }

}
