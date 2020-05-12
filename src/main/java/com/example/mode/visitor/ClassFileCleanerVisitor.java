package com.example.mode.visitor;

import java.io.File;

/**
 * @author SimonWang
 * @Description 如果要清理.class文件，可以再写一个ClassFileClearnerVisitor：
 * @create 2020-05-12 10:07
 */
public class ClassFileCleanerVisitor implements Visitor{

    @Override
    public void visitDir(File dir) {
        System.out.println("ClassFileCleanerVisitor dir");
    }

    @Override
    public void VisitFile(File file) {
        if (file.getName().endsWith(".class")) {
            System.out.println("Will clean class file: " + file);
        }
    }
}
