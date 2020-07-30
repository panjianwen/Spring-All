package com.darkgo.jdbctemplate.controller;

import com.darkgo.jdbctemplate.Student;
import com.darkgo.jdbctemplate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StudentController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int add(String name,String gender){
        return studentService.add(new Student(name,gender));
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(){
        Student student = new Student();
        student.setId(1);
        return studentService.update(student);
    }

    @RequestMapping(value = "/queryStudentById",method = RequestMethod.GET)
    public Student queryStudentById(int id){
        return studentService.queryStudentById(id);
    }

    @RequestMapping(value = "/deleteById",method = RequestMethod.GET)
    public int deleteById(int id){
        return studentService.deleteById(id);
    }

}
