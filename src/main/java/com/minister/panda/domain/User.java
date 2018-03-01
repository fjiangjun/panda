package com.minister.panda.domain;/**
 * Created by liq on 2018/3/1.
 */

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author liqing
 * @fileName User.java
 * @email liq@live.cn
 * @create 2018-03-01 23:51
 * @Description
 **/
public class User {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this);
        return builder.toString();
    }
}
