package com.hk.tldclick.common;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class URLShortener {

    private String az = "abcdefghijklmnopqrstuvwxy";
    private String AZ = az.toUpperCase();
    private String nums = "0123456789";
    private List<Integer> index = new ArrayList<>();

    public URLShortener() {
    }

    public String getShortURL() {
        return "http://www.tldclick.com/aaaa";
    }
}
