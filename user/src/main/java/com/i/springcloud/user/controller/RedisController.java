package com.i.springcloud.user.controller;

import com.i.springcloud.user.entity.thread.ProductRunnable;
import com.i.springcloud.user.util.RedisUtil;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@RequestMapping("/redis/*")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("getRedisKeyValue")
    public String getRedisKeyValue(String key, String value){
        redisUtil.set(key,value);
        return redisUtil.get(key).toString();
    }

    public static void main(String[] args) {
        final String watchkeys = "watchkeys";
        ExecutorService executor = Executors.newFixedThreadPool(20);  //20个线程池并发数

        final Jedis jedis = new Jedis("192.168.29.128", 6379);
        jedis.auth("test123");
        jedis.set(watchkeys, "100");//设置起始的抢购数
        // jedis.del("setsucc", "setfail");
        jedis.close();

        for (int i = 0; i < 1000; i++) {//设置1000个人来发起抢购
            executor.execute(new ProductRunnable("user"+i));
        }
        executor.shutdown();
    }


    public static String getRandomString(int length) { //length是随机字符串长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
