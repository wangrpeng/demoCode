package com.example.mode.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author SimonWang
 * @Description 抽象产品
 * @create 2020-05-12 11:06
 */
public interface HtmlDocument {
    String toHtml();
    void save(Path path) throws IOException;
}
