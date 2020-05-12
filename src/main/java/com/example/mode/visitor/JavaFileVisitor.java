package com.example.mode.visitor;

import java.io.File;

/**
 * @author SimonWang
 * @Description 我们就把访问者的行为抽象出来了。如果我们要实现一种操作，例如，查找.java文件，就传入JavaFileVisitor：
 * @create 2020-05-12 10:06
 */
public class JavaFileVisitor implements Visitor{
    @Override
    public void visitDir(File dir) {
        System.out.println("Visit dir: " + dir);
    }

    @Override
    public void VisitFile(File file) {
        if (file.getName().endsWith(".java")) {
            System.out.println("Found java file: " + file);
        }
    }
}
