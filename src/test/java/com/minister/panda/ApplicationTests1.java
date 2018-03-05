package com.minister.panda;

import com.minister.panda.dal.UserRepository;
import com.minister.panda.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/5
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests1 {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {

        // 创建10条记录
        userRepository.save(new User("AAA", (long)10, 99));
        userRepository.save(new User("BBB", (long)20, 99));
        userRepository.save(new User("CCC", (long)30, 99));
        userRepository.save(new User("DDD", (long)40, 99));
        userRepository.save(new User("EEE", (long)50, 99));
        userRepository.save(new User("FFF", (long)60, 99));
        userRepository.save(new User("GGG", (long)70, 99));
        userRepository.save(new User("HHH", (long)80, 99));
        userRepository.save(new User("III", (long)90, 99));
        userRepository.save(new User("JJJ", (long)100, 99));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());

        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());

        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepository.findAll().size());

    }


}
