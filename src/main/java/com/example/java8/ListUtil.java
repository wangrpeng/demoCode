package com.example.java8;


import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * List通用操作类
 *
 * @author Alan.wu
 * @date 2015/3/10
 */
public class ListUtil {

    private static final Logger logger = LoggerFactory.getLogger(ListUtil.class);

    /**
     * list集合copy
     *
     * @param srcList
     * @param targetClazz
     * @return
     */
    public static <M> List<M> clone(List<?> srcList, Class<M> targetClazz) {
        if (srcList == null) {
            return null;
        }
        List<M> targetList = new ArrayList<M>();
        try {
            for (Object t : srcList) {
                M m = targetClazz.newInstance();
                PropertyUtils.copyProperties(m, t);
                targetList.add(m);
            }
        } catch (Exception e) {
            logger.error("", e);
            return null;
        }
        return targetList;
    }

    /**
     * 创建list
     *
     * @param objs
     * @return
     */
    @SafeVarargs
    public static <T> List<T> createList(T... objs) {
        List<T> result = new ArrayList<T>();
        for (T t : objs) {
            result.add(t);
        }
        return result;
    }

}
