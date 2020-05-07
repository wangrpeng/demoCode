package com.example.jsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;
import java.util.Map;

public class JsonDemo {

    Object object;
    Writer writer;
    OutputStream os;
    String jsonStr;
    List list;
    Map map;


    @Test
    public void test01() throws IOException {

/*

        public static final Object parse(String text); // ��JSON�ı�parseΪJSONObject����JSONArray
        public static final JSONObject parseObject(String text)�� // ��JSON�ı�parse��JSONObject
        public static final <T> T parseObject(String text, Class<T> clazz); // ��JSON�ı�parseΪJavaBean
        public static final JSONArray parseArray(String text); // ��JSON�ı�parse��JSONArray
        public static final <T> List<T> parseArray(String text, Class<T> clazz); //��JSON�ı�parse��JavaBean����
        public static final String toJSONString(Object object); // ��JavaBean���л�ΪJSON�ı�
        public static final String toJSONString(Object object, boolean prettyFormat); // ��JavaBean���л�Ϊ����ʽ��JSON�ı�
        public static final Object toJSON(Object javaObject); ��JavaBeanת��ΪJSONObject����JSONArray��
*/

        //List -> JSON array
        String jsonStr1 = JSON.toJSONString(list, true);
        //JSON array -> List
        JSONArray jsonArr = JSON.parseArray(jsonStr1);


        //Map -> JSON
        String jsonStr2 = JSON.toJSONString(map, true);
        //JSON -> Map
        map = (Map) JSON.parse(jsonStr2);


    }
}
