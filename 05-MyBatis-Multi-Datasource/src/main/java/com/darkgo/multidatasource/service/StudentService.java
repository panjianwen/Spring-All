package com.darkgo.multidatasource.service;


import com.darkgo.multidatasource.Student;

import java.util.List;
import java.util.Map;

/**
 * @ClassName Service
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
public interface StudentService {
    List<Map<String, Object>> queryAllStudents();

}
