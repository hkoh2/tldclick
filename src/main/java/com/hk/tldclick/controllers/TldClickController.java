package com.hk.tldclick.controllers;

import com.hk.tldclick.common.URLShortener;
import com.hk.tldclick.dao.LinkDAO;
import com.hk.tldclick.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController
@Controller
public class TldClickController {

    private URLShortener urlShortener;
    private LinkDAO linkDAO;

    @Autowired
    public TldClickController(URLShortener urlShortener, LinkDAO linkDAO) {
        this.urlShortener = urlShortener;
        this.linkDAO = linkDAO;
    }

    @GetMapping("/getURL")
    public String getTldClick() {
        List<Link> myLink = linkDAO.findAll();
        for (Link link : myLink) {
            System.out.println(link);
        }



        return "main";
    }

}
