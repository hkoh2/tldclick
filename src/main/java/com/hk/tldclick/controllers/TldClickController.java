package com.hk.tldclick.controllers;

import com.hk.tldclick.common.URLShortener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class TldClickController {

    private URLShortener urlShortener;

    @Autowired
    public TldClickController(URLShortener urlShortener) {
        this.urlShortener = urlShortener;
    }

    @GetMapping("/getURL")
    @ResponseBody
    public String getTldClick() {
        return urlShortener.getShortURL();
    }

}
