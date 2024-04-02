package com.hk.tldclick.controllers;

import com.hk.tldclick.common.URLShortener;
import com.hk.tldclick.dao.LinkDAO;
import com.hk.tldclick.entity.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

// @RestController
@Controller
@RequestMapping("/api")
public class TldClickController {

    private URLShortener urlShortener;
    private LinkDAO linkDAO;

    @Autowired
    public TldClickController(URLShortener urlShortener, LinkDAO linkDAO) {
        this.urlShortener = urlShortener;
        this.linkDAO = linkDAO;
    }

    @GetMapping("/main")
    public String getTldClick(Model model) {
        List<Link> myLink = linkDAO.findAll();
        for (Link link : myLink) {
            System.out.println(link);
        }

        String val = "This is my text";
        model.addAttribute("myText", val);
        model.addAttribute("link", new Link());


        return "main";
    }

    @PostMapping("/create")
    public String createLink(@ModelAttribute("link") Link submittedLink, Model model) {
        String fullLink = "full link";
        String linkKey = "1234567";
        Integer createdBy = 1010;
        Timestamp expiration = Timestamp.from(Instant.now());
        Link link = new Link(fullLink, linkKey, createdBy, expiration);
        link.setCreated(expiration);
        link.setDeleted(expiration);

        System.out.println("submitted: " + submittedLink);
        submittedLink.setLinkKey(linkKey);
        submittedLink.setCreatedBy(1234);
        submittedLink.setExpiration(expiration);
        submittedLink.setCreated(expiration);
        submittedLink.setDeleted(expiration);
        submittedLink.setActive(true);
        linkDAO.save(submittedLink);

        model.addAttribute("link", submittedLink);

        return "create-confirm";

    }

}
