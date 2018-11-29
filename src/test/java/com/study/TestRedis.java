package com.study;


import com.study.model.User;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.SerializeUtils;
import org.junit.Test;

/**
 * Created by yangqj on 2018/1/13.
 */
public class TestRedis {
    /*
    @Test
    public void test(){
        RedisManager redisManager = new RedisManager();
        redisManager.init();

        User user = new User();
        user.setId(2);
        user.setUsername("admin");
        user.setPassword("3esdfffdsdfergfwdfdsfsdfewer");
        user.setEnable(1);
        byte[] serialize = SerializeUtils.serialize(user);
        redisManager.set(serialize,"testvalue".getBytes());
    }

    @Test
    public void test2(){
        RedisManager redisManager = new RedisManager();
        redisManager.init();
        User user = new User();
        user.setId(2);
        user.setUsername("admin");
        user.setPassword("3esdfffdsdfergfwdfdsfsdfewer");
        user.setEnable(1);
        byte[] serialize = SerializeUtils.serialize(user);
        redisManager.del(serialize);
    }

     */

    @Test
    public void test3(){
        RedisManager redisManager=new RedisManager();
        redisManager.init();
        User user=new User();
        user.setId(22);
        user.setUsername("ceshi002");
        user.setPassword("3c57596331a9378c06b5c1a464c10d7b");
        user.setEnable(1);
        byte[] serialize = SerializeUtils.serialize(user);
        redisManager.del(serialize);

    }
}
