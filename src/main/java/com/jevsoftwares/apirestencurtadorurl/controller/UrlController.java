package com.jevsoftwares.apirestencurtadorurl.controller;

import com.jevsoftwares.apirestencurtadorurl.model.Url;
import com.jevsoftwares.apirestencurtadorurl.model.Urls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    @GetMapping(path = "api/status")
    public String status(){

        return "online";

    }

    @Autowired
    private Urls urls;

    @PostMapping("api/request/{url}")
    public String updateUser(@PathVariable String url) {

        Url urlModel = new Url();
        urlModel.setUrlOriginal(url);
        urlModel.setUrlCurta(url
                .replace("www","")
                .replace(".com","")
                .replace(".br",""));
        urls.save(urlModel);


    return "ret";
    }

}
