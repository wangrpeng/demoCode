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

        public static final Object parse(String text);
        public static final JSONObject parseObject(String text)
        public static final <T> T parseObject(String text, Class<T> clazz);
        public static final JSONArray parseArray(String text);
        public static final <T> List<T> parseArray(String text, Class<T> clazz);
        public static final String toJSONString(Object object);
        public static final String toJSONString(Object object, boolean prettyFormat);
        public static final Object toJSON(Object javaObject);
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
