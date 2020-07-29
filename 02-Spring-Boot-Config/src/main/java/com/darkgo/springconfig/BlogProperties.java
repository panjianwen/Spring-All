package com.darkgo.springconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName BlogProperties
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@Component
public class BlogProperties {
    @Value("${blog.name}")
    private String name;
    @Value("${blog.title}")
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
