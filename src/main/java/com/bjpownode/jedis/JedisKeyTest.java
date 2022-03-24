package com.bjpownode.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisKeyTest {
    public static void main(String[] args) {
        //连接redis
        Jedis jedis = new Jedis("192.168.62.128",6379);
        String ret = jedis.ping();
        System.out.println(ret);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
        String set = jedis.set("k1", "v1");
        System.out.println(set);
        String k1 = jedis.get("k1");
        System.out.println(k1);

    }
}
