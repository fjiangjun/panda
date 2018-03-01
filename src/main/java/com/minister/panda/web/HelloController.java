package com.minister.panda.web;/**
 * Created by liq on 2018/3/1.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liqing
 * @fileName HelloController.java
 * @email liq@live.cn
 * @create 2018-03-01 23:31
 * @Description
 **/
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "fjiangjun");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
