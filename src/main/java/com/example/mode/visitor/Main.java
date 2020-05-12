package com.example.mode.visitor;

import java.io.File;

/**
 * @author SimonWang
 * @Description 访问者模式 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 访问者模式是为了抽象出作用于一组复杂对象的操作，并且后续可以新增操作而不必对现有的对象结构做任何改动。
 * @create 2020-05-12 10:07
 */
public class Main {
    public static void main(String[] args) {
        new FileStructure(new File("D:\\log")).handle(new JavaFileVisitor());
        new FileStructure(new File("D:\\log")).handle(new ClassFileCleanerVisitor());

    }
}
