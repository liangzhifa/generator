package com.mybatis.generator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        System.out.println(set);
        String identifitions = set.toString().replaceAll("\\[|\\]| ", "").trim();
        System.out.println(identifitions);

    }
}
