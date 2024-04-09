package com.hk.tldclick.common;

import java.util.ArrayList;
import java.util.List;

public class KeyGenerator {
    private String az = "abcdefghijklmnopqrstuvwxy";
    private char[] az_char;
    private String AZ = az.toUpperCase();
    private char[] AZ_char;
    private String nums = "0123456789";
    private char[] nums_char;
    private List<Integer> index = new ArrayList<>();
    private String allLetters;

    public KeyGenerator() {
        String key = "";
        int totalLength = az.length() + AZ.length() + nums.length();
        allLetters = az + AZ + nums;
        index.add(10);
        index.add(22);
        index.add(34);
        index.add(28);

        char[] allLettersArray = allLetters.toCharArray();







    }

    private List<Integer> getBase(Long val, int length) {
        List<Integer> baseList = new ArrayList<>();


        while (val > 0) {
            int base = (int) (val % length);
            baseList.add(base);
            val = val / length;
        }
        return baseList;
    }

    public String generateKey(int id) {
        // Long id = 3452123423L;
        List<Integer> base = getBase((long) id, 62);



        if (base.size() > 7) {
            throw new RuntimeException("Key length error");
        }

        // fill to 7 char
        while (base.size() < 7) {
            base.add(0);
        }


        StringBuilder key = new StringBuilder();

        for (int i : base) {
            char charLetter = allLetters.charAt(i);
            String letter = String.valueOf(charLetter);
            key.append(letter);
        }

        System.out.println(key.toString());


        return key.toString();
    }
}
