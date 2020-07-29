package com.darkgo.springconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName BlogBean
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@ConfigurationProperties(prefix = "blog")
public class BlogBean {
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
