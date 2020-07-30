package com.darkgo.mybatis.service;

import com.darkgo.mybatis.Student;

/**
 * @ClassName Service
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/29
 * @Version V1.0
 **/
public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(int id);
    Student queryStudentBySno(int id);
}
