package com.darkgo.multidatasource.controller;

import com.darkgo.multidatasource.Student;
import com.darkgo.multidatasource.service.ClusterStudentService;
import com.darkgo.multidatasource.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MasterStudentController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/30
 * @Version V1.0
 **/
@RestController
@Slf4j
public class MasterStudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    ClusterStudentService clusterStudentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String queryAllStudents(){
        return studentService.queryAllStudents().toString();
    }

    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public String queryClusterAllStudents(){
        return clusterStudentService.queryAllStudents().toString();
    }
}
