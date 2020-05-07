package com.example.java8;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestAnyMatch {

    public static void main(String[] args) {


        Stream s = Constant.FILTER_URI.stream();


        if (Constant.FILTER_URI.stream().anyMatch(e -> "/credit/face/senseTimeLivness".contains(e))) {
            System.out.println("args");
        } else {
            System.out.println("not args");
        }
//        System.out.println("/credit/face/senseTimeLivness".contains("/credit/face/"));

        Map<String, Object> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("b", 2);
        System.out.println(testMap.get("c"));

        File file = new File("");

        boolean isFile = file != null;
//        System.out.println(isFile);


        List<String> list = new ArrayList(2);
        list.toArray(new String[0]);
        list.toArray();

        String str = "cn";
        System.out.println(str == "cn" ? "zh" : str);


    }
}
