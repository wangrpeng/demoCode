package com.example.java8;

import com.google.common.collect.Lists;

import java.sql.Array;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)     {
        Stream<Long> s1 = Stream.generate(new NatualSupplier());
        Stream<Long> s2 = s1.map(n -> n * n);
        Stream<Long> s3 = s2.map(n -> n - 1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.toArray(String[]::new);
        new String();
    }

}

class NatualSupplier implements Supplier<Long> {

    long n = 0;
    public Long get() {
        System.out.println("-------------");
        n++;
        return n;
    }
}


