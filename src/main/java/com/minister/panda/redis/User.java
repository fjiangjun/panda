package com.minister.panda.redis;

import java.io.Serializable;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/7
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1L;
    private String username;
    private Integer age;
    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
