package com.darkgo.springconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@RestController
public class IndexController {
    @Autowired
    BlogProperties blogProperties;

    @Autowired
    BlogBean blogBean;

    @RequestMapping("/")
    public String index() {
        return blogProperties.getName() + "--" + blogProperties.getTitle();
    }

    @RequestMapping("/blog")
    public String blog() {
        return blogBean.getName() + "--" + blogBean.getTitle();
    }
}
