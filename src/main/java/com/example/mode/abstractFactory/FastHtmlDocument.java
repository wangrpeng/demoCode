package com.example.mode.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author SimonWang
 * @Description FastHtmlDocument 具体产品实现
 * @create 2020-05-12 11:09
 */
public class FastHtmlDocument implements HtmlDocument {

    private String md;
    FastHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        return "FastHtmlDocument 具体产品实现 : " + md;
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
