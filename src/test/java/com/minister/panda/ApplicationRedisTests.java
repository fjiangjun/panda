package com.minister.panda;

import com.minister.panda.redis.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/7
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationRedisTests {
    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {

        // 保存对象
        User user = new User("Iriya", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new User("Alice", 21);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new User("Karoline", 22);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new User("Elaine", 23);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        Assert.assertEquals(20, redisTemplate.opsForValue().get("Iriya").getAge().longValue());
        Assert.assertEquals(21, redisTemplate.opsForValue().get("Alice").getAge().longValue());
        Assert.assertEquals(22, redisTemplate.opsForValue().get("Karoline").getAge().longValue());
        Assert.assertEquals(23, redisTemplate.opsForValue().get("Elaine").getAge().longValue());

        System.out.println(redisTemplate.opsForValue().get("Iriya").getUsername());
        System.out.println(redisTemplate.opsForValue().get("Alice").getUsername());
        System.out.println(redisTemplate.opsForValue().get("Karoline").getUsername());
        System.out.println(redisTemplate.opsForValue().get("Elaine").getUsername());

        System.out.println(redisTemplate.opsForValue().get("Iriya").getAge());
        System.out.println(redisTemplate.opsForValue().get("Alice").getAge());
        System.out.println(redisTemplate.opsForValue().get("Karoline").getAge());
        System.out.println(redisTemplate.opsForValue().get("Elaine").getAge());

    }
}
