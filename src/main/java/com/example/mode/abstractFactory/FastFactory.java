package com.example.mode.abstractFactory;

/**
 * @author SimonWang
 * @Description FastDoc Soft必须提供一个实际的工厂来生产这两种产品，即FastFactory：
 * @create 2020-05-12 11:10
 */
public class FastFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }

    @Override
    public WordDocument createDoc(String md) {
        return new FastWordDocument();
    }
}
