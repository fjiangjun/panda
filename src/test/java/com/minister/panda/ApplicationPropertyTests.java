package com.minister.panda;

import com.minister.panda.property.BlogProperties;
import com.minister.panda.property.RandomSeq;
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
 * @Date 2018/3/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationPropertyTests {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private RandomSeq randomSeq;
    @Test
    public void getHello() throws Exception{
        Assert.assertEquals(blogProperties.getName(),"fjiangjun");
        Assert.assertEquals(blogProperties.getEmail(),"liq@live.cn");

        System.out.println("random String:"+randomSeq.getStringValue());
        System.out.println("random int:"+randomSeq.getIntValue());
        System.out.println("random long:"+randomSeq.getLongValue());
        System.out.println("random limitInt:"+randomSeq.getLimitIntValue());
    }
}
