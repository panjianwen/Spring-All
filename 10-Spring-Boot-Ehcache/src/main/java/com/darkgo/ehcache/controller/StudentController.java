package com.darkgo.ehcache.controller;

import com.darkgo.ehcache.Student;
import com.darkgo.ehcache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StudentController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/queryStudent",method = RequestMethod.GET)
    public Student queryStudentById(int id){
        return studentService.queryStudentBySno(id);
    }
}
