package com.wlhse.util;

import redis.clients.jedis.Jedis;

/**
 * @Author:
 * @Despriction:
 * @Data: 2018/11/15 11:21
 */
public class JedisUtil {
    //    设置ip地址和端口号：
    public void putJedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("abc", "123");
    }

    public void getJedis() {
        Jedis jedis = null;
        try {
            jedis = new Jedis("127.0.0.1", 6379);
            System.out.println(jedis.get("abc"));
        } finally {
            jedis.close();
        }
    }


}
