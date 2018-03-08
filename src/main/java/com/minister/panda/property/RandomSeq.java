package com.minister.panda.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/8
 */

@Component
public class RandomSeq {
    @Value("${com.minister.panda.value}")
    private String stringValue;
    @Value("${com.minister.panda.int}")
    private int intValue;
    @Value("${com.minister.panda.long}")
    private long longValue;
    @Value("${com.minister.panda.limitInt}")
    private int limitIntValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public int getLimitIntValue() {
        return limitIntValue;
    }

    public void setLimitIntValue(int limitIntValue) {
        this.limitIntValue = limitIntValue;
    }
}
