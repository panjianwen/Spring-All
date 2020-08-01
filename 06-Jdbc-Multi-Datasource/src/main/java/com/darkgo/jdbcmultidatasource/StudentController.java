package com.darkgo.jdbcmultidatasource;

import com.darkgo.jdbcmultidatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName StudentController
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Map<String, Object>> getAllStudents() {
        return studentService.getAllStudentsFromMaster();
    }


    @RequestMapping(value = "/cluster",method = RequestMethod.GET)
    public List<Map<String, Object>> getAllStudentsFromCluster() {
        return studentService.getAllStudentsFromCluster();
    }
}
