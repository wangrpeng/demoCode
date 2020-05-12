package com.example.mode.decorator;

import java.io.IOException;

/**
 * 装饰者模式
 * 使用Decorator模式，可以独立增加核心功能，也可以独立增加附加功能，二者互不影响；
 * 可以在运行期动态地给核心功能增加任意个附加功能。
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        Decorator模式的目的就是把一个一个的附加功能，用Decorator的方式给一层一层地累加到原始数据源上
//        ，最终，通过组合获得我们想要的功能。
//        例如：给FileInputStream增加缓冲和解压缩功能，用Decorator模式写出来如下：
      /* InputStream input = new GZIPInputStream( // 第二层装饰
                new BufferedInputStream( // 第一层装饰
                        new FileInputStream("test.gz") // 核心功能
                ));*/

        //实现装饰者模式
        TextNode n2 =   new BoldDecorator(// 装饰加粗
                new UnderlineDecorator( // 装饰下划线
                        new SpanNode())); //spanNode 核心功能

        n2.setTextNode("hello");
        System.out.println(n2.getText());
    }
}
