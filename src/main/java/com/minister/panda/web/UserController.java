package com.minister.panda.web;/**
 * Created by liq on 2018/3/2.
 */

import com.minister.panda.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author liqing
 * @fileName UserController.java
 * @email liq@live.cn
 * @create 2018-03-02 0:02
 * @Description
 **/

@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {

    //create synchronzied map
    static Map<Long,User> users = Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value="/",method= RequestMethod.GET)
    public List<User> getUserList(){
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }



























}
