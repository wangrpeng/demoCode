package com.example.java8;

import com.alibaba.fastjson.JSON;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
       /* Arrays.asList("  Apple ", " pear ", " ORANGE", " BaNaNa ")
                .stream()
                .map(String::trim) // 去空格
                .map(String::toLowerCase) // 变小写
                .forEach(System.out::println); // 打印

        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> s2 = s.map(n -> n * n);

        int reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10).reduce(0, (acc, n) -> acc + n);
        System.out.println(reduce);
        Optional<Integer> reduce1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).reduce((acc, n) -> acc + n);
        if(reduce1.isPresent()){
            System.out.println(reduce1.get());
        }*/

        List<String> props = Arrays.asList("profile=native", "debug=true", "logging=warn", "interval=500");
        Map<String, String> map = props.stream()
                // 把k=v转换为Map[k]=v:
                .map(kv -> {
                    String[] ss = kv.split("\\=", 2);
                    return Collections.singletonMap(ss[0], ss[1]);
                })// 把所有Map聚合到一个Map:
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });

        // 打印结果:
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });

        Map<String, String> map2 = props.stream().collect(Collectors.toMap(p -> p.split("=")[0], p -> p.split("=")[1]));



        List<String> list = Arrays.asList("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);

    }









}
