package com.example.mode.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author SimonWang
 * @Description 抽象产品
 * @create 2020-05-12 11:07
 */
public interface WordDocument {
    void save(Path path) throws IOException;
}
