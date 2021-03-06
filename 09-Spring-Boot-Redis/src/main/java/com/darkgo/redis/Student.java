package com.darkgo.redis;

import org.springframework.cache.annotation.CacheConfig;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@CacheConfig(cacheNames = "student")
public class Student implements Serializable {
    private int id;
    private String name;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
