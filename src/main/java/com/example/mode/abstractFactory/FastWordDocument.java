package com.example.mode.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-12 11:47
 */
public class FastWordDocument implements WordDocument {
    @Override
    public void save(Path path) throws IOException {
        // ...
    }
}
