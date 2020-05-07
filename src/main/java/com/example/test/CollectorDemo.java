package com.example.test;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.example.test.ImmutableSetCollector.toImmutableSet;
import static java.util.stream.Collectors.*;


/**
 * @Author: Simon.Wang
 * @Date: 2019/11/21 3:24
 * @Describe:
 */
public class CollectorDemo {


    public static void main(String[] args) {
        // toList
        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd", "dd", "e");
        List<String> result = givenList.stream().collect(toList());
        // toSet
        Set<String> result1 = givenList.stream().collect(Collectors.toSet());

        // list 转set时候自动去重
        // Set result3 = givenList.stream().collect(Collectors.toSet());

        //to LinkedList
        givenList.stream().collect(toCollection(LinkedList::new));


        // to map  givenList不能有重复元素 否则抛出异常IllegalStateException
//        Map<String, Integer> result4 = givenList.stream().collect(toMap(Function.identity(), String::length));
//        System.out.println(result4.toString());

        //解决方案
        Map<String, Integer> result5 = givenList.stream()
                .collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));
        System.out.println(result5.toString());

//        List<String> result6 = givenList.stream()
//                .collect(collectingAndThen(toList(), ImmutableList::copyOf));

        String result7 = givenList.stream().collect(joining());
        String result8 = givenList.stream().collect(joining(" ", "PRE-", "-POST"));
//        System.out.println(result8);


        Long result9 = givenList.stream().collect(counting());
//        System.out.println(result9);


        DoubleSummaryStatistics result10 = givenList.stream()
                .collect(summarizingDouble(String::length));
//        System.out.println(result10);


        Optional<String> result11 = givenList.stream().collect(maxBy(Comparator.naturalOrder()));
//        System.out.println(result11.get());

        Map result12 = givenList.stream().collect(groupingBy(String::length, Collectors.toSet()));
//        System.out.println(result12.toString());

        Map<Boolean, List<String>> result13 = givenList.stream().collect(partitioningBy(item -> item.length() > 2));
//        System.out.println(result13);


//        自定义 ImmutableSetCollector
        ImmutableSet<String> result14 = givenList.stream().collect(toImmutableSet());
        System.out.println(result14);


    }


}


/**
 * 自定义 ImmutableSetCollector
 */
class ImmutableSetCollector<T> implements Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>> {

    @Override
    public Supplier<ImmutableSet.Builder<T>> supplier() {
        return ImmutableSet::builder;
    }

    @Override
    public BiConsumer<ImmutableSet.Builder<T>, T> accumulator() {
        return ImmutableSet.Builder::add;
    }

    @Override
    public BinaryOperator<ImmutableSet.Builder<T>> combiner() {
        return (left, right) -> left.addAll(right.build());
    }

    @Override
    public Function<ImmutableSet.Builder<T>, ImmutableSet<T>> finisher() {
        return ImmutableSet.Builder::build;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Sets.immutableEnumSet(Characteristics.UNORDERED);
    }

    public static <T> ImmutableSetCollector<T> toImmutableSet() {
        return new ImmutableSetCollector<>();
    }

}


