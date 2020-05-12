package com.example.base;

public class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public Pair(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        first = clazz.newInstance();
        last = clazz.newInstance();
    }

    // 对静态方法使用<K>: 此处定义的<K> 和类的泛型没有关系
    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }
}