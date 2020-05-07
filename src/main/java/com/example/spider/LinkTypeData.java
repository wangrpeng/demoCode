package com.example.spider;

import lombok.Data;

/**
 * @Author: Simon.Wang
 * @Date: 2019/12/20 11:54
 * @Describe:
 */
@Data
public class LinkTypeData {
    private int id;
    /**
     * 链接的地址
     */
    private String linkHref;
    /**
     * 链接的标题
     */
    private String linkText;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 内容
     */
    private String content;

}