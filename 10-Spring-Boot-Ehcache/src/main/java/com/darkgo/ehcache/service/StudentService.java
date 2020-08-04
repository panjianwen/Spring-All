package com.darkgo.ehcache.service;


import com.darkgo.ehcache.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * @ClassName Service
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@CacheConfig(cacheNames = "student")
public interface StudentService {

    int add(Student student);
    @CachePut(key = "#p0")
    int update(Student student);
    int deleteBysno(int id);
    @Cacheable(key = "#p0")
    Student queryStudentBySno(int id);
}
