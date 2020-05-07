package com.example.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。
Stream API可以极大提供Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。


 */
public class StreamTest {

    /*
     * 等到流  ，筛选， 排序，聚合，映射等
    +--------------------+       +------+   +------+   +---+   +-------+
    | stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
    +--------------------+       +------+   +------+   +---+   +-------+
     */
    public static void main(String[] args) {

        //	生成流
        //stream() ：为集合创建串行流
        //parallelStream()：为集合创建并行流
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> filtered = strings.stream().
                filter(string -> !string.isEmpty()).collect(Collectors.toList());

        //forEach()
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        //map() 映射每个元素到对应的结果
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().
                collect(Collectors.toList());
        System.out.println(squaresList);

        //filter(),通过设置条件过滤元素
        List<String> strList = Arrays.asList("", "a", "b", "c", "", "d");
        long count = strList.stream().filter(string -> string.isEmpty()).count();
        List<String> strList2 = strList.stream().filter(string -> !string.isEmpty()).
                collect(Collectors.toList());
        System.out.println(count);
        System.out.println(strList2);

        //limit()用于获取指定数量的流
        Random random2 = new Random();
        random2.ints().limit(4).forEach(System.out::println);

        //sorted()对流进行排序
        Random random3 = new Random();
        random3.ints().limit(5).sorted().forEach(System.out::println);

        //Collectors类

//		IntSummaryStatistics 统计工具类  主要用于int、double、long等基本类型上，
        List<Integer> numbersList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbersList.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());


    }


}















