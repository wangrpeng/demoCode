package com.example.java8;

import org.apache.commons.math3.primes.Primes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 集合之流式操作
 串行和并行的流
 流有串行和并行两种，串行流上的操作是在一个线程中依次完成，而并行流则是在多个线程上同时执行。并行与串行的流可以相互切换：
 通过 stream.sequential() 返回串行的流，通过 stream.parallel()
  返回并行的流。相比较串行的流，并行的流可以很大程度上提高程序的执行效率。
  流式操作实现了集合的过滤、排序、映射、聚合等功能。
 */
public class CollectionOperate {

    public static void main(String[] args) {
//		下面是分别用串行和并行的方式对集合进行排序
//		串行排序：
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            list.add(num + "");
        }
        long start = System.nanoTime();
        list.stream().forEach(System.out::println);
        int count = (int) ((Stream) list.stream().sequential()).sorted().count();
        list.stream().sorted().forEach(p -> System.out.println(p));

        long end = System.nanoTime();
        System.out.println(count);
        System.out.println(end - start + "ms");

//		并行排序：
        int count2 = (int) list.stream().parallel().sorted().count();
        //or
        int count3 = (int) ((Stream) list.stream().parallel()).sorted().count();


        //中间操作
//		filter()：对元素进行过滤；
//		sorted()：对元素排序；
//		map()：元素的映射；
//		distinct()：去除重复元素；
//		subStream()：获取子 Stream 等。
        List<String> strList = Arrays.asList("s", "s1", "e", "f");
        strList.stream().filter((p) -> p.startsWith("s")).
                forEach((s) -> System.out.println(s));
//		这里的 filter(...) 就是一个中间操作，该中间操作可以链式地应用其他 Stream 操作。

//		终止操作
//		一旦被调用，Stream 就到了一个终止状态，而且不能再使用了。
//		orEach()：对每个元素做处理；
//		toArray()：把元素导出到数组；
//		findFirst()：返回第一个匹配的元素；
//		anyMatch()：是否有匹配的元素等。


//		Map()
        List<String> list1 = Arrays.asList("aa", "dd", "ee", "bb", "");
        List<String> list2;
        list2 = list1.stream().filter(p -> !p.isEmpty()).map(p -> p.substring(1))
                .collect(Collectors.toList());
        System.out.println(list2);

//		filter()
        List list3 = list1.stream().filter(p -> !p.isEmpty()).collect(Collectors.toList());
        System.out.println(list3);

//		limit()方法用于获取指定数量的流
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

    }


    //给出一个String类型的数组，找出其中所有不重复的素数
    public void distinctPrimary(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        List<Integer> r = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> Primes.isPrime(e))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctPrimary result is: " + r);
    }

    //给出一个String类型的数组，找出其中各个素数，并统计其出现次数
    public void primaryOccurrence(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        Map<Integer, Integer> r = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> Primes.isPrime(e))
                .collect(Collectors.groupingBy(p -> p, Collectors.summingInt(p -> 1)));
        System.out.println("primaryOccurrence result is: " + r);
    }


    //给出一个String类型的数组，求其中所有不重复素数的和
    public void distinctPrimarySum(String... numbers) {
        List<String> l = Arrays.asList(numbers);
        int sum = l.stream()
                .map(e -> new Integer(e))
                .filter(e -> Primes.isPrime(e))
                .distinct()
                .reduce(0, (x, y) -> x + y); // equivalent to .sum()
        System.out.println("distinctPrimarySum result is: " + sum);
    }

    // 统计年龄在25-35岁的男女人数、比例
    public void boysAndGirls(List<Person> persons) {
        Map<Integer, Integer> result = persons.parallelStream().filter(p ->
                p.getAge() >= 25 && p.getAge() <= 35).
                collect(Collectors.groupingBy(p -> p.getSex(), Collectors.summingInt(p -> 1)));
        System.out.print("boysAndGirls result is " + result);
        System.out.println(", ratio (male : female) is " + (float) result.get
                (Person.MALE) / result.get(Person.FEMALE));
    }


}


























