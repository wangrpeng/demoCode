package com.example.mode.visitor;

import java.io.File;

/**
 * @author SimonWang
 * @Description  我们需要定义访问者接口，即该访问者能够干的事情：
 * @create 2020-05-12 10:00
 */
public interface Visitor {


    void visitDir(File dir);

    void VisitFile(File file);
}
