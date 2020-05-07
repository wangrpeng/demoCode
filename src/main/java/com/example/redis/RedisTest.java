package com.example.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RedisConfig.class})
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testRedisObj() {
        /*
        Map<String, Object> properties = new HashMap<>();
        properties.put("123", "hello");
        properties.put("abc", 456);

        String key = "hello";
        String value = "world";

        Map<Object, Object> ans = redisTemplate.opsForHash().entries("hash");
        System.out.println("==================ans: " + ans);

        redisTemplate.opsForHash().putAll("hash", properties);
        redisTemplate.execute((RedisCallback<Object>) connection -> {
            connection.set(key.getBytes(), value.getBytes());
            return null;
        });

        String asn  = redisTemplate.execute( (RedisCallback<String>) connection -> {
            return String.valueOf(connection.get(key.getBytes()));
        });
        System.out.println(asn);

        String hkey = "hkey";
        redisTemplate.execute((RedisCallback<Object>) conn -> {
            conn.hSet(hkey.getBytes(), "23".getBytes(), "what".getBytes());
            return null;
        });
        Map<byte[], byte[]> map = redisTemplate.execute((RedisCallback<Map<byte[], byte[]>>) conn -> conn.hGetAll(hkey.getBytes()));
        for (Map.Entry<byte[], byte[]> entry : map.entrySet()) {
            System.out.println("key: " + new String(entry.getKey()) + " | value: " + new String(entry.getValue()));
        }*/
        System.out.println(redisTemplate);

    }
}