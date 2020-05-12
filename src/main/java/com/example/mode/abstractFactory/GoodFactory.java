package com.example.mode.abstractFactory;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-12 11:51
 */
public class GoodFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return null;
    }

    @Override
    public WordDocument createDoc(String md) {
        return null;
    }
}
