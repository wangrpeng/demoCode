package com.example.jsonTest;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import de.ailis.pherialize.Mixed;
import de.ailis.pherialize.MixedArray;
import de.ailis.pherialize.Pherialize;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class GetMenuArray {

    public String evaluate(String input) {

        // If the value is null, return a null
        if (StringUtils.isEmpty(input)) return null;

        MixedArray mixedArray;

        mixedArray = Pherialize.unserialize(input).toArray();

        JSONArray jsonArray = getMixedArrays(mixedArray);

        return jsonArray.toJSONString();
    }

    private JSONArray getMixedArrays(MixedArray mixedArray) {
        JSONArray jsonArray = new JSONArray();
        for (Object key1 : mixedArray.keySet()) {
            Mixed mix = mixedArray.getMixed(key1);
            if (mix != null) {
                MixedArray arr = mix.toArray();
                for (Object key2 : arr.keySet()) {
                    Mixed value = arr.getMixed(key2);
                    String jsonString = getJSONString(value);
                    jsonArray.add(jsonString);
                }
            }
        }
        return jsonArray;
    }

    private String getJSONString(Mixed value) {
        MixedArray arr = value.toArray();
        String title = arr.containsKey("title") ? arr.getString("title") : "";
        String itemId = arr.containsKey("item") ? arr.getString("item") : "";
        int id = arr.containsKey("id") ? arr.getInt("id") : 0;
        String cid = arr.containsKey("cid") ? arr.getString("cid") : "";
        String keyword = arr.containsKey("tab_keyword") ? arr.getString("tab_keyword") : "";

        Menu menu = new Menu();
//        menu.setId(id);
//        menu.setTitle(title);
//        menu.setItemId(itemId);
//        menu.setCid(cid);
//        menu.setKeyword(keyword);

        String jsonString = JSON.toJSONString(menu);
        return jsonString;
    }

    public static void main(String[] args) {
        /*String data = "a:1:{i:1;a:9:{i:1;a:26:{s:2:\"id\";s:1:\"1\";s:5:\"title\";s:6:\"推荐\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:7:\"#e22400\";s:5:\"act_c\";s:7:\"#FFFFFF\";s:3:\"d_c\";s:7:\"#FD9480\";s:5:\"act_p\";s:52:\"/bao/171101/7/e/59f9175a8150a14eb3621b87_240x120.png\";s:3:\"d_p\";s:52:\"/bao/171101/7/e/59f9175a8150a14eb3621b87_240x120.png\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";s:1:\"2\";s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:8:\"xcx_home\";s:4:\"type\";i:1;s:4:\"item\";s:8:\"xcx_home\";s:7:\"ys_cate\";i:1;s:10:\"tab_search\";s:1:\"2\";s:11:\"tab_keyword\";s:0:\"\";s:15:\"tab_search_logo\";s:0:\"\";s:9:\"tab_color\";s:0:\"\";s:11:\"tab_message\";s:1:\"1\";s:12:\"tab_category\";s:1:\"1\";s:13:\"tab_cate_type\";s:1:\"1\";s:12:\"tab_cate_url\";s:0:\"\";}i:2;a:18:{s:2:\"id\";i:2;s:5:\"title\";s:6:\"女装\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:12:\"xcx_nvzhuang\";s:4:\"type\";i:1;s:4:\"item\";s:12:\"xcx_nvzhuang\";s:7:\"ys_cate\";i:1;}i:3;a:18:{s:2:\"id\";i:3;s:5:\"title\";s:6:\"鞋包\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:10:\"xcx_xiebao\";s:4:\"type\";i:1;s:4:\"item\";s:10:\"xcx_xiebao\";s:7:\"ys_cate\";i:1;}i:4;a:18:{s:2:\"id\";i:4;s:5:\"title\";s:6:\"居家\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:9:\"xcx_jujia\";s:4:\"type\";i:1;s:4:\"item\";s:9:\"xcx_jujia\";s:7:\"ys_cate\";i:1;}i:5;a:18:{s:2:\"id\";i:5;s:5:\"title\";s:12:\"家电数码\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:16:\"xcx_jiadianshuma\";s:4:\"type\";i:1;s:4:\"item\";s:16:\"xcx_jiadianshuma\";s:7:\"ys_cate\";i:1;}i:6;a:18:{s:2:\"id\";i:6;s:5:\"title\";s:6:\"男士\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:10:\"xcx_nanshi\";s:4:\"type\";i:1;s:4:\"item\";s:10:\"xcx_nanshi\";s:7:\"ys_cate\";i:1;}i:7;a:18:{s:2:\"id\";i:7;s:5:\"title\";s:6:\"母婴\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:10:\"xcx_muying\";s:4:\"type\";i:1;s:4:\"item\";s:10:\"xcx_muying\";s:7:\"ys_cate\";i:1;}i:8;a:18:{s:2:\"id\";i:8;s:5:\"title\";s:6:\"美妆\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:13:\"xcx_meizhuang\";s:4:\"type\";i:1;s:4:\"item\";s:13:\"xcx_meizhuang\";s:7:\"ys_cate\";i:1;}i:9;a:18:{s:2:\"id\";i:9;s:5:\"title\";s:6:\"美食\";s:8:\"act_bg_c\";s:0:\"\";s:6:\"d_bg_c\";s:0:\"\";s:5:\"act_c\";s:0:\"\";s:3:\"d_c\";s:0:\"\";s:5:\"act_p\";s:0:\"\";s:3:\"d_p\";s:0:\"\";s:3:\"url\";s:0:\"\";s:9:\"show_type\";i:2;s:8:\"sale_img\";s:0:\"\";s:8:\"sel_type\";s:1:\"7\";s:7:\"ys_type\";s:1:\"1\";s:7:\"content\";s:0:\"\";s:3:\"cid\";s:10:\"xcx_meishi\";s:4:\"type\";i:1;s:4:\"item\";s:10:\"xcx_meishi\";s:7:\"ys_cate\";i:1;}}}\n";


        GetMenuArray menu = new GetMenuArray();
        String res = menu.evaluate(data);
        System.out.println(res);*/

        String data = "a:3:{i:0;s:8:\"A string\";i:1;i:12345;i:2;b:1;}";

        String attr = "a:10:{s:8:\"image_b1\";s:0:\"\";s:8:\"image_b2\";s:0:\"\";s:8:\"image_b3\";s:0:\"\";s:8:\"image_b4\";s:0:\"\";s:8:\"image_s1\";s:0:\"\";s:8:\"image_s2\";s:0:\"\";s:8:\"image_s3\";s:0:\"\";s:8:\"image_s4\";s:0:\"\";s:5:\"video\";s:0:\"\";s:5:\"audio\";s:0:\"\";}\"";

//        StringBuilder stringBuilder = new StringBuilder(attr);
//        stringBuilder.insert(stringBuilder.indexOf("image_b1"), "\"");
//        System.out.println(attr.indexOf("image_b1"));
//        System.out.println(stringBuilder.indexOf("image_b1"));
        System.out.println(attr.charAt(0));

        if (attr.indexOf("\"") == 0) attr = attr.substring(1, attr.length());
        if (attr.lastIndexOf("\"") == (attr.length() - 1)) attr = attr.substring(0, attr.length() - 1);
        MixedArray list = Pherialize.unserialize(attr).toArray();


        System.out.println(list.get("audio"));

        Map<String, Object> paramsAttr = new HashMap<>();
        paramsAttr.put("image_b1", "");
        paramsAttr.put("image_b2", "");
        paramsAttr.put("image_b3", "");
        paramsAttr.put("image_b4", "");
        paramsAttr.put("image_s1", "");
        paramsAttr.put("image_s2", "");
        paramsAttr.put("image_s3", "");
        paramsAttr.put("image_s4", "");
        paramsAttr.put("video", "");
        paramsAttr.put("audio", "");
        System.out.println("serialize::" + Pherialize.serialize(paramsAttr));


        MixedArray list2 = Pherialize.unserialize(Pherialize.serialize(paramsAttr) + " ' ").toArray();


        String str = "/mix/json//2/";
        System.out.println(JSON.toJSONString(str.split(".html")[0].split("/")));

    }
}