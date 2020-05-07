package com.example.spider;

import java.io.IOException;
import java.util.List;

/**
 * @Author: Simon.Wang
 * @Date: 2019/12/20 12:04
 * @Describe:
 */
public class Test {

    /**
     * 使用百度新闻，只设置url和关键字与返回类型
     */
    @org.junit.Test
    public void getDatasByCssQueryUserBaidu() throws IOException {
        Rule rule = new Rule("http://search.jd.com/Search",
                new String[]{"keyword", "enc"}, new String[]{"玫瑰精油", "utf-8"},
                "J_im_icon", -1, Rule.GET);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    @org.junit.Test
    public void getDatasByClass() throws IOException {
        Rule rule = new Rule(
                "http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery",
                new String[]{"query.enterprisename", "query.registationnumber"}, new String[]{"兴网", ""},
                "cont_right", Rule.CLASS, Rule.POST);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    @org.junit.Test
    public void getDatasByCssQuery() throws IOException {
        Rule rule = new Rule("http://www.11315.com/search",
                new String[]{"name"}, new String[]{"兴网"},
                "div.g-mn div.con-model", Rule.SELECTION, Rule.GET);
        List<LinkTypeData> extracts = ExtractService.extract(rule);
        printf(extracts);
    }

    public void printf(List<LinkTypeData> datas) {
        for (LinkTypeData data : datas) {
            System.out.println(data.getLinkText());
            System.out.println(data.getLinkHref());
            System.out.println("***********************************");
        }

    }
}