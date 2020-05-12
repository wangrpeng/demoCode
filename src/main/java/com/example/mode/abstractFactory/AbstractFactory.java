package com.example.mode.abstractFactory;

/**
 * @author SimonWang
 * @Description 假设我们希望为用户提供一个Markdown文本转换为HTML和Word的服务，它的接口定义如下：
 * @create 2020-05-12 11:05
 */
public interface AbstractFactory {
    HtmlDocument createHtml(String md);

    WordDocument createDoc(String md);

    public static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
