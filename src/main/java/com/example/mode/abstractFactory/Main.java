package com.example.mode.abstractFactory;

import sun.security.smartcardio.SunPCSC;

/**
 * @author SimonWang
 * @Description 抽象工厂
 *  提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *  抽象工厂模式和工厂方法不太一样，它要解决的问题比较复杂，不但工厂是抽象的，产品是抽象的，
 *  而且有多个产品需要创建，因此，这个抽象工厂会对应到多个实际工厂，每个实际工厂负责创建多个实际产品：
 *  小结
 * 抽象工厂模式是为了让创建工厂和一组产品与使用相分离，并可以随时切换到另一个工厂以及另一组产品；
 * 抽象工厂模式实现的关键点是定义工厂接口和产品接口，但如何实现工厂与产品本身需要留给具体的子类实现，客户端只和抽象工厂与抽象产品打交道。
 * @create 2020-05-12 11:00
 */
public class Main {
    public static void main(String[] args) {
        //    我们就可以使用FastDoc Soft的服务了。客户端编写代码如下：
        AbstractFactory factory = new FastFactory();
        HtmlDocument htmlDocument = factory.createHtml("hello");
        htmlDocument.toHtml();

        //如果我们要同时使用GoodDoc Soft的服务怎么办？因为用了抽象工厂模式，
        // GoodDoc Soft只需要根据我们定义的抽象工厂和抽象产品接口，实现自己的实际工厂和实际产品即可：
        //实际工厂: GoodFactory implements AbstractFactory
        // 实际产品 : GoodHtmlDocument   GoodWordDocument

//       如果把创建工厂的代码放到AbstractFactory中，就可以连实际工厂也屏蔽了：



    }




}
