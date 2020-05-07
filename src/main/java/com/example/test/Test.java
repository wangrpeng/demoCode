package com.example.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.xml.stream.FactoryConfigurationError;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: Simon.Wang
 * @Date: 2019/11/14 9:19
 * @Describe:
 */
public class Test {
    public static void main(String[] args) {
        //java反序列化 php serialize方法得到的数据
/*
        String str = "a:10:{s:8:\"image_b1\";s:0:\"\";s:8:\"image_s2\";s:0:\"\";s:8:\"image_s1\";s:0:\"\";s:8:\"image_b4\";s:0:\"\";s:8:\"image_b3\";s:0:\"\";s:8:\"image_s4\";s:0:\"\";s:8:\"image_b2\";s:0:\"\";s:8:\"image_s3\";s:0:\"\";s:5:\"video\";s:0:\"\";s:5:\"audio\";s:0:\"\";}";
        MixedArray mixedArray = Pherialize.unserialize(str).toArray();
*/


        // fixme 不能遍历时候remove
       /* List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list);*/

        // 自定义线程名称
        /*UserThreadFactory factory = new UserThreadFactory("my");
        factory.newThread(() -> {});*/

        Map<String, Object> map = new HashMap<>();

        String paramStr = map.entrySet().stream()
                .map(ent -> ent.getKey().concat("=").concat(ent.getValue() + ""))
                .collect(Collectors.joining(""));


/*
        JSONArray jsonArray = JSONArray.parseArray("[{\"riskCode\":8,\"riskCodeValue\":3},{\"riskCode\":503,\"riskCodeValue\":1}]");
        jsonArray.toJavaList(Map.class).forEach(item -> {
            System.out.println(item.get("riskCode") +" : " + item.get("riskCodeValue"));;
        });
*/


        String code = "\":{\"identify\":\"525\",\"create\":\"525\"}";

        System.out.println(JSON.toJSONString(code));


        String serverName = "https://admin.futongtouzi.net";
        serverName = "localhost";
        serverName = "192.0.0.1";

        System.out.println(serverName.indexOf("."));
        System.out.println(serverName.substring(serverName.indexOf(".") + 1));


    }

}

