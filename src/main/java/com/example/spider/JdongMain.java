package com.example.spider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.List;

public class JdongMain {
    //log4j的是使用，不会的请看之前写的文章
    static final Log logger = LogFactory.getLog(JdongMain.class);

    public static void main(String[] args) throws Exception {
        //初始化一个httpclient
        HttpClient client = new DefaultHttpClient();
        //我们要爬取的一个地址，这里可以从数据库中抽取数据，然后利用循环，可以爬取一个URL队列
        String url = "http://www.baidu.com";
        //抓取的数据
        List<JdModel> bookdatas = URLFecter.URLParser(client, url);
        //循环输出抓取的数据
        for (JdModel jd : bookdatas) {
            logger.info("bookID:" + jd.getBookID() + "\t" + "bookPrice:" + jd.getBookPrice() + "\t" + "bookName:" + jd.getBookName());
        }
        //将抓取的数据插入数据库
        System.out.println(bookdatas);
    }
}